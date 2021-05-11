package com.kgc.springbootymw.dao.product;


import com.kgc.springbootymw.dao.IBaseDao;
import com.kgc.springbootymw.param.ProductCategoryParam;
import com.kgc.springbootymw.pojo.ProductCategory;

import java.util.List;
import java.util.Map;

/**
 * Created by bdqn on 2016/5/12.
 * addObject(UserAddress userAddress)
 * getRowList(params)
 * getRowCount(params)
 * getById(Integer id)
 * updateByQuery(params)
 */
public interface ProductCategoryDao extends IBaseDao {

	/**
	 * 根据id删除商品
	 * @param parseLong
	 */
	void deleteById(Integer parseLong);//删除商品分类
	/**
	 * 根据条件查询商品列表
	 * @param param
	 */
	public List<ProductCategory> queryProductCategorylist(ProductCategoryParam param);
	/**
	 * 根据id查询商品分类
	 * @param param
	 */
	public ProductCategory queryProductCategoryById(Integer id);
	/**
	 * 添加商品分类
	 * @param param
	 */
	public Integer add(ProductCategory productCategory) ;
	/**
	 * 根据参数查询商品分类的数目
	 * @param param
	 */
	public Integer queryProductCategoryCount(ProductCategoryParam param);
	/**
	 * 修改商品分类
	 * @param param
	 */
	public void update(ProductCategory productCategory) ;


	/*public List<ProductCategory> yiji();
	public  List<Map<String,Object>> erji( Integer parentId);

    List<ProductCategory> ersanji(Integer parentId);*/

}
