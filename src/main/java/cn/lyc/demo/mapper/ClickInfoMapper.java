package cn.lyc.demo.mapper;

import cn.lyc.demo.bean.ClickInfo;

public interface ClickInfoMapper {
    public ClickInfo getClickInfoByName(String u_name);

    public void insertClickInfo(ClickInfo clickInfo);

    public void deleteClickInfo(String u_name);

    public void updateClickInfo(ClickInfo clickInfo);
}
