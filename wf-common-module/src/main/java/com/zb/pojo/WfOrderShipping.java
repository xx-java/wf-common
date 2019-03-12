package com.zb.pojo;
import java.io.Serializable;
import java.util.Date;
/***
*   
*/
public class WfOrderShipping implements Serializable {
    //订单id
    private String orderid;
    //收货人全名
    private String rname;
    //固定电话
    private String rphone;
    //移动电话
    private String rmobile;
    //省
    private String rstate;
    //市
    private String rcity;
    //县
    private String rdistrict;
    //收货地址
    private String raddress;
    //邮政编码
    private String rzip;
    //
    private Date created;
    //
    private Date updated;
    //get set 方法
    public void setOrderid (String  orderid){
        this.orderid=orderid;
    }
    public  String getOrderid(){
        return this.orderid;
    }
    public void setRname (String  rname){
        this.rname=rname;
    }
    public  String getRname(){
        return this.rname;
    }
    public void setRphone (String  rphone){
        this.rphone=rphone;
    }
    public  String getRphone(){
        return this.rphone;
    }
    public void setRmobile (String  rmobile){
        this.rmobile=rmobile;
    }
    public  String getRmobile(){
        return this.rmobile;
    }
    public void setRstate (String  rstate){
        this.rstate=rstate;
    }
    public  String getRstate(){
        return this.rstate;
    }
    public void setRcity (String  rcity){
        this.rcity=rcity;
    }
    public  String getRcity(){
        return this.rcity;
    }
    public void setRdistrict (String  rdistrict){
        this.rdistrict=rdistrict;
    }
    public  String getRdistrict(){
        return this.rdistrict;
    }
    public void setRaddress (String  raddress){
        this.raddress=raddress;
    }
    public  String getRaddress(){
        return this.raddress;
    }
    public void setRzip (String  rzip){
        this.rzip=rzip;
    }
    public  String getRzip(){
        return this.rzip;
    }
    public void setCreated (Date  created){
        this.created=created;
    }
    public  Date getCreated(){
        return this.created;
    }
    public void setUpdated (Date  updated){
        this.updated=updated;
    }
    public  Date getUpdated(){
        return this.updated;
    }
}
