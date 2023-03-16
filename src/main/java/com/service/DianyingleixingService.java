package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DianyingleixingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DianyingleixingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DianyingleixingView;


/**
 * 电影类型
 *
 * @author 
 * @email 
 * @date 2021-03-19 09:25:17
 */
public interface DianyingleixingService extends IService<DianyingleixingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DianyingleixingVO> selectListVO(Wrapper<DianyingleixingEntity> wrapper);
   	
   	DianyingleixingVO selectVO(@Param("ew") Wrapper<DianyingleixingEntity> wrapper);
   	
   	List<DianyingleixingView> selectListView(Wrapper<DianyingleixingEntity> wrapper);
   	
   	DianyingleixingView selectView(@Param("ew") Wrapper<DianyingleixingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DianyingleixingEntity> wrapper);
   	
}

