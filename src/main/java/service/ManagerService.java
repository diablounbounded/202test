package service;

import pojo.*;

import java.util.List;

public interface ManagerService {
    //管理所有的groomers
    String saveGroomers(Groomer groomer);
//    int deleteGroomer();
    String deleteGroomer(int employee_id);
    String updateGroomer(Groomer groomer);

    String addAdvertise();

    String updateAdvertise();

    String deleteAdvertise(String ad_id);
    //查看所有预约
    List<OrderInfo> viewAllOrder();

    //搜索预约
    List<OrderInfo> QueryOrderByPet(String pet_id);
    OrderInfo QueryOrderById(String order_id);

    List<OrderInfo> QueryOderByPhone(int phone);
    String deleteOrderByPhone(int phone);

    String deleteOrderByOrder_id(String order_id);






    Groomer getGroomer(int employee_id);
    List<Groomer> getAllGroomer(String groomer_name);
    List<Groomer> getAllGroomer(int rank);
    List<Groomer> getAllGroomer();

//    int save(Manager manager);
//    int deleteManager();
    int updateManager(Manager manager);
    Manager getManager(int manager_id);
    List<Manager> getAllManager(String manager_name);

//    int save(Customer customer);
    String deleteCustomer(String phone);
    int updateCustomer(Customer customer);
    Customer getCustomer(String phone);
    List<Manager> getAllCustomer(String user_name);
    List<Groomer> getAllCustomer();

    List<OrderInfo> orderinfo();
    List<OrderInfo> orderinfo(int exployee_id);
    List<OrderInfo> orderinfo(String phone);

    String addService(Service service);



}
