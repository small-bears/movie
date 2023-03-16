package com.entity.vo;

import com.entity.GoupiaotongjiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 购票统计
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-03-19 09:25:17
 */
public class GoupiaotongjiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 电影类型
	 */
	
	private String dianyingleixing;
		
	/**
	 * 导演
	 */
	
	private String daoyan;
		
	/**
	 * 用户名
	 */
	
	private String yonghuming;
		
	/**
	 * 联系电话
	 */
	
	private String lianxidianhua;
		
	/**
	 * 购票数量
	 */
	
	private Integer goupiaoshuliang;
		
	/**
	 * 购票金额
	 */
	
	private Integer goupiaojine;
		
	/**
	 * 购票日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date goupiaoriqi;
		
	/**
	 * 备注
	 */
	
	private String beizhu;
				
	
	/**
	 * 设置：电影类型
	 */
	 
	public void setDianyingleixing(String dianyingleixing) {
		this.dianyingleixing = dianyingleixing;
	}
	
	/**
	 * 获取：电影类型
	 */
	public String getDianyingleixing() {
		return dianyingleixing;
	}
				
	
	/**
	 * 设置：导演
	 */
	 
	public void setDaoyan(String daoyan) {
		this.daoyan = daoyan;
	}
	
	/**
	 * 获取：导演
	 */
	public String getDaoyan() {
		return daoyan;
	}
				
	
	/**
	 * 设置：用户名
	 */
	 
	public void setYonghuming(String yonghuming) {
		this.yonghuming = yonghuming;
	}
	
	/**
	 * 获取：用户名
	 */
	public String getYonghuming() {
		return yonghuming;
	}
				
	
	/**
	 * 设置：联系电话
	 */
	 
	public void setLianxidianhua(String lianxidianhua) {
		this.lianxidianhua = lianxidianhua;
	}
	
	/**
	 * 获取：联系电话
	 */
	public String getLianxidianhua() {
		return lianxidianhua;
	}
				
	
	/**
	 * 设置：购票数量
	 */
	 
	public void setGoupiaoshuliang(Integer goupiaoshuliang) {
		this.goupiaoshuliang = goupiaoshuliang;
	}
	
	/**
	 * 获取：购票数量
	 */
	public Integer getGoupiaoshuliang() {
		return goupiaoshuliang;
	}
				
	
	/**
	 * 设置：购票金额
	 */
	 
	public void setGoupiaojine(Integer goupiaojine) {
		this.goupiaojine = goupiaojine;
	}
	
	/**
	 * 获取：购票金额
	 */
	public Integer getGoupiaojine() {
		return goupiaojine;
	}
				
	
	/**
	 * 设置：购票日期
	 */
	 
	public void setGoupiaoriqi(Date goupiaoriqi) {
		this.goupiaoriqi = goupiaoriqi;
	}
	
	/**
	 * 获取：购票日期
	 */
	public Date getGoupiaoriqi() {
		return goupiaoriqi;
	}
				
	
	/**
	 * 设置：备注
	 */
	 
	public void setBeizhu(String beizhu) {
		this.beizhu = beizhu;
	}
	
	/**
	 * 获取：备注
	 */
	public String getBeizhu() {
		return beizhu;
	}
			
}
