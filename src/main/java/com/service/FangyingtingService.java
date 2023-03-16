package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.FangyingtingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.FangyingtingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.FangyingtingView;


/**
 * 放映厅
 *
 * @author 
 * @email 
 * @date 2021-03-19 09:25:17
 */
public interface FangyingtingService extends IService<FangyingtingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<FangyingtingVO> selectListVO(Wrapper<FangyingtingEntity> wrapper);
   	
   	FangyingtingVO selectVO(@Param("ew") Wrapper<FangyingtingEntity> wrapper);
   	
   	List<FangyingtingView> selectListView(Wrapper<FangyingtingEntity> wrapper);
   	
   	FangyingtingView selectView(@Param("ew") Wrapper<FangyingtingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<FangyingtingEntity> wrapper);
   	
}

