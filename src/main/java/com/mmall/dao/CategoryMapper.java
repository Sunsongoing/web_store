package com.mmall.dao;

import com.mmall.pojo.Category;

import java.util.List;

public interface CategoryMapper {

    /**
     * 根据主键id删除品类
     *
     * @param id
     * @return
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * 添加品类
     *
     * @param record
     * @return
     */
    int insert(Category record);

    /**
     * 有选择的插入品类字段
     *
     * @param record
     * @return
     */
    int insertSelective(Category record);

    /**
     * 根据主键id查询品类
     *
     * @param id
     * @return
     */
    Category selectByPrimaryKey(Integer id);

    /**
     * 根据主键id有选择的更新品类字段
     *
     * @param record
     * @return
     */
    int updateByPrimaryKeySelective(Category record);

    /**
     * 根据主键id更新品类
     *
     * @param record
     * @return
     */
    int updateByPrimaryKey(Category record);

    /**
     * 根据父节点categoryId 查询子节点的category信息
     *
     * @param parentId 父节点id
     * @return
     */
    List<Category> selectCategoryByChildrenByParentId(Integer parentId);
}