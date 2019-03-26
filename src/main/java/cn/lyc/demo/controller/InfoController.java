package cn.lyc.demo.controller;

import cn.lyc.demo.bean.BasicInfo;
import cn.lyc.demo.mapper.BasicInfoMapper;
import cn.lyc.demo.service.BasicInfoService;
import cn.lyc.demo.until.DataGrid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

@Controller
public class InfoController {
    @Autowired
    private BasicInfoService basicInfoService;


    private DataGrid dataGrid=DataGrid.getDataGrid();

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
        return basicInfoService.getInfoQuantity(startTime,endTime);

    }
//获取所有信息
    @CrossOrigin
    @GetMapping("/getAllInfo")
    @ResponseBody
    public List<BasicInfo> findAllBasicInfo(){
        List<BasicInfo> list=basicInfoService.findAllBasicInfo();
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
//获取近一周、一月、一年每天的用户数量
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

}
