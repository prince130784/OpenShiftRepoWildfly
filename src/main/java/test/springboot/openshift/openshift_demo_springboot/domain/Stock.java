package test.springboot.openshift.openshift_demo_springboot.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="TBL_STOCK")
public class Stock {

	@Id
	@Column(name="STOCK_ID")
	private Long stockId;

	@Column(name="STOCK_NAME")
	private String name;

	@Column(name="STOCK_QTY")
	private int quantity;

	@Column(name="STOCK_PRICE")
	private Double price;

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	
}
