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


import com.dao.FangyingtingDao;
import com.entity.FangyingtingEntity;
import com.service.FangyingtingService;
import com.entity.vo.FangyingtingVO;
import com.entity.view.FangyingtingView;

@Service("fangyingtingService")
public class FangyingtingServiceImpl extends ServiceImpl<FangyingtingDao, FangyingtingEntity> implements FangyingtingService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<FangyingtingEntity> page = this.selectPage(
                new Query<FangyingtingEntity>(params).getPage(),
                new EntityWrapper<FangyingtingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<FangyingtingEntity> wrapper) {
		  Page<FangyingtingView> page =new Query<FangyingtingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<FangyingtingVO> selectListVO(Wrapper<FangyingtingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public FangyingtingVO selectVO(Wrapper<FangyingtingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<FangyingtingView> selectListView(Wrapper<FangyingtingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public FangyingtingView selectView(Wrapper<FangyingtingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
