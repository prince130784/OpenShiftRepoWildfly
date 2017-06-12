package test.springboot.openshift.openshift_demo_springboot.dao;

import org.springframework.data.repository.CrudRepository;

import test.springboot.openshift.openshift_demo_springboot.domain.Portfolio;

public interface PortfolioRepo extends CrudRepository<Portfolio, Long> {

}
