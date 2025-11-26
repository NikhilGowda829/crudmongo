package com.mando.crudmango.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.mando.crudmango.Repository.CustRepo;
import com.mando.crudmango.model.Customer;

@RestController
@RequestMapping("/cust")  
public class CustController {

    @Autowired
    CustRepo custrepo;

 
    @PostMapping
    public Customer addCust(@RequestBody Customer customer) {
    	return custrepo.save(customer);
    }

   
    @GetMapping
    public List<Customer> getCust() {
        return custrepo.findAll();
    }

    
    @DeleteMapping("/{cid}")
    public String delCust(@PathVariable String cid) {
        custrepo.deleteById(cid);
        return "Customer with ID " + cid + " deleted successfully";
    }
    @PutMapping("/{cid}")
    public Customer update(@PathVariable String cid ,@RequestBody Customer customer) {
    	return custrepo.findById(cid)
    			.map(existing ->{
    				existing.setCname(customer.getCname());
    				existing.setFname(customer.getFname());
    				existing.setLname(customer.getLname());
    				existing.setLocation(customer.getLocation());
    				System.out.println("updated");
    				return custrepo.save(existing) ;
    				
    				
    			})
    			.orElse(null);
    	
    }


    }

