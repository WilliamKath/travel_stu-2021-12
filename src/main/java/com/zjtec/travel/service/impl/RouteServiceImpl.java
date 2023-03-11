package com.zjtec.travel.service.impl;

import com.zjtec.travel.dao.RouteDao;
import com.zjtec.travel.domain.*;
import com.zjtec.travel.service.RouteService;
import com.zjtec.travel.vo.RouteDetailVo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RouteServiceImpl implements RouteService {

    private static final Logger logger = LoggerFactory.getLogger(RouteServiceImpl.class);

    @Autowired
    private RouteDao routeDao;

    @Override
    public PageBean<Route> pageQuery(int cid, int currentPage, int pageSize) {
        /******* 封装PageBean对象 ********/
        PageBean<Route> pb = new PageBean<>();
        //设置当前页码
        pb.setCurrentPage(currentPage);
        //设置每页显示条数
        pb.setPageSize(pageSize);
        //设置总记录数
        int totalCount = routeDao.findTotalCount(cid);
        pb.setTotalCount(totalCount);
        //设置当前页显示的数据集合
        int start = (currentPage - 1) * pageSize;
        List<Route> list = routeDao.findByPage(cid, start, pageSize);
        pb.setList(list);
        //设置总页数 = 总记录数 / 每页显示条数
        int totalPage = totalCount % pageSize == 0 ? totalCount / pageSize : (totalCount / pageSize) + 1;
        pb.setTotalPage(totalPage);

        return pb;
    }

    //7.2根据rid查询商品所有详细信息
    @Override
    public Route<RouteImg> findDetail(int rid){
        Route<RouteImg> detail = new Route<>();
        Seller seller = new Seller();
        seller.setSid(routeDao.findByRid(rid).getSid());
        seller.setSname(routeDao.findByRid(rid).getSname());
        seller.setConsphone(routeDao.findByRid(rid).getConsphone());
        seller.setAddress(routeDao.findByRid(rid).getAddress());
        detail.setSeller(seller);
        detail.setRid(routeDao.findByRid(rid).getRid());
        detail.setRname(routeDao.findByRid(rid).getRname());
        detail.setPrice(routeDao.findByRid(rid).getPrice());
        detail.setRouteIntroduce(routeDao.findByRid(rid).getRouteIntroduce());
        detail.setRflag(routeDao.findByRid(rid).getRflag());
        detail.setRdate(routeDao.findByRid(rid).getRdate());
        detail.setIsThemeTour(routeDao.findByRid(rid).getIsThemeTour());
        detail.setCount(routeDao.findByRid(rid).getCount());
        detail.setRimage(routeDao.findByRid(rid).getRimage());
        detail.setSourceId(routeDao.findByRid(rid).getSourceId());
        detail.setCid(routeDao.findByRid(rid).getCid());
        detail.setCname(routeDao.findByRid(rid).getCname());
        detail.setRouteImgList(routeDao.findImgByRid(rid));
        return detail;
    }
}
