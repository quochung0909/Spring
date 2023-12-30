package com.nqh.springjpa.service;

import com.nqh.springjpa.dao.CustomerDAO;
import com.nqh.springjpa.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private CustomerDAO customerDAO;

    public List<Customer> getAllUser() {
        return customerDAO.findAll();
    }

    public void saveUser(Customer customer) {
        customerDAO.save(customer);
    }

    public void deleteUser(int id) {
        customerDAO.deleteById(id);
    }

    public Optional<Customer> findUserById(int id) {
        return customerDAO.findById(id);
    }

    public Page<Customer> findPaginated(int pageNo, int pageSize) {
        return customerDAO.findAll(org.springframework.data.domain.PageRequest.of(pageNo - 1, pageSize));
    }

    public List<Customer> searchUser(String keyword) {
        return customerDAO.search(keyword);
    }



}
