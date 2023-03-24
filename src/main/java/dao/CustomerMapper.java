package dao;

import org.springframework.stereotype.Repository;
import pojo.Card;
import pojo.Customer;
import pojo.OrderInfo;

import java.util.List;

@Repository
public interface CustomerMapper {
    //创建一个Customer;
    int addCustomer(Customer customer);


    //删除一个Card int addBook(books books);

    //int deleteCustomer();
    void deleteByPhone(int phone);

    //更新一个Card
    int UpdateCustomer(Customer customer);

    int UpdatePassword(int phone, String password);

    //查询
    //Customer QueryCustomer(String user_name);
    Customer QueryCustomerByPhone(int phone);
    //查询
    Customer QueryCustomerByCardId(int card_id);


}
