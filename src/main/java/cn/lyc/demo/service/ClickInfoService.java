package cn.lyc.demo.service;

import cn.lyc.demo.bean.ClickInfo;

import java.util.List;

public interface ClickInfoService {
    public List<ClickInfo> findAllBasicInfo();
    public void insertClickInfo(ClickInfo clickInfo);
    public void deleteClickInfo(String u_name);
    public void updateClickInfo(ClickInfo clickInfo);
}
