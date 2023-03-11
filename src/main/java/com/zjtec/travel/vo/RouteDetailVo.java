package com.zjtec.travel.vo;

import com.zjtec.travel.domain.Route;

public class RouteDetailVo extends Route {
    int sid;//tab_seller表  所属商家
    String sname;//tab_seller表  商家名称
    String consphone;//tab_seller表  商家手机号
    String address;//tab_seller表  地址
    int rid;//tab_route表  线路ID
    String rname;//tab_route表  线路名称
    double price;//tab_route表  价格
    String routeIntroduce;//tab_route表  商品详情图片列表
    String rflag;//tab_route表  是否上架，0表未上架，1表上架
    String rdate;//tab_route表  上架时间
    String isThemeTour;//tab_route表  是否旅游主题，0表不是，1表是
    int count;//tab_route表  收藏数量
    String rimage;//tab_route表  缩略图
    String sourceId;//tab_route表  抓取数据的来源ID
    int cid;//tab_category表  所属分类
    String cname;//tab_category表  与cid对应，所属分类对应名称

    /**
     * 无参构造方法
     */
    public RouteDetailVo(){}

    /**
     * 有参构造方法
     * @param sid
     * @param sname
     * @param consphone
     * @param address
     * @param rid
     * @param rname
     * @param price
     * @param routeIntroduce
     * @param rflag
     * @param rdate
     * @param isThemeTour
     * @param count
     * @param rimage
     * @param sourceId
     * @param cid
     * @param cname
     */
    public RouteDetailVo(int sid, String sname, String consphone, String address, int rid, String rname, double price, String routeIntroduce, String rflag, String rdate, String isThemeTour, int count, String rimage, String sourceId, int cid, String cname){
        this.sid = sid;
        this.sname = sname;
        this.consphone = consphone;
        this.address = address;
        this.rid = rid;
        this.rname = rname;
        this.price = price;
        this.routeIntroduce = routeIntroduce;
        this.rflag = rflag;
        this.rdate = rdate;
        this.isThemeTour = isThemeTour;
        this.count = count;
        this.rimage = rimage;
        this.sourceId = sourceId;
        this.cid = cid;
        this.cname = cname;
    }



    @Override
    public int getSid() {
        return sid;
    }

    @Override
    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getConsphone() {
        return consphone;
    }

    public void setConsphone(String consphone) {
        this.consphone = consphone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public int getRid() {
        return rid;
    }

    @Override
    public void setRid(int rid) {
        this.rid = rid;
    }

    @Override
    public String getRname() {
        return rname;
    }

    @Override
    public void setRname(String rname) {
        this.rname = rname;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String getRouteIntroduce() {
        return routeIntroduce;
    }

    @Override
    public void setRouteIntroduce(String routeIntroduce) {
        this.routeIntroduce = routeIntroduce;
    }

    @Override
    public String getRflag() {
        return rflag;
    }

    @Override
    public void setRflag(String rflag) {
        this.rflag = rflag;
    }

    @Override
    public String getRdate() {
        return rdate;
    }

    @Override
    public void setRdate(String rdate) {
        this.rdate = rdate;
    }

    @Override
    public String getIsThemeTour() {
        return isThemeTour;
    }

    @Override
    public void setIsThemeTour(String isThemeTour) {
        this.isThemeTour = isThemeTour;
    }

    @Override
    public int getCount() {
        return count;
    }

    @Override
    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String getRimage() {
        return rimage;
    }

    @Override
    public void setRimage(String rimage) {
        this.rimage = rimage;
    }

    @Override
    public String getSourceId() {
        return sourceId;
    }

    @Override
    public void setSourceId(String sourceId) {
        this.sourceId = sourceId;
    }

    @Override
    public int getCid() {
        return cid;
    }

    @Override
    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }
}
