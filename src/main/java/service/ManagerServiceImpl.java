package service;

import dao.*;
import org.springframework.stereotype.Service;
import pojo.Customer;
import pojo.Groomer;
import pojo.OrderInfo;

import java.util.List;

@Service("managerServiceImpl")
public class ManagerServiceImpl implements ManagerService{
    private CustomerMapper customerMapper;
    private ManagerMapper managerMapper;
    private ServiceMapper serviceMapper;
    private GroomerMapper groomerMapper;
    private OrderMapper orderMapper;
    private AdvertisementMapper advertisementMapper;
    public String deleteCustomer(int phone){
        Customer customer=customerMapper.QueryCustomerByPhone(phone);
        customerMapper.deleteByPhone(phone);

        return customer.phone +"has been deleted";
    }

    public String saveGroomers(Groomer groomer){
        groomerMapper.addGroomer(groomer);
        return "new groomer has been added";
    }

    public String updateGroomer(Groomer groomer){
        groomerMapper.updateGroomer(groomer);
        return "groomer information has been updated";
    }

    public String deleteGroomer(int employee_id){
        groomerMapper.deleteByGroomerId(employee_id);
        return "groomer has been deleted";
    }

    public String addService(pojo.Service service){
        serviceMapper.addService(service);
        return "new service is added";
    };

    public String deleteAdvertise(String ad_id){
        advertisementMapper.deleteAdvertise(ad_id);
        return "Advertisement has been deleted";
    }

    public List<OrderInfo> viewAllOrder(){
        List list= orderMapper.QueryOrders();
        return list;
    }

    public List<OrderInfo> QueryOrderByPet(String pet_id){
        List<OrderInfo> list=orderMapper.QueryOrderByPet(pet_id);
        return list;
    }

    public OrderInfo QueryOrderById(String order_id){
        OrderInfo orderInfo=orderMapper.QueryOrderById(order_id);
        return orderInfo;
    }

    public List<OrderInfo> QueryOderByPhone(int phone){
        List<OrderInfo> list=orderMapper.QueryOrderByPhone(phone);
        return list;
    }

    public String deleteOrderByPhone(int phone){
        orderMapper.QueryOrderByPhone(phone);
        return "successfully delete by phone";
    }

    public String deleteOrderByOrder_id(String order_id){
        orderMapper.deleteOrderById(order_id);
        return "successfully delete order_id";
    }
}
