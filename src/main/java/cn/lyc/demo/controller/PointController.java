package cn.lyc.demo.controller;

import cn.lyc.demo.bean.PointItem;
import cn.lyc.demo.bean.PointList;
import cn.lyc.demo.mapper.PointItemMapper;
import cn.lyc.demo.service.PointItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@Controller
public class PointController {

    @Autowired
    PointItemMapper pointItemMapper;

//    @Autowired
//    PointItemService pointItemService;

//插入所有遍历埋点数据
    @CrossOrigin
    @PostMapping("/insertPointItem")
    @ResponseBody
    public List insertClickInfo(@RequestBody PointList pointItemList){
       // pointItemService.insertPointItem(pointItemList);
//        PointItem pointItem1=new PointItem("news","新闻",1);
//        PointItem pointItem2=new PointItem("cartoon","卡通",1);
      //  "pointItemList": [{"p_id":"news","p_name":"新闻","p_state":1},{"p_id":"cartoon","p_name":"卡通","p_state":1}]
//        List<PointItem> pointItemList1=new ArrayList<>();
//        pointItemList1.add(pointItem1);
//        pointItemList1.add(pointItem2);

//        for (PointItem pointItem : plist)
//        {
//           //pointItemMapper.insertPointItem(pointItem);
//            System.out.println(pointItem);
//        }
        List<PointItem> plist= pointItemList.getPointItemList();
        pointItemMapper.insertPointItem(plist);
        return plist;
    }
//    //插入一条数据
//    @CrossOrigin
//    @PostMapping("/insertPointItem")
//    @ResponseBody
//    public PointItem insertClickInfo(PointItem pointItem) {
//        pointItemMapper.insertPointItem(pointItem);
//        return pointItem;
//    }
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
}
