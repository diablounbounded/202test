package dao;

import org.springframework.stereotype.Repository;
import pojo.Card;
import pojo.OrderInfo;

import java.util.Date;
import java.util.List;

@Repository
public interface OrderMapper {
    int addOrder(OrderInfo orderinfo);


    //删除一个Card int addBook(books books);
    int deleteOrderById(String order_id);
    int deleteOrder();

    //更新一个Card
    int updateOrder(OrderInfo orderinfo);

    //查询一个Card
    OrderInfo QueryOrderById(String order_id);
    List<OrderInfo> QueryOrderByPet(String pet_id);
    List<OrderInfo> QueryOrderByPhone(int phone);

    List<OrderInfo> QueryOrders();

    List<OrderInfo> QueryOrderByDate(Date start_time);

    List<OrderInfo> QueryOrderByEndDate(Date end_time);

    List<OrderInfo> QueryOrderByStatus(String status);



}
