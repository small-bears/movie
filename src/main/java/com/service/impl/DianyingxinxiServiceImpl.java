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


import com.dao.DianyingxinxiDao;
import com.entity.DianyingxinxiEntity;
import com.service.DianyingxinxiService;
import com.entity.vo.DianyingxinxiVO;
import com.entity.view.DianyingxinxiView;

@Service("dianyingxinxiService")
public class DianyingxinxiServiceImpl extends ServiceImpl<DianyingxinxiDao, DianyingxinxiEntity> implements DianyingxinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DianyingxinxiEntity> page = this.selectPage(
                new Query<DianyingxinxiEntity>(params).getPage(),
                new EntityWrapper<DianyingxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DianyingxinxiEntity> wrapper) {
		  Page<DianyingxinxiView> page =new Query<DianyingxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DianyingxinxiVO> selectListVO(Wrapper<DianyingxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DianyingxinxiVO selectVO(Wrapper<DianyingxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DianyingxinxiView> selectListView(Wrapper<DianyingxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DianyingxinxiView selectView(Wrapper<DianyingxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
