package test.springboot.openshift.openshift_demo_springboot.domain;

import java.util.Set;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;


@Entity(name="TBL_PORTFOLIO")
public class Portfolio {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="PORTFOLIO_ID")
	private Long portfolioId;
	
	@Column(name="PORTFOLIO_NAME")
	private String name;
		
	/*@OneToMany(fetch=FetchType.LAZY, mappedBy="portfolio", cascade=CascadeType.PERSIST)
	private Set<PortfolioStocks> stocks;*/

	@ElementCollection
	@CollectionTable(name="TBL_PORTFOLIO_STOCKS", foreignKey=@ForeignKey(name="TBL_PORTFOLIO_PORFOLIO_ID_FK"), 
	joinColumns=@JoinColumn(name="PORFOLIO_REF_ID" , referencedColumnName="PORTFOLIO_ID"))
	private Set<PortfolioStocks> portfolioStocks;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
}