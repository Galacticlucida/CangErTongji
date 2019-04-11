package cn.lyc.demo.controller;

import cn.lyc.demo.bean.PointItem;
import cn.lyc.demo.mapper.PointItemMapper;
import net.sf.json.JSONArray;
import net.sf.json.JsonConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@Controller
public class PointController {

    @Autowired
    PointItemMapper pointItemMapper;

    //插入所有遍历埋点数据
    @CrossOrigin
    @PostMapping("/insertPointItem")
    @ResponseBody
    public List insertClickInfo(@RequestBody String pointItemList) {
        JSONArray jsonArray = JSONArray.fromObject(pointItemList);
        List<PointItem> plist = JSONArray.toList(jsonArray, new PointItem(), new JsonConfig());
        pointItemMapper.insertPointItem(plist);
        return plist;
    }

    //修改埋点状态为0
    @CrossOrigin
    @PostMapping("/updatePointItem")
    @ResponseBody
    public void updatePointItem(@RequestParam("eq") int eq){
        pointItemMapper.updatePointItem(eq);
    }

    //修改埋点状态为1
    @CrossOrigin
    @PostMapping("/updatePointItemToOne")
    @ResponseBody
    public void updatePointItemToOne(@RequestParam("eq") int eq){
        pointItemMapper.updatePointItemToOne(eq);
    }

    //获取所有埋点元素
    @CrossOrigin
    @PostMapping("/getAllPointItem")
    @ResponseBody
    public List getAllPointItem(){
        return pointItemMapper.getAllPointItem();
    }

    //获取所有确定埋点元素
    @CrossOrigin
    @PostMapping("/getAllPointItemByState")
    @ResponseBody
    public List getAllPointItemByState(){
        return pointItemMapper.getAllPointItemByState();
    }

    //获取近7天所有埋点元素点击次数
    @CrossOrigin
    @PostMapping("/getAllPointItemClickCount")
    @ResponseBody
    public List getAllPointItemClickCount(){
        return pointItemMapper.getAllPointItemClickCountByday();
    }

    //获取单个埋点元素的具体点击次数
    @CrossOrigin
    @PostMapping("/getOnePointItemClickCountByday")
    @ResponseBody
    public List getOnePointItemClickCount(@RequestParam("id") int id,@RequestParam("day") String day){
        return pointItemMapper.getOnePointItemClickCountByday(id,day);
    }


}
