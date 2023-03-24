package service;

import dao.CustomerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pojo.Customer;
import pojo.Groomer;
import pojo.Manager;

import java.util.List;


public interface AccountService {
    Customer save(String user_name,String password, int phone);

    Customer isCustomer(int phone,String password);

    //int save(Manager manager);

    Manager isManager(int phone,String password);


    //int save(Groomer groomer);
    //int deleteGroomer(int exployee_id);


}
