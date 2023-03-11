package com.zjtec.travel.controller;

import com.zjtec.travel.domain.PageBean;
import com.zjtec.travel.domain.Route;
import com.zjtec.travel.domain.RouteImg;
import com.zjtec.travel.service.RouteService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/route")
public class RouteController {

  private static final Logger logger = LoggerFactory.getLogger(RouteController.class);

  @Autowired
  private RouteService routeService;

  @RequestMapping("/pageQuery")
  @ResponseBody
  public PageBean<Route> pageQuery(@RequestParam("cid") Integer cid,@RequestParam(value="currentPage",required = false) Integer currentPage,@RequestParam(value="pageSize",required = false) Integer pageSize){
    //TODO:完成pageQuery 功能
    PageBean<Route> pgQuery;
    if (currentPage==null){
      pgQuery = routeService.pageQuery(cid,1,5);
    }else {
      pgQuery = routeService.pageQuery(cid,currentPage,5);
    }
    return pgQuery;
  }

  //7.2 查看商品详情页
  @RequestMapping("/detail")
  @ResponseBody
  public Route<RouteImg> findDetail(@RequestParam("rid") Integer rid){
      return routeService.findDetail(rid);
    }
}

