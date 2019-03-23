package cn.lyc.demo.bean;

import java.util.Date;

public class ClickInfo {
    private String u_name;
    private String click_content;
    private String IP;
    private Date click_time;
    private String source_territory;

    public String getU_name() {
        return u_name;
    }

    public void setU_name(String u_name) {
        this.u_name = u_name;
    }

    public String getClick_content() {
        return click_content;
    }

    public void setClick_content(String click_content) {
        this.click_content = click_content;
    }

    public String getIP() {
        return IP;
    }

    public void setIP(String IP) {
        this.IP = IP;
    }

    public Date getClick_time() {
        return click_time;
    }

    public void setClick_time(Date click_time) {
        this.click_time = click_time;
    }

    public String getSource_territory() {
        return source_territory;
    }

    public void setSource_territory(String source_territory) {
        this.source_territory = source_territory;
    }
}

