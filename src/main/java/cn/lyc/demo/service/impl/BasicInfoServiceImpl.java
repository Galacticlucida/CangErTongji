package cn.lyc.demo.service.impl;

import cn.lyc.demo.bean.BasicInfo;
import cn.lyc.demo.mapper.BasicInfoMapper;
import cn.lyc.demo.service.BasicInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.sql.Date;
import java.util.List;
@Service
public class BasicInfoServiceImpl implements BasicInfoService {
    @Resource
    BasicInfoMapper basicInfoMapper;

    @Override
    public List<BasicInfo> findAllBasicInfo() {
        return basicInfoMapper.findAllBasicInfo();
    }

    @Override
    public void insertBasicInfo(BasicInfo basicInfo) {
        basicInfoMapper.insertBasicInfo(basicInfo);
    }

    @Override
    public void deleteBasicInfo(String u_name) {
        basicInfoMapper.deleteBasicInfo(u_name);
    }

    @Override
    public void updateBasicInfo(BasicInfo basicInfo) {
        basicInfoMapper.updateBasicInfo(basicInfo);
    }

    @Override
    public int getInfoQuantity(Date stime, Date etime) {
        return basicInfoMapper.getInfoQuantity(stime,etime);
    }

    @Override
    public int getAllInfoCount() {
        return basicInfoMapper.getAllInfoCount();
    }
}
