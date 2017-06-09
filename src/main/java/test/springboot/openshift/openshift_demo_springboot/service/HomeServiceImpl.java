package test.springboot.openshift.openshift_demo_springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import test.springboot.openshift.openshift_demo_springboot.dao.HomeRepo;

@Service
public class HomeServiceImpl implements HomeService {
	@Autowired
	private HomeRepo homeRepo;
	/*
	 * this method gets the market value for each stock, sums it up and returns
	 * the total value of the portfolio.
	 */
	/*public Double getTotalValue() {
		Double value = 0.0;
		for (Stock stock : this.stocks) {
			value += (stockMarket.getPrice(stock.getName()) * stock
					.getQuantity());
		}
		
		value = stockMarket.getPrice("");
		return value;
	}*/

}
