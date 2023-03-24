package dao;

import org.springframework.stereotype.Repository;
import pojo.Card;
import pojo.Comments;
@Repository
public interface CommentsMapper {
    int addComments(Comments comments);
    int addComments(String text);


    //删除

    int deleteComments();

    //更新
    //int updateComments(Comments comments);

    //查询

    Comments QueryCommentsByText(String text);
}
