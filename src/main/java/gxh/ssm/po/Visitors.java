package gxh.ssm.po;

public class Visitors {
    private Integer vId;

    private String vName;

    private String vSex;

    private Integer vAge;

    private Integer workunit;

    public Integer getvId() {
        return vId;
    }

    public void setvId(Integer vId) {
        this.vId = vId;
    }

    public String getvName() {
        return vName;
    }

    public void setvName(String vName) {
        this.vName = vName == null ? null : vName.trim();
    }

    public String getvSex() {
        return vSex;
    }

    public void setvSex(String vSex) {
        this.vSex = vSex == null ? null : vSex.trim();
    }

    public Integer getvAge() {
        return vAge;
    }

    public void setvAge(Integer vAge) {
        this.vAge = vAge;
    }

    public Integer getWorkunit() {
        return workunit;
    }

    public void setWorkunit(Integer workunit) {
        this.workunit = workunit;
    }
}