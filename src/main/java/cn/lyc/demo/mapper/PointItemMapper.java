package cn.lyc.demo.mapper;

import cn.lyc.demo.bean.PointItem;

import java.util.List;

public interface PointItemMapper {


    public List<PointItem> getAllPointItem();

    public List<PointItem> getAllPointItemByState();

    public void insertPointItem(List<PointItem> pointItemList);

    public void deletePointItem(String id);

    public void updatePointItem(int eq);

    public void updatePointItemToOne(int eq);
}
