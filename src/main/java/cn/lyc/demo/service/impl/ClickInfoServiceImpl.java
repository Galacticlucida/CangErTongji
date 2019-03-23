package cn.lyc.demo.service.impl;


import cn.lyc.demo.bean.ClickInfo;

import cn.lyc.demo.service.ClickInfoService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ClickInfoServiceImpl implements ClickInfoService {

    @Override
    public List<ClickInfo> findAllBasicInfo(){
        return null;
    }

    @Override
    public void insertClickInfo(ClickInfo clickInfo) {

    }

    @Override
    public void deleteClickInfo(String u_name) {

    }

    @Override
    public void updateClickInfo(ClickInfo clickInfo) {

    }
}
