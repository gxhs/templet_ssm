package gxh.ssm.po;

import java.util.Date;

public class Visitorsregister {
    private Integer vrId;

    private Date vrData;

    private Integer vId;

    private String sno;

    private String relation;

    private String remark;

    public Integer getVrId() {
        return vrId;
    }

    public void setVrId(Integer vrId) {
        this.vrId = vrId;
    }

    public Date getVrData() {
        return vrData;
    }

    public void setVrData(Date vrData) {
        this.vrData = vrData;
    }

    public Integer getvId() {
        return vId;
    }

    public void setvId(Integer vId) {
        this.vId = vId;
    }

    public String getSno() {
        return sno;
    }

    public void setSno(String sno) {
        this.sno = sno == null ? null : sno.trim();
    }

    public String getRelation() {
        return relation;
    }

    public void setRelation(String relation) {
        this.relation = relation == null ? null : relation.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}