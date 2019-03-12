package com.zb.pojo;
import java.io.Serializable;
import java.util.Date;
/***
*   
*/
public class WfOrder implements Serializable {
    //订单id
    private String orderid;
    //实付金额
    private Double payment;
    //支付类型
    private Integer paymenttype;
    //邮费
    private Double postfee;
    //状态：1.未付款 2.已付款 3.未发货 4.已发货 5.交易成功 6.交易关闭
    private Integer status;
    //订单创建时间
    private Date createtime;
    //订单更新时间
    private Date updatetime;
    //付款时间
    private Date paymenttime;
    //发货时间
    private Date consigntime;
    //交易完成时间
    private Date endtime;
    //交易关闭时间
    private Date closetime;
    //物流名称
    private String shippingname;
    //物流单号
    private String shippingcode;
    //用户id
    private Long userid;
    //买家留言
    private String buyermessage;
    //买家昵称
    private String buyernick;
    //买家是否已经评价
    private Integer buyerrake;
    //get set 方法
    public void setOrderid (String  orderid){
        this.orderid=orderid;
    }
    public  String getOrderid(){
        return this.orderid;
    }
    public void setPayment (Double  payment){
        this.payment=payment;
    }
    public  Double getPayment(){
        return this.payment;
    }
    public void setPaymenttype (Integer  paymenttype){
        this.paymenttype=paymenttype;
    }
    public  Integer getPaymenttype(){
        return this.paymenttype;
    }
    public void setPostfee (Double  postfee){
        this.postfee=postfee;
    }
    public  Double getPostfee(){
        return this.postfee;
    }
    public void setStatus (Integer  status){
        this.status=status;
    }
    public  Integer getStatus(){
        return this.status;
    }
    public void setCreatetime (Date  createtime){
        this.createtime=createtime;
    }
    public  Date getCreatetime(){
        return this.createtime;
    }
    public void setUpdatetime (Date  updatetime){
        this.updatetime=updatetime;
    }
    public  Date getUpdatetime(){
        return this.updatetime;
    }
    public void setPaymenttime (Date  paymenttime){
        this.paymenttime=paymenttime;
    }
    public  Date getPaymenttime(){
        return this.paymenttime;
    }
    public void setConsigntime (Date  consigntime){
        this.consigntime=consigntime;
    }
    public  Date getConsigntime(){
        return this.consigntime;
    }
    public void setEndtime (Date  endtime){
        this.endtime=endtime;
    }
    public  Date getEndtime(){
        return this.endtime;
    }
    public void setClosetime (Date  closetime){
        this.closetime=closetime;
    }
    public  Date getClosetime(){
        return this.closetime;
    }
    public void setShippingname (String  shippingname){
        this.shippingname=shippingname;
    }
    public  String getShippingname(){
        return this.shippingname;
    }
    public void setShippingcode (String  shippingcode){
        this.shippingcode=shippingcode;
    }
    public  String getShippingcode(){
        return this.shippingcode;
    }
    public void setUserid (Long  userid){
        this.userid=userid;
    }
    public  Long getUserid(){
        return this.userid;
    }
    public void setBuyermessage (String  buyermessage){
        this.buyermessage=buyermessage;
    }
    public  String getBuyermessage(){
        return this.buyermessage;
    }
    public void setBuyernick (String  buyernick){
        this.buyernick=buyernick;
    }
    public  String getBuyernick(){
        return this.buyernick;
    }
    public void setBuyerrake (Integer  buyerrake){
        this.buyerrake=buyerrake;
    }
    public  Integer getBuyerrake(){
        return this.buyerrake;
    }
}
