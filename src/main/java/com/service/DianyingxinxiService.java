package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DianyingxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DianyingxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DianyingxinxiView;


/**
 * 电影信息
 *
 * @author 
 * @email 
 * @date 2021-03-19 09:25:17
 */
public interface DianyingxinxiService extends IService<DianyingxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DianyingxinxiVO> selectListVO(Wrapper<DianyingxinxiEntity> wrapper);
   	
   	DianyingxinxiVO selectVO(@Param("ew") Wrapper<DianyingxinxiEntity> wrapper);
   	
   	List<DianyingxinxiView> selectListView(Wrapper<DianyingxinxiEntity> wrapper);
   	
   	DianyingxinxiView selectView(@Param("ew") Wrapper<DianyingxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DianyingxinxiEntity> wrapper);
   	
}

