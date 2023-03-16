package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.FangyingtingEntity;
import com.entity.view.FangyingtingView;

import com.service.FangyingtingService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 放映厅
 * 后端接口
 * @author 
 * @email 
 * @date 2021-03-19 09:25:17
 */
@RestController
@RequestMapping("/fangyingting")
public class FangyingtingController {
    @Autowired
    private FangyingtingService fangyingtingService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,FangyingtingEntity fangyingting,
		HttpServletRequest request){
        EntityWrapper<FangyingtingEntity> ew = new EntityWrapper<FangyingtingEntity>();
		PageUtils page = fangyingtingService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, fangyingting), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,FangyingtingEntity fangyingting, HttpServletRequest request){
        EntityWrapper<FangyingtingEntity> ew = new EntityWrapper<FangyingtingEntity>();
		PageUtils page = fangyingtingService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, fangyingting), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( FangyingtingEntity fangyingting){
       	EntityWrapper<FangyingtingEntity> ew = new EntityWrapper<FangyingtingEntity>();
      	ew.allEq(MPUtil.allEQMapPre( fangyingting, "fangyingting")); 
        return R.ok().put("data", fangyingtingService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(FangyingtingEntity fangyingting){
        EntityWrapper< FangyingtingEntity> ew = new EntityWrapper< FangyingtingEntity>();
 		ew.allEq(MPUtil.allEQMapPre( fangyingting, "fangyingting")); 
		FangyingtingView fangyingtingView =  fangyingtingService.selectView(ew);
		return R.ok("查询放映厅成功").put("data", fangyingtingView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        FangyingtingEntity fangyingting = fangyingtingService.selectById(id);
        return R.ok().put("data", fangyingting);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        FangyingtingEntity fangyingting = fangyingtingService.selectById(id);
        return R.ok().put("data", fangyingting);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody FangyingtingEntity fangyingting, HttpServletRequest request){
    	fangyingting.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(fangyingting);
        fangyingtingService.insert(fangyingting);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody FangyingtingEntity fangyingting, HttpServletRequest request){
    	fangyingting.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(fangyingting);
        fangyingtingService.insert(fangyingting);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody FangyingtingEntity fangyingting, HttpServletRequest request){
        //ValidatorUtils.validateEntity(fangyingting);
        fangyingtingService.updateById(fangyingting);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        fangyingtingService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<FangyingtingEntity> wrapper = new EntityWrapper<FangyingtingEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}


		int count = fangyingtingService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	


}
