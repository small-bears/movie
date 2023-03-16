package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.GoupiaotongjiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.GoupiaotongjiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.GoupiaotongjiView;


/**
 * 购票统计
 *
 * @author 
 * @email 
 * @date 2021-03-19 09:25:17
 */
public interface GoupiaotongjiService extends IService<GoupiaotongjiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<GoupiaotongjiVO> selectListVO(Wrapper<GoupiaotongjiEntity> wrapper);
   	
   	GoupiaotongjiVO selectVO(@Param("ew") Wrapper<GoupiaotongjiEntity> wrapper);
   	
   	List<GoupiaotongjiView> selectListView(Wrapper<GoupiaotongjiEntity> wrapper);
   	
   	GoupiaotongjiView selectView(@Param("ew") Wrapper<GoupiaotongjiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<GoupiaotongjiEntity> wrapper);
   	
}

