package cn.lyc.demo.mapper;

import cn.lyc.demo.bean.BasicInfo;
import java.sql.Date;
import java.util.List;



public interface BasicInfoMapper {
    public BasicInfo getBasicInfoByName(String u_name);

    public void insertBasicInfo(BasicInfo basicInfo);

    public void deleteBasicInfo(String u_name);

    public void updateBasicInfo(BasicInfo basicInfo);

    public List<BasicInfo> findAllBasicInfo();

    public int getInfoQuantity(Date stime,Date etime);

    public int getAllInfoCount();

    public List getInfoByYear(String year);

    public List getInfoByDay(String day);

    public List getUserCountByDay(String day);

    public List getUserOsByDay(String day);

    public List getCityOfUser();

    public List getNewUserCountOfDay(String day);

    public int getUserCountByTime(int top,int bottom);

}
