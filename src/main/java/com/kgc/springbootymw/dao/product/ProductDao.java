package com.kgc.springbootymw.dao.product;


import com.kgc.springbootymw.dao.IBaseDao;
import com.kgc.springbootymw.pojo.Product;

import java.util.List;

/**
 * 商品查询Dao
 *
 * deleteById(Integer id)
 * getById(Integer id)
 * getRowCount(params)
 * getRowList(params)
 *
 */
public interface ProductDao extends IBaseDao {

	Integer updateStock(Integer id, Integer quantity) throws Exception;
	
	public Integer add(Product product) throws Exception;

	public Integer update(Product product) throws Exception;
	
	public Integer deleteProductById(Integer id) throws Exception;
	
	public Product getProductById(Integer id)throws Exception;
	
	public List<Product> getProductList(Integer currentPageNo,Integer pageSize,String proName,Integer categoryId,Integer level)throws Exception;
	
	public Integer queryProductCount(String proName,Integer categoryId,Integer level)throws Exception;
}
