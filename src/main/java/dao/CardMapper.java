package dao;

import org.springframework.stereotype.Repository;
import pojo.Card;
@Repository
public interface CardMapper {

    //创建一个Card int addBook(books books);
    int addCard(Card card);


    //删除一个Card int addBook(books books);
    int deleteCardById(int card_id);
    int deleteCard();

    //更新一个Card
    int updateCard(Card card);

    //查询一个Card
    Card QueryCardById(int card_id);

}
