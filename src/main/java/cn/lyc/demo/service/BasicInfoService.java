package cn.lyc.demo.service;

import cn.lyc.demo.bean.BasicInfo;

import java.sql.Date;
import java.util.List;

public interface BasicInfoService {
    public List<BasicInfo> findAllBasicInfo();
    public void insertBasicInfo(BasicInfo basicInfo);
    public void deleteBasicInfo(String u_name);
    public void updateBasicInfo(BasicInfo basicInfo);
    public int getInfoQuantity(Date stime, Date etime);
    public int getAllInfoCount();

}
