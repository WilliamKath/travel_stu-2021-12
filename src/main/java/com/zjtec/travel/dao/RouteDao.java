package com.zjtec.travel.dao;

import com.zjtec.travel.domain.Route;
import com.zjtec.travel.domain.RouteImg;
import com.zjtec.travel.vo.RouteDetailVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RouteDao {

    /**
     * 根据cid查询总记录数
     * @param cid
     * @return
     */
    int findTotalCount(int cid);

    /**
     * 根据cid，start，pageSize查询当前页的数据集合
     * @param cid
     * @param start
     * @param pageSize
     * @return
     */
    List<Route> findByPage(@Param("cid") int cid, @Param("start")int start, @Param("pageSize")int pageSize);

    /**
     * 7.2查看商品详情页
     * 根据rid查询商品所有详细信息
     * @param rid
     */
    RouteDetailVo findByRid(@Param("rid") int rid);

    /**
     * 7.2查询商品详情中的所有图片
     * 根据rid查询到所有图片
     * @param rid
     */
    List<RouteImg> findImgByRid(@Param("rid") int rid);
}
