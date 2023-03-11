package com.zjtec.travel.service;

import com.zjtec.travel.domain.PageBean;
import com.zjtec.travel.domain.Route;
import com.zjtec.travel.domain.RouteImg;

public interface RouteService {
    /**
     * 分页查询
     * @param cid 分组ID
     * @param currentPage 当前页码
     * @param pageSize 每页大小
     * @return
     */
    PageBean<Route> pageQuery(int cid,int currentPage,int pageSize);

    /**
     * 7.2 查看商品详情页
     * 根据rid查询商品所有详细信息
     * @param rid
     */
    Route<RouteImg> findDetail(int rid);
}
