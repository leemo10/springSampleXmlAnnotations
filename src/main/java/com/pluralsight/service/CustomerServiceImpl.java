package com.pluralsight.service;

import com.pluralsight.model.Customer;
import com.pluralsight.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by leemorris on 25/08/2016.
 */

@Service("customerService")
public class CustomerServiceImpl implements CustomerService {


    //@Autowired
    private CustomerRepository customerRepository;



    public CustomerServiceImpl(){

    }


    public CustomerServiceImpl(CustomerRepository customerRepository){
        System.out.println("boom spring");
        this.customerRepository = customerRepository;

    }

    @Autowired
    public void setCustomerRepository(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }


    @Override
    public List<Customer> findAll(){
        return customerRepository.findAll();
    }
}
