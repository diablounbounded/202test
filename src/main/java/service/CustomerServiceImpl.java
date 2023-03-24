package service;

import dao.*;
import org.springframework.stereotype.Service;
import pojo.*;

import java.util.List;
@Service("customerServiceImpl")
public class CustomerServiceImpl implements CustomerService{
    private CustomerMapper customerMapper;
    private ManagerMapper managerMapper;

    private GroomerMapper groomerMapper;
    private PetMapper petMapper;
    private OrderMapper orderMapper;
    private ServiceMapper serviceMapper;

    private CardMapper cardMapper;
    Customer customer;

    @Override
    public List<Pet> getPet(String owner_phone) {
        return petMapper.QueryPetByOwner(owner_phone);
    }

    @Override
    public List<OrderInfo> orderinfo(int phone) {
        return orderMapper.QueryOrderByPhone(phone);
    }

    @Override
    public int updateCustomer(Customer customer) {
        return customerMapper.UpdateCustomer(customer);
    }

    public String deleteCustomer(int phone){
        Customer customer=customerMapper.QueryCustomerByPhone(phone);
        customerMapper.deleteByPhone(phone);

        return customer.phone +"has been deleted";
    }

    public String addPet(Pet pet){
        petMapper.addPet(pet);
        return "a new pet is added";
    }

    public String updatePet(Pet pet){

        petMapper.updatePet(pet);
        return "successfully update pet";
    }

    public String deletePet(int pet_id){
        petMapper.deleteByPetId(pet_id);
        return "successfully delete";
    }

    public String updatePassword(int phone,String new_password){
        customerMapper.UpdatePassword(phone,new_password);
        return "successfully update password";
    }


    public Groomer viewGroomers(int employee_id){
        Groomer groomer=groomerMapper.QueryGroomerById(employee_id);
        return groomer;
    }

    public List<pojo.Service> viewAllService(){
        List<pojo.Service> list=serviceMapper.QueryService();
        return list;
    }

    public String viewServiceDetails(String type){
        String content=serviceMapper.QueryServiceByName(type);
        return content;
    }
    public List<OrderInfo> viewAllOrders(int phone){
        List list=orderMapper.QueryOrderByPhone(phone);
        return list;
    }

    public OrderInfo viewOrderDetails(String order_id){
        OrderInfo order=orderMapper.QueryOrderById(order_id);
        String employee_id=order.employee_id;
        String pet_id=order.pet_id;
        String pet_type=petMapper.QueryPetById(pet_id).type;
        String status=order.status;

        String service_type=order.service_type;

        return order;
    };

    public String deleteOrder(Customer customer,String order_id){
        List<OrderInfo> list=orderMapper.QueryOrderByPhone(customer.phone);
        for(OrderInfo item : list){
            if(item.order_id==order_id){
                orderMapper.deleteOrderById(order_id);
                return "order has been deleted";
            }

            return "Your input is not correct";
        }
        return "Your input is not correct";

    }

    public List<OrderInfo> QueryOrderByPet(Customer customer,String pet_id){
        //List list=orderMapper.QueryOrderByPet(pet_id);
        List<OrderInfo> list=orderMapper.QueryOrderByPhone(customer.phone);
        List<OrderInfo> list2;
        for(OrderInfo item: list){
            if(item.pet_id==pet_id){
                list2=orderMapper.QueryOrderByPet(pet_id);
                return list2;
            }
        }
        return null;
    };

    public OrderInfo QueryOrderById(Customer customer,String order_id){
        List<OrderInfo> list=orderMapper.QueryOrderByPhone(customer.phone);
        OrderInfo orderInfo;
        for(OrderInfo item : list){
            if(item.order_id==order_id){
                orderInfo=orderMapper.QueryOrderById(order_id);
                return orderInfo;
            }


        }
        return null;
    }

    public List<OrderInfo> QueryOderByPhone(int phone){
        List list=orderMapper.QueryOrderByPhone(phone);
        return list;
    }

    public String createVip(int money,int phone){
        if(money>=1000){

            Customer customer=customerMapper.QueryCustomerByPhone(phone);
            customer.card_id=customer.phone;
            Card card=cardMapper.QueryCardById(customer.card_id);
            card.balance=money;
            customerMapper.UpdateCustomer(customer);
        }
        return "charge vip successfully";
    };

    public String chargeVip(int money,int phone){
        if(money>=0){

            Customer customer=customerMapper.QueryCustomerByPhone(phone);
            customer.card_id=customer.phone;
            Card card=cardMapper.QueryCardById(customer.card_id);
            card.balance=card.balance+money;
            customerMapper.UpdateCustomer(customer);
        }
        return "charge vip successfully";
    };

}
