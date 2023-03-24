package dao;

import org.springframework.stereotype.Repository;
import pojo.Groomer;
import pojo.Manager;
@Repository
public interface GroomerMapper {
    int addGroomer(Groomer groomer);


    //通过groomer_name删除groomer;
    int deleteByGroomerName(String groomer_name);
    //通过groomer_id删除groomer;
    int deleteByGroomerId(int employee_id);
    int deleteByGroomer();

    //更新groomer
    int updateGroomer(Groomer groomer);

    //查询groomer
    Groomer QueryGroomerByName(String groomer_name);

    Groomer QueryGroomerById(int employee_id);
}
