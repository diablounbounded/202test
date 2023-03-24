package dao;

import org.springframework.stereotype.Repository;
import pojo.Card;
import pojo.Service;

import java.util.List;

@Repository
public interface ServiceMapper {
    //创建一个Card int addBook(books books);
    int addService(Service service);


    //删除一个Card int addBook(books books);
    int deleteServiceByName(String service_type);
    int deleteService();

    //更新一个Card
    int updateService(Service service);

    //查询一个Card
    String QueryServiceByName(String service_type);
    List<Service> QueryService();
}
