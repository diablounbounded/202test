package dao;

import org.springframework.stereotype.Repository;
import pojo.Card;
import pojo.Manager;
@Repository
public interface ManagerMapper {
    int addManager(Manager manager);


    //删除一个Card int addBook(books books);
    int deleteManagerByName(String manager_name);
    int deleteManager(String phone);

    //更新一个Card
    int updateManager(Manager manager);

    //查询一个Card
    Manager QueryManagerByPhone(int manager_phone);
}
