package dao;
import pojo.books;
public interface BookMapper {

    //增加一本书
    int addBook(books books);

    //删除一本书
    int deleteByid(int id);
    //更新一本书
    int updateBook(books books);
    //查询一本书
    books queryBookById(int id);
}
