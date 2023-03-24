package service;

import dao.BookMapper;
import dao.CustomerMapper;
import dao.GroomerMapper;
import dao.ManagerMapper;
import org.springframework.stereotype.Service;
import pojo.Customer;
import pojo.Groomer;
import pojo.Manager;
@Service("accountService")
public class AccountServiceImpl implements AccountService{
    private CustomerMapper customerMapper;
    private ManagerMapper managerMapper;

    private GroomerMapper groomerMapper;

    @Override
    public Customer save(String user_name,String password, int phone) {
        Customer customer=new Customer(user_name,password,-1, phone);
        customerMapper.addCustomer(customer);
       return customer;
    }

//    @Override
//    public int save(Manager manager) {
//        return managerMapper.addManager(manager);
//    }
    @Override
    public Customer isCustomer(int phone,String password){
        Customer customer;
        //查询数据库账户信息，并判断是否是customer还是manager
        if(password==(customerMapper.QueryCustomerByPhone(phone).password)){
            customer=customerMapper.QueryCustomerByPhone(phone);
            return customer;
        }

        return null;
    }

//    @Override
//    public int deleteManager(String phone) {
//        return managerMapper.deleteManager(phone);
//    }
    public Manager isManager(int phone,String password){
        Manager manager;
        if(password==(managerMapper.QueryManagerByPhone(phone).password)){
            manager=managerMapper.QueryManagerByPhone(phone);
            return  manager;
        }
        return null;
    }

//    public int save(Groomer groomer) {
//        return groomerMapper.addGroomer(groomer);
//    }


//    public int deleteGroomer(int exployee_id) {
//        return groomerMapper.addGroomer(groomer);
//    }
}
