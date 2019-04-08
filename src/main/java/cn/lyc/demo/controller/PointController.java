package cn.lyc.demo.controller;

import cn.lyc.demo.bean.PointItem;
import cn.lyc.demo.bean.PointList;
import cn.lyc.demo.mapper.PointItemMapper;
import cn.lyc.demo.service.PointItemService;
import cn.lyc.demo.until.JsonToList;
import cn.lyc.demo.until.MyJsonUtil;
import com.alibaba.fastjson.JSON;
import com.fasterxml.jackson.annotation.JsonBackReference;
import jdk.nashorn.internal.runtime.JSONFunctions;
import net.sf.json.JSONArray;
import net.sf.json.JsonConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class PointController {

    @Autowired
    PointItemMapper pointItemMapper;

//    @Autowired
//    PointItemService pointItemService;

////插入所有遍历埋点数据
//    @CrossOrigin
//    @PostMapping("/insertPointItem")
//    @ResponseBody
//    public List insertClickInfo(@RequestBody PointList pointItemList){
//       // pointItemService.insertPointItem(pointItemList);
////        PointItem pointItem1=new PointItem("news","新闻",1);
////        PointItem pointItem2=new PointItem("cartoon","卡通",1);
//      //  "pointItemList": [{"p_id":"news","p_name":"新闻","p_state":1},{"p_id":"cartoon","p_name":"卡通","p_state":1}]
////        List<PointItem> pointItemList1=new ArrayList<>();
////        pointItemList1.add(pointItem1);
////        pointItemList1.add(pointItem2);
//
////        for (PointItem pointItem : plist)
////        {
////           //pointItemMapper.insertPointItem(pointItem);
////            System.out.println(pointItem);
////        }
//        List<PointItem> plist= pointItemList.getPointItemList();
//        pointItemMapper.insertPointItem(plist);
//        return plist;
//    }
//插入所有遍历埋点数据
    @CrossOrigin
    @PostMapping("/insertPointItem")
    @ResponseBody
    public List insertClickInfo(@RequestBody String pointItemList){
        JSONArray jsonArray=JSONArray.fromObject(pointItemList);
        List<PointItem> plist=JSONArray.toList(jsonArray,new PointItem(),new JsonConfig());
        pointItemMapper.insertPointItem(plist);
        return plist;
   //     Map<String,Object> resultmap=new HashMap<>();
//        List<DeviceReturn> deviceReturns= app1.getPersons(jsonString, DeviceReturn.class);
 //       System.out.println(deviceReturns);
//        String toJsonString = JSON.toJSONString(deviceReturns);
//        System.out.println(toJsonString);
//        String jsonString = "[{'Value':'0','Name':'测试0','statusInfo':{'Status':'0'}}," +
//                "{'Value':'1','Name':'测试1','statusInfo':{'Status':'10'}},{'Value':'2','Name':'测试2'," +
//                "'statusInfo':{'Status':'20'}},{'Value':'3','Name':'测试3','statusInfo':{'Status':'30'}},{" +
//                "'Value':'4','Name':'测试4','statusInfo':{'Status':'40'}},{'Value':'5','Name':'测试5'," +
//                "'statusInfo':{'Status':'50'}},{'Value':'6','Name':'测试6','statusInfo':{'Status':'60'}}," +
//                "{'Value':'7','Name':'测试7','statusInfo':{'Status':'70'}},{'Value':'8','Name':'测试8'," +
//                "'statusInfo':{'Status':'80'}},{'Value':'9','Name':'测试9'," +
//                "'statusInfo':{'Status':'90'}}]";
//        System.out.println(pointItemList);
//        System.out.println("+");
 //       System.out.println(jsonString);
//        System.out.println("+");
//        JSONArray jsonArray= JSONArray.fromObject(pointItemList);
//String point= JSON.toJSONString(pointItemList);

   //     System.out.println(point);
//        List<PointItem> plist= JsonToList.getPersons(point,PointItem.class);
        // List<?> deviceReturns = JSONArray.toList(jsonArray,new DeviceReturn(), new JsonConfig());
        // System.out.println(point);
//        System.out.println(plist);
//        System.out.println("+");

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
