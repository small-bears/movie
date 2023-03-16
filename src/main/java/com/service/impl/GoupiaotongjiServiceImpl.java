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


import com.dao.GoupiaotongjiDao;
import com.entity.GoupiaotongjiEntity;
import com.service.GoupiaotongjiService;
import com.entity.vo.GoupiaotongjiVO;
import com.entity.view.GoupiaotongjiView;

@Service("goupiaotongjiService")
public class GoupiaotongjiServiceImpl extends ServiceImpl<GoupiaotongjiDao, GoupiaotongjiEntity> implements GoupiaotongjiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<GoupiaotongjiEntity> page = this.selectPage(
                new Query<GoupiaotongjiEntity>(params).getPage(),
                new EntityWrapper<GoupiaotongjiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<GoupiaotongjiEntity> wrapper) {
		  Page<GoupiaotongjiView> page =new Query<GoupiaotongjiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<GoupiaotongjiVO> selectListVO(Wrapper<GoupiaotongjiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public GoupiaotongjiVO selectVO(Wrapper<GoupiaotongjiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<GoupiaotongjiView> selectListView(Wrapper<GoupiaotongjiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public GoupiaotongjiView selectView(Wrapper<GoupiaotongjiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
