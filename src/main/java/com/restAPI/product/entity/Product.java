package com.restAPI.product.entity;


import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="PRODUCT")
public class Product {
	
	@Id
	@Column(name="productid")
	private long productID;
	
	@Column(name="sku")
	private String SKU;
	
	@Column(name="productname")
	private String productName;
	
	@Column(name="productdescription")
	private String productDescription;
	
	@Column(name="unitprice")
	private double unitPrice;
	
	@Column(name="imageurl")
	private String imageURL;
	
	@Column(name="activebit")
     private int activeBit;	
	
	@Column(name="unitinstock")
	private int unitsInStock;
	
	@Column(name="datecreated")
	private Date dateCreated;
	
	@Column(name="lastupdated")
	private Date lastUpdated;
	
	@Column(name="categoryid")
	private long categoryID;
	
	public Product() {
		
	}
	
	public Product(long productID,String SKU,String productName,String productDescription,double unitPrice,String imageURL,int activeBit
			,int unitsInStock,Date dateCreated ,Date lastUpdated ,long categoryID) {
		this.productID = productID;
		this.SKU = SKU;
		this.productName = productName;
		this.productDescription = productDescription;
		this.unitPrice = unitPrice;
		this.imageURL = imageURL;
		this.activeBit = activeBit;
		this.unitsInStock = unitsInStock;
		this.dateCreated = dateCreated;
		this.lastUpdated = lastUpdated;
		this.categoryID = categoryID;
	
	}

	

	public long getProductID() {
		return productID;
	}

	public void setProductID(long productID) {
		this.productID = productID;
	}

	public String getSKU() {
		return SKU;
	}

	public void setSKU(String sKU) {
		SKU = sKU;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public int getActiveBit() {
		return activeBit;
	}



	public void setActiveBit(int activeBit) {
		this.activeBit = activeBit;
	}



	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public String getImageURL() {
		return imageURL;
	}

	public void setImageURL(String imageURL) {
		this.imageURL = imageURL;
	}

	public int getUnitsInStock() {
		return unitsInStock;
	}

	public void setUnitsInStock(int unitsInStock) {
		this.unitsInStock = unitsInStock;
	}

	public Date getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}

	public Date getLastUpdated() {
		return lastUpdated;
	}

	public void setLastUpdated(Date lastUpdated) {
		this.lastUpdated = lastUpdated;
	}

	public long getCategoryID() {
		return categoryID;
	}

	public void setCategoryID(long categoryID) {
		this.categoryID = categoryID;
	}
	
	
	@Override
	public String toString() {
		return "Product [productID=" + productID + ", SKU=" + SKU + ", productName=" + productName
				+ ", productDescription=" + productDescription + ", unitPrice=" + unitPrice + ", imageURL=" + imageURL
				+ ",ActiveBit=" + activeBit + ", unitsInStock=" + unitsInStock + ", dateCreated=" + dateCreated + ", lastUpdated=" + lastUpdated
				+ ", categoryID=" + categoryID + "]";
	}
	
	

}
