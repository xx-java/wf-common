package com.zb.pojo;
import java.io.Serializable;
import java.util.Date;
/***
*   
*/
public class WfOrderItem implements Serializable {
    //
    private String id;
    //商品id
    private String itemid;
    //订单id
    private String orderid;
    //商品购买数量
    private Integer num;
    //商品标题
    private String title;
    //商品单价
    private Double price;
    //商品总金额
    private Double totalfee;
    //商品图片地址
    private String picpath;
    //get set 方法
    public void setId (String  id){
        this.id=id;
    }
    public  String getId(){
        return this.id;
    }
    public void setItemid (String  itemid){
        this.itemid=itemid;
    }
    public  String getItemid(){
        return this.itemid;
    }
    public void setOrderid (String  orderid){
        this.orderid=orderid;
    }
    public  String getOrderid(){
        return this.orderid;
    }
    public void setNum (Integer  num){
        this.num=num;
    }
    public  Integer getNum(){
        return this.num;
    }
    public void setTitle (String  title){
        this.title=title;
    }
    public  String getTitle(){
        return this.title;
    }
    public void setPrice (Double  price){
        this.price=price;
    }
    public  Double getPrice(){
        return this.price;
    }
    public void setTotalfee (Double  totalfee){
        this.totalfee=totalfee;
    }
    public  Double getTotalfee(){
        return this.totalfee;
    }
    public void setPicpath (String  picpath){
        this.picpath=picpath;
    }
    public  String getPicpath(){
        return this.picpath;
    }
}
