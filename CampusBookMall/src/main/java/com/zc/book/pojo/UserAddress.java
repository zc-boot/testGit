package com.zc.book.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.zc.book.pojo.request.BaseRequest;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class UserAddress extends BaseRequest {
    private Integer id;

    private String addressid;

    private Integer userid;

    private String province;

    private String city;

    private String area;

    private String detailaddress;

    private Integer isdefaultaddress;

    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date createtime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAddressid() {
        return addressid;
    }

    public void setAddressid(String addressid) {
        this.addressid = addressid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area == null ? null : area.trim();
    }

    public String getDetailaddress() {
        return detailaddress;
    }

    public void setDetailaddress(String detailaddress) {
        this.detailaddress = detailaddress == null ? null : detailaddress.trim();
    }

    public Integer getIsdefaultaddress() {
        return isdefaultaddress;
    }

    public void setIsdefaultaddress(Integer isdefaultaddress) {
        this.isdefaultaddress = isdefaultaddress;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", addressid=").append(addressid);
        sb.append(", userid=").append(userid);
        sb.append(", province=").append(province);
        sb.append(", city=").append(city);
        sb.append(", area=").append(area);
        sb.append(", detailaddress=").append(detailaddress);
        sb.append(", isdefaultaddress=").append(isdefaultaddress);
        sb.append(", createtime=").append(createtime);
        sb.append("]");
        return sb.toString();
    }
}