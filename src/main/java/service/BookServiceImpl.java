package service;

import dao.BookMapper;
import org.springframework.stereotype.Service;
import pojo.books;
@Service("bookService")
public class BookServiceImpl implements BookService{
    //service调dao
    private BookMapper bookMapper;



    public void setBookMapper(BookMapper bookMapper){
        this.bookMapper=bookMapper;
    }
    //增加一本书
    public int addBook(books books){
        return bookMapper.addBook(books);
    };

    //删除一本书
    public int deleteByid(int id){
        return bookMapper.deleteByid(id);
    };
    //更新一本书
    public int updateBook(books books){
        return bookMapper.updateBook(books);
    };
    //查询一本书
    public books queryBookById(int id){
        return bookMapper.queryBookById(id);
    };

}
