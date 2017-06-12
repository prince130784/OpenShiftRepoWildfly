package test.springboot.openshift.openshift_demo_springboot.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Embeddable
public class PortfolioStocks {

	
	/*@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="PORTFOLIO_STOCK_ID")
	private Long portfolioStockId;*/
	
	/*@ManyToOne	
	private Portfolio portfolio;*/
	
	
	
	@Column(name="STOCK_REF_ID")
	private Long  stockId;
	
	@Column(name="STOCK_NAME")
	private String name;

	@Column(name="STOCK_QTY")
	private int quantity;

	@Column(name="CREATE_DT")
	@Temporal(TemporalType.TIMESTAMP)
	private Date createdDate;

	@Column(name="LST_UPD_DT")
	@Temporal(TemporalType.TIMESTAMP)
	private Date lstUpdDate;

	private transient Double price;

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

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Date getLstUpdDate() {
		return lstUpdDate;
	}

	public void setLstUpdDate(Date lstUpdDate) {
		this.lstUpdDate = lstUpdDate;
	}

	public Long getStockId() {
		return stockId;
	}

	public void setStockId(Long stockId) {
		this.stockId = stockId;
	}

}
