package service;

import pojo.Customer;
import pojo.Groomer;
import pojo.OrderInfo;

import java.util.List;

public interface GroomerService {
    List<OrderInfo> orderinfo(int employee_id);
    Groomer getGroomer(int employee_id);
}
