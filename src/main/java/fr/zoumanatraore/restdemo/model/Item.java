package fr.zoumanatraore.restdemo.model;

// Generated 31 ao�t 2012 17:55:31 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Item generated by hbm2java
 */
@Entity
@Table(name = "item", catalog = "abiyan")
@XmlRootElement
public class Item implements java.io.Serializable {

	private int id;
	private Tag tag;
	private String category;
	private String type;
	private String price;
	private String creationDate;
	private String lastUpdate;
	private String numberInStock;

	public Item() {
	}

	public Item(int id, String category, String type) {
		this.id = id;
		this.category = category;
		this.type = type;
	}

	public Item(int id, Tag tag, String category, String type, String price,
			String creationDate, String lastUpdate, String numberInStock) {
		this.id = id;
		this.tag = tag;
		this.category = category;
		this.type = type;
		this.price = price;
		this.creationDate = creationDate;
		this.lastUpdate = lastUpdate;
		this.numberInStock = numberInStock;
	}

	@Id
	@Column(name = "id", unique = true, nullable = false)
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "tag")
	public Tag getTag() {
		return this.tag;
	}

	public void setTag(Tag tag) {
		this.tag = tag;
	}

	@Column(name = "category", nullable = false, length = 45)
	public String getCategory() {
		return this.category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	@Column(name = "type", nullable = false, length = 45)
	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Column(name = "price", length = 45)
	public String getPrice() {
		return this.price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	@Column(name = "creationDate", length = 45)
	public String getCreationDate() {
		return this.creationDate;
	}

	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}

	@Column(name = "lastUpdate", length = 45)
	public String getLastUpdate() {
		return this.lastUpdate;
	}

	public void setLastUpdate(String lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

	@Column(name = "numberInStock", length = 45)
	public String getNumberInStock() {
		return this.numberInStock;
	}

	public void setNumberInStock(String numberInStock) {
		this.numberInStock = numberInStock;
	}

}
