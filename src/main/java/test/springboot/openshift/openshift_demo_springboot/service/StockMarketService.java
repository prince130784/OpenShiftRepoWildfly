package test.springboot.openshift.openshift_demo_springboot.service;

import java.util.Collection;

import test.springboot.openshift.openshift_demo_springboot.domain.Portfolio;
import test.springboot.openshift.openshift_demo_springboot.domain.Stock;

public interface StockMarketService {

	void createPortFolio(Portfolio portfolio);
	void createStock(Stock stock);
	Collection<Portfolio> getAllPortfolio();
	Collection<Stock> getAllStocksForPortfolio(Portfolio portfolio);
	Boolean addStockToPortfolio(Portfolio portfolio, Stock stock);
	Boolean deleteStockFromPortfolio(Portfolio portfolio, Stock stock);
	
	
}
