package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussdianyingxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussdianyingxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussdianyingxinxiView;


/**
 * 电影信息评论表
 *
 * @author 
 * @email 
 * @date 2021-03-19 09:25:17
 */
public interface DiscussdianyingxinxiService extends IService<DiscussdianyingxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussdianyingxinxiVO> selectListVO(Wrapper<DiscussdianyingxinxiEntity> wrapper);
   	
   	DiscussdianyingxinxiVO selectVO(@Param("ew") Wrapper<DiscussdianyingxinxiEntity> wrapper);
   	
   	List<DiscussdianyingxinxiView> selectListView(Wrapper<DiscussdianyingxinxiEntity> wrapper);
   	
   	DiscussdianyingxinxiView selectView(@Param("ew") Wrapper<DiscussdianyingxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussdianyingxinxiEntity> wrapper);
   	
}

