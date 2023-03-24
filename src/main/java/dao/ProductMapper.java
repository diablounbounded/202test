package dao;

import pojo.Card;
import pojo.Product;

public interface ProductMapper {
    int addProduct(Product product);


    //删除一个Card int addBook(books books);
    //int deleteCardById(int card_id);
    int deleteProduct();

    //更新一个Card
    int updateProduct(Product product);

    //查询一个Card
    Card QueryCardById(int card_id);
}
