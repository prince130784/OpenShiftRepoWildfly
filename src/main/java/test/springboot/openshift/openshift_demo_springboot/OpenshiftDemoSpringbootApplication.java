package test.springboot.openshift.openshift_demo_springboot;

import java.util.Collection;
import java.util.Date;
import java.util.HashSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import test.springboot.openshift.openshift_demo_springboot.dao.PortfolioRepo;
import test.springboot.openshift.openshift_demo_springboot.domain.Portfolio;
import test.springboot.openshift.openshift_demo_springboot.domain.PortfolioStocks;

@SpringBootApplication
public class OpenshiftDemoSpringbootApplication implements CommandLineRunner {

	@Autowired
	private PortfolioRepo repo;
	
	public static void main(String[] args) {
		SpringApplication.run(OpenshiftDemoSpringbootApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Portfolio portfolio = new Portfolio();
		portfolio.setName("Portfolio");
		Collection<PortfolioStocks> pStockColl = new HashSet<>();
		PortfolioStocks pStocks = new PortfolioStocks();
		pStocks.setCreatedDate(new Date());
		pStocks.setLstUpdDate(new Date());
		pStocks.setName("Stock 1");
		pStocks.setStockId(1l);
		pStocks.setQuantity(2);
		
		pStockColl.add(pStocks);
		
		portfolio.setPortfolioStocks(pStockColl);
		
		repo.save(portfolio);
		
	}
	
}

/*@RestController
class HomeController{
	
	@GetMapping("/")
	public String response(){
		return "Hello Ravinderjeet!! Welcome to your first Cloup App";
	}
}*/
