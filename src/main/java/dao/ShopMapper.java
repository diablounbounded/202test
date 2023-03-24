package dao;

import org.springframework.stereotype.Repository;
import pojo.Shop;
@Repository
public interface ShopMapper {

    int add(Shop shop);

    //删除一本书
    //int deleteByid(int id);
    //更新一本书
    int update(Shop shop);
    //查询一本书
    //books queryBookById(int id);
}
