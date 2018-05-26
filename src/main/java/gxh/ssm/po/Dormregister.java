package gxh.ssm.po;

import java.util.Date;

public class Dormregister {
    private Integer id;

    private Date drData;

    private String sno;

    private Integer dormId;

    private Integer nowdorm;

    private String state;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDrData() {
        return drData;
    }

    public void setDrData(Date drData) {
        this.drData = drData;
    }

    public String getSno() {
        return sno;
    }

    public void setSno(String sno) {
        this.sno = sno == null ? null : sno.trim();
    }

    public Integer getDormId() {
        return dormId;
    }

    public void setDormId(Integer dormId) {
        this.dormId = dormId;
    }

    public Integer getNowdorm() {
        return nowdorm;
    }

    public void setNowdorm(Integer nowdorm) {
        this.nowdorm = nowdorm;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }
}