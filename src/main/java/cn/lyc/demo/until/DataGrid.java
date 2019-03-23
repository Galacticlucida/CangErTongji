package cn.lyc.demo.until;

import java.util.List;

public class DataGrid {

    private static class  DataGridClass{
        private static final  DataGrid datagrid=new DataGrid();
    }
    private int total;
    private List rows;

    private DataGrid(){}

    public static DataGrid getDataGrid(){
        return DataGridClass.datagrid;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public List getRows() {
        return rows;
    }

    public void setRows(List rows) {
        this.rows = rows;
    }
}