package service;

import pojo.books;
//业务接口
public interface BookService {

    //增加一本书
    int addBook(books books);

    //删除一本书
    int deleteByid(int id);
    //更新一本书
    int updateBook(books books);
    //查询一本书
    books queryBookById(int id);
}
