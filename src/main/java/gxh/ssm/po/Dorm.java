package gxh.ssm.po;

public class Dorm {
    private Integer dormId;

    private Integer shouldpeople;

    private Integer nowpeople;

    private String dormitory;

    public Integer getDormId() {
        return dormId;
    }

    public void setDormId(Integer dormId) {
        this.dormId = dormId;
    }

    public Integer getShouldpeople() {
        return shouldpeople;
    }

    public void setShouldpeople(Integer shouldpeople) {
        this.shouldpeople = shouldpeople;
    }

    public Integer getNowpeople() {
        return nowpeople;
    }

    public void setNowpeople(Integer nowpeople) {
        this.nowpeople = nowpeople;
    }

    public String getDormitory() {
        return dormitory;
    }

    public void setDormitory(String dormitory) {
        this.dormitory = dormitory == null ? null : dormitory.trim();
    }
}