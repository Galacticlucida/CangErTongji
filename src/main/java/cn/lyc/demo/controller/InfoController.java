package cn.lyc.demo.controller;

import cn.lyc.demo.bean.BasicInfo;
import cn.lyc.demo.mapper.BasicInfoMapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

@Controller
public class InfoController {
//    @Autowired
//    private BasicInfoService basicInfoService;
//
//
//    private DataGrid dataGrid=DataGrid.getDataGrid();

    @Autowired
    private BasicInfoMapper basicInfoMapper;


//    @Autowired
//    private ClickInfoMapper clickInfoMapper;

    @CrossOrigin
    @PostMapping("/getInfoQuantity")
    @ResponseBody
    public int getInfoQuantity(@PathVariable("stime") String stime,@PathVariable("etime") String etime){
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
        java.util.Date st=null;
        java.util.Date ed=null;
        try {
            st=sdf.parse(stime);
            ed=sdf.parse(etime);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        java.sql.Date startTime=new java.sql.Date(st.getTime());
        java.sql.Date endTime=new java.sql.Date(ed.getTime());
        System.out.println(startTime);
        return basicInfoMapper.getInfoQuantity(startTime,endTime);

    }
//获取所有信息
    @CrossOrigin
    @GetMapping("/getAllInfo")
    @ResponseBody
    public List<BasicInfo> findAllBasicInfo(){
        List<BasicInfo> list=basicInfoMapper.findAllBasicInfo();
        return list;
    }

//获取全年每个时段的用户数量
    @CrossOrigin
    @GetMapping("/getDataOfYear")
    @ResponseBody
    public List getDataOfYear(@RequestParam("year") String year){
        List list = basicInfoMapper.getInfoByYear(year);
        return list;
    }
//获取近一周、一月、一年每天的访问次数
    @CrossOrigin
    @GetMapping("/getDataOfDay")
    @ResponseBody
    public List getDataOfYDay(@RequestParam("day") String day){
        List list = basicInfoMapper.getInfoByDay(day);
        return list;
    }
//插入一条BasicInfo
    @GetMapping("/insertBasicInfo")
    @ResponseBody
    public BasicInfo insertBasicInfo(BasicInfo basicInfo){
        basicInfoMapper.insertBasicInfo(basicInfo);
        return basicInfo;
    }
//获取近一周、一月、一年每天的用户数量
    @CrossOrigin
    @GetMapping("/getUserCountByDay")
    @ResponseBody
    public List getUserCountByDay(@RequestParam("day") String day){
        List list = basicInfoMapper.getUserCountByDay(day);
        return list;
}
//获取近一周、一月、一年访客各种操作系统的数量
    @CrossOrigin
    @GetMapping("/getUserOsByDay")
    @ResponseBody
    public List getUserOsByDay(@RequestParam("day") String day){
        List list = basicInfoMapper.getUserOsByDay(day);
        return list;
}
//获取用户省份地域分布
    @CrossOrigin
    @GetMapping("/getCityOfUser")
    @ResponseBody
    public List getCityOfUser(){
    List list = basicInfoMapper.getCityOfUser();
    return list;
}
//获取近一周、一月、一年新用户数量
    @CrossOrigin
    @GetMapping("/getNewUserCountOfDay")
    @ResponseBody
    public List getNewUserCountOfDay(@RequestParam("day") String day){
        List list = basicInfoMapper.getNewUserCountOfDay(day);
        return list;
    }
//近七天,按在线时长查询
    @CrossOrigin
    @PostMapping("/getUserCountByTime")
    @ResponseBody
    public List getNewUserCountOfDay(@Param("top") int top,@Param("bottom")int bottom){
        List list=new ArrayList();
        for (;bottom>=0;top=top-10000,bottom=bottom-10000)
        {


//            System.out.println(top);
//            System.out.println("+");
//            System.out.println(bottom);
            int x=basicInfoMapper.getUserCountByTime(top,bottom);
//            System.out.println(x);
            list.add(x);

        }
        return list;
    }

      //  System.out.println(time);

//        for (int a=time.length-1,b=time.length-2;b>=0;a--,b--)
//        {
//
//            top=Integer.parseInt(time[a]);
//            bottom=Integer.parseInt(time[b]);
//        System.out.println(top);
//        System.out.println("+");
////        System.out.println(bottom);
//            int x=basicInfoMapper.getUserCountByTime(top,bottom);
//            System.out.println(x);
//            list.add(x);
//
//        }
        //            top=Integer.parseInt(time[a]);
//            bottom=Integer.parseInt(time[b]);

////插入所有遍历埋点数据
//@CrossOrigin
//    @GetMapping("/insertPointItem")
//    @ResponseBody
//    public ClickInfo insertClickInfo(ClickInfo clickInfo){
//        clickInfoMapper.insertClickInfo(clickInfo);
//        return clickInfo;
//    }


}
