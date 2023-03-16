package com.dao;

import com.entity.FangyingtingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.FangyingtingVO;
import com.entity.view.FangyingtingView;


/**
 * 放映厅
 * 
 * @author 
 * @email 
 * @date 2021-03-19 09:25:17
 */
public interface FangyingtingDao extends BaseMapper<FangyingtingEntity> {
	
	List<FangyingtingVO> selectListVO(@Param("ew") Wrapper<FangyingtingEntity> wrapper);
	
	FangyingtingVO selectVO(@Param("ew") Wrapper<FangyingtingEntity> wrapper);
	
	List<FangyingtingView> selectListView(@Param("ew") Wrapper<FangyingtingEntity> wrapper);

	List<FangyingtingView> selectListView(Pagination page,@Param("ew") Wrapper<FangyingtingEntity> wrapper);
	
	FangyingtingView selectView(@Param("ew") Wrapper<FangyingtingEntity> wrapper);
	
}
