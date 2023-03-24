package service;

import pojo.*;

import java.util.List;

public interface CustomerService {
    String addPet(Pet pet);

    String updatePet(Pet pet);
    List<Pet> getPet(String owner_phone);

    String deletePet(int pet_id);

    String updatePassword(int phone,String new_password);

    List<OrderInfo> orderinfo(int phone);

    //账户
    int updateCustomer(Customer customer);

    String deleteCustomer(int phone);


    Groomer viewGroomers(int employee_id);

    List<Service> viewAllService();

    //查看服务详情
    String viewServiceDetails(String type);
    //客户查看所有预约
    List<OrderInfo> viewAllOrders(int phone);
    //客户搜索预约
    List<OrderInfo> QueryOrderByPet(Customer customer,String pet_id);
    OrderInfo QueryOrderById(Customer customer,String order_id);

    List<OrderInfo> QueryOderByPhone(int phone);
    //客户查看预约详情
    OrderInfo viewOrderDetails(String order_id);

    String deleteOrder(Customer customer,String order_id);

    //办理会员
    String createVip(int money,int phone);

    String chargeVip(int money,int phone);
}
