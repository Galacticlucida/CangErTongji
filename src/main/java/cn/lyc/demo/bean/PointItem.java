package cn.lyc.demo.bean;

public class PointItem {
    private String p_type;
    private String p_id;
    private String p_name;
    private int p_state;
    private int eq;

//    public PointItem(String p_id, String p_name, int p_state, int eq) {
//        this.p_id = p_id;
//        this.p_name = p_name;
//        this.p_state = p_state;
//        this.eq = eq;
//    }


    public String getP_type() {
        return p_type;
    }

    public void setP_type(String p_type) {
        this.p_type = p_type;
    }

    public int getEq() {
        return eq;
    }

    public void setEq(int eq) {
        this.eq = eq;
    }
    public String getP_id() {
        return p_id;
    }

    public void setP_id(String p_id) {
        this.p_id = p_id;
    }

    public String getP_name() {
        return p_name;
    }

    public void setP_name(String p_name) {
        this.p_name = p_name;
    }

    public int getP_state() {
        return p_state;
    }

    public void setP_state(int p_state) {
        this.p_state = p_state;
    }

//    @Override
//    public String toString() {
//        return "PointItem{" +
//                "p_id='" + p_id + '\'' +
//                ", p_name='" + p_name + '\'' +
//                ", p_state=" + p_state +
//                '}';
//    }
}



