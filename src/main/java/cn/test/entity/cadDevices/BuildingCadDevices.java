package cn.test.entity.cadDevices;

public class BuildingCadDevices extends BuildingCadDevicesKey {
    private Long deviceid;

    private Integer fid;

    private String leftpoint;

    private String toppoint;

    private String nvrchannel;

    private Integer devicetype;

    private Integer clientid;

    public Long getDeviceid() {
        return deviceid;
    }

    public void setDeviceid(Long deviceid) {
        this.deviceid = deviceid;
    }

    public Integer getFid() {
        return fid;
    }

    public void setFid(Integer fid) {
        this.fid = fid;
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

    public String getNvrchannel() {
        return nvrchannel;
    }

    public void setNvrchannel(String nvrchannel) {
        this.nvrchannel = nvrchannel == null ? null : nvrchannel.trim();
    }

    public Integer getDevicetype() {
        return devicetype;
    }

    public void setDevicetype(Integer devicetype) {
        this.devicetype = devicetype;
    }

    public Integer getClientid() {
        return clientid;
    }

    public void setClientid(Integer clientid) {
        this.clientid = clientid;
    }
}