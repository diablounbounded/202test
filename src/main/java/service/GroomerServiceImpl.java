package service;

import dao.GroomerMapper;
import org.springframework.stereotype.Service;
import pojo.Groomer;
import pojo.OrderInfo;

import java.util.List;
@Service("groomerService")
public class GroomerServiceImpl implements GroomerService{
    private GroomerMapper groomerMapper;
    @Override
    public Groomer getGroomer(int employee_id) {
        return groomerMapper.QueryGroomerById(employee_id);
    }

    @Override
    public List<OrderInfo> orderinfo(int employee_id) {
        return null;
    }
}
