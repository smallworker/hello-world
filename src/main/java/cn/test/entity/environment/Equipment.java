package cn.test.entity.environment;

import java.util.Date;

public class Equipment extends EquipmentKey {
    private Integer clientid;

    private String mn;

    private String name;

    private String pw;

    private String phone;

    private String username;

    private String userphone;

    private Integer status;

    private Date finalreporttime;

    private Integer isdelete;

    private Integer createuser;

    private Date createtime;

    private Integer updateuser;

    private Date updatetime;

    private String remarks;

    private String leftpoint;

    private String toppoint;

    public Integer getClientid() {
        return clientid;
    }

    public void setClientid(Integer clientid) {
        this.clientid = clientid;
    }

    public String getMn() {
        return mn;
    }

    public void setMn(String mn) {
        this.mn = mn == null ? null : mn.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw == null ? null : pw.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getUserphone() {
        return userphone;
    }

    public void setUserphone(String userphone) {
        this.userphone = userphone == null ? null : userphone.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getFinalreporttime() {
        return finalreporttime;
    }

    public void setFinalreporttime(Date finalreporttime) {
        this.finalreporttime = finalreporttime;
    }

    public Integer getIsdelete() {
        return isdelete;
    }

    public void setIsdelete(Integer isdelete) {
        this.isdelete = isdelete;
    }

    public Integer getCreateuser() {
        return createuser;
    }

    public void setCreateuser(Integer createuser) {
        this.createuser = createuser;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Integer getUpdateuser() {
        return updateuser;
    }

    public void setUpdateuser(Integer updateuser) {
        this.updateuser = updateuser;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }

    public String getLeftpoint() {
        return leftpoint;
    }

    public void setLeftpoint(String leftpoint) {
        this.leftpoint = leftpoint == null ? null : leftpoint.trim();
    }

    public String getToppoint() {
        return toppoint;
    }

    public void setToppoint(String toppoint) {
        this.toppoint = toppoint == null ? null : toppoint.trim();
    }
}