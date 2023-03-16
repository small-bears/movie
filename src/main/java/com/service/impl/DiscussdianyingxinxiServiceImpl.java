package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.DiscussdianyingxinxiDao;
import com.entity.DiscussdianyingxinxiEntity;
import com.service.DiscussdianyingxinxiService;
import com.entity.vo.DiscussdianyingxinxiVO;
import com.entity.view.DiscussdianyingxinxiView;

@Service("discussdianyingxinxiService")
public class DiscussdianyingxinxiServiceImpl extends ServiceImpl<DiscussdianyingxinxiDao, DiscussdianyingxinxiEntity> implements DiscussdianyingxinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussdianyingxinxiEntity> page = this.selectPage(
                new Query<DiscussdianyingxinxiEntity>(params).getPage(),
                new EntityWrapper<DiscussdianyingxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussdianyingxinxiEntity> wrapper) {
		  Page<DiscussdianyingxinxiView> page =new Query<DiscussdianyingxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussdianyingxinxiVO> selectListVO(Wrapper<DiscussdianyingxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussdianyingxinxiVO selectVO(Wrapper<DiscussdianyingxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussdianyingxinxiView> selectListView(Wrapper<DiscussdianyingxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussdianyingxinxiView selectView(Wrapper<DiscussdianyingxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
