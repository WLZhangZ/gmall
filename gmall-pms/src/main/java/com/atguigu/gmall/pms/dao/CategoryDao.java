package com.atguigu.gmall.pms.dao;

import com.atguigu.gmall.pms.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author jeff
 * @email jeff@163.com
 * @date 2020-03-08 13:13:45
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
