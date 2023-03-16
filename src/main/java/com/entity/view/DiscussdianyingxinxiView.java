package com.entity.view;

import com.entity.DiscussdianyingxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 电影信息评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-19 09:25:17
 */
@TableName("discussdianyingxinxi")
public class DiscussdianyingxinxiView  extends DiscussdianyingxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscussdianyingxinxiView(){
	}
 
 	public DiscussdianyingxinxiView(DiscussdianyingxinxiEntity discussdianyingxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, discussdianyingxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
