package com.restAPI.product.entity;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="PRODUCTCATEGORY")
public class ProductCategory {
	
	@Id
	@Column(name="categoryid")
	private long categoryID;
	
	@Column(name="categoryname")
	private String categoryName;
	
	public ProductCategory() {
		
	}
	
	public ProductCategory(long categoryID , String categoryName) {
		this.categoryID = categoryID;
		this.categoryName = categoryName;
		
	}

	public long getCategoryID() {
		return categoryID;
	}

	public void setCategoryID(long categoryID) {
		this.categoryID = categoryID;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
     
	@Override
	public String toString() {
		return "ProductCategory [categoryID=" + categoryID + ", categoryName=" + categoryName + "]";
	}
	
}