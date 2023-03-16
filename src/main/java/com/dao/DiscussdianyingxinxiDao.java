package com.dao;

import com.entity.DiscussdianyingxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussdianyingxinxiVO;
import com.entity.view.DiscussdianyingxinxiView;


/**
 * 电影信息评论表
 * 
 * @author 
 * @email 
 * @date 2021-03-19 09:25:17
 */
public interface DiscussdianyingxinxiDao extends BaseMapper<DiscussdianyingxinxiEntity> {
	
	List<DiscussdianyingxinxiVO> selectListVO(@Param("ew") Wrapper<DiscussdianyingxinxiEntity> wrapper);
	
	DiscussdianyingxinxiVO selectVO(@Param("ew") Wrapper<DiscussdianyingxinxiEntity> wrapper);
	
	List<DiscussdianyingxinxiView> selectListView(@Param("ew") Wrapper<DiscussdianyingxinxiEntity> wrapper);

	List<DiscussdianyingxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussdianyingxinxiEntity> wrapper);
	
	DiscussdianyingxinxiView selectView(@Param("ew") Wrapper<DiscussdianyingxinxiEntity> wrapper);
	
}
