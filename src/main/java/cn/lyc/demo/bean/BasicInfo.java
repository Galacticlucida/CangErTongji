package cn.lyc.demo.bean;

import java.sql.Date;
import java.time.Year;

public class BasicInfo {
    private String u_name;
    private String IP;
    private String visit_time;
    private String leave_time;
    private String u_identity;
    private String u_source_territory;
    private String u_computer_type;
    private String u_OS;
    private String visit_date;
    private String leave_date;

    public String getVisit_time() {
        return visit_time;
    }

    public void setVisit_time(String visit_time) {
        this.visit_time = visit_time;
    }

    public String getLeave_time() {
        return leave_time;
    }

    public void setLeave_time(String leave_time) {
        this.leave_time = leave_time;
    }

    public String getVisit_date() {
        return visit_date;
    }

    public void setVisit_date(String visit_date) {
        this.visit_date = visit_date;
    }

    public String getLeave_date() {
        return leave_date;
    }

    public void setLeave_date(String leave_date) {
        this.leave_date = leave_date;
    }

    public String getU_name() {
        return u_name;
    }

    public void setU_name(String u_name) {
        this.u_name = u_name;
    }

    public String getIP() {
        return IP;
    }

    public void setIP(String IP) {
        this.IP = IP;
    }

    public String getU_identity() {
        return u_identity;
    }

    public void setU_identity(String u_identity) {
        this.u_identity = u_identity;
    }

    public String getU_source_territory() {
        return u_source_territory;
    }

    public void setU_source_territory(String u_source_territory) {
        this.u_source_territory = u_source_territory;
    }

    public String getU_computer_type() {
        return u_computer_type;
    }

    public void setU_computer_type(String u_computer_type) {
        this.u_computer_type = u_computer_type;
    }

    public String getU_OS() {
        return u_OS;
    }

    public void setU_OS(String u_OS) {
        this.u_OS = u_OS;
    }
}
