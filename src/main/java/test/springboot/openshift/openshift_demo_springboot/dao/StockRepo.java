package test.springboot.openshift.openshift_demo_springboot.dao;

import org.springframework.data.repository.CrudRepository;

import test.springboot.openshift.openshift_demo_springboot.domain.Stock;

public interface StockRepo extends CrudRepository<Stock, Long> {

}
