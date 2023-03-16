package com.dao;

import com.entity.GoupiaotongjiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.GoupiaotongjiVO;
import com.entity.view.GoupiaotongjiView;


/**
 * 购票统计
 * 
 * @author 
 * @email 
 * @date 2021-03-19 09:25:17
 */
public interface GoupiaotongjiDao extends BaseMapper<GoupiaotongjiEntity> {
	
	List<GoupiaotongjiVO> selectListVO(@Param("ew") Wrapper<GoupiaotongjiEntity> wrapper);
	
	GoupiaotongjiVO selectVO(@Param("ew") Wrapper<GoupiaotongjiEntity> wrapper);
	
	List<GoupiaotongjiView> selectListView(@Param("ew") Wrapper<GoupiaotongjiEntity> wrapper);

	List<GoupiaotongjiView> selectListView(Pagination page,@Param("ew") Wrapper<GoupiaotongjiEntity> wrapper);
	
	GoupiaotongjiView selectView(@Param("ew") Wrapper<GoupiaotongjiEntity> wrapper);
	
}
