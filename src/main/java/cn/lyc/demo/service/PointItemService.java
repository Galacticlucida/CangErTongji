package cn.lyc.demo.service;

import cn.lyc.demo.bean.PointItem;
import org.springframework.stereotype.Service;

import java.util.List;

public interface PointItemService {
    public void insertPointItem(List<PointItem> pointItemList);

}
