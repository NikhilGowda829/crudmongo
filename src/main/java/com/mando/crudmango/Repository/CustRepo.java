package com.mando.crudmango.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.mando.crudmango.model.Customer;

public interface CustRepo extends MongoRepository<Customer, String> {

}
