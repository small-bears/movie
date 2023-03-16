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


import com.dao.DianyingleixingDao;
import com.entity.DianyingleixingEntity;
import com.service.DianyingleixingService;
import com.entity.vo.DianyingleixingVO;
import com.entity.view.DianyingleixingView;

@Service("dianyingleixingService")
public class DianyingleixingServiceImpl extends ServiceImpl<DianyingleixingDao, DianyingleixingEntity> implements DianyingleixingService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DianyingleixingEntity> page = this.selectPage(
                new Query<DianyingleixingEntity>(params).getPage(),
                new EntityWrapper<DianyingleixingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DianyingleixingEntity> wrapper) {
		  Page<DianyingleixingView> page =new Query<DianyingleixingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DianyingleixingVO> selectListVO(Wrapper<DianyingleixingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DianyingleixingVO selectVO(Wrapper<DianyingleixingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DianyingleixingView> selectListView(Wrapper<DianyingleixingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DianyingleixingView selectView(Wrapper<DianyingleixingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
