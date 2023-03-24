package pojo;

import java.util.Date;

public class OrderInfo {
    public int phone;
    public String employee_id;
    public String pet_id;
    public String order_id;
    public Date start_time;

    public Date end_time;
    public String status;

    public String notes;
    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getService_type() {
        return service_type;
    }

    public void setService_type(String service_type) {
        this.service_type = service_type;
    }

    public String service_type;

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }



    public int getOwner_phone() {
        return phone;
    }

    public void setOwner_phone(int owner_phone) {
        this.phone = owner_phone;
    }

    public String getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(String employee_id) {
        this.employee_id = employee_id;
    }

    public String getPet_id() {
        return pet_id;
    }

    public void setPet_id(String pet_id) {
        this.pet_id = pet_id;
    }

    public String getOrder_id() {
        return order_id;
    }

    public void setOrder_id(String order_id) {
        this.order_id = order_id;
    }

    public Date getStart_time() {
        return start_time;
    }

    public void setStart_time(Date start_time) {
        this.start_time = start_time;
    }

    public Date getEnd_time() {
        return end_time;
    }

    public void setEnd_time(Date end_time) {
        this.end_time = end_time;
    }

    public String getStatus() {
        return status;
    }

    public OrderInfo(Customer customer, Groomer groomer, Pet pet, OrderInfo order, Date start_time, Date end_time, String status, String notes) {
        this.phone = customer.phone;
        this.employee_id = groomer.groomer_name;
        this.pet_id = pet.pet_id;
        this.order_id = order.order_id;
        this.start_time = start_time;
        this.end_time = end_time;
        this.status = status;
        this.notes = notes;
        this.service_type=service_type;
    }

    public OrderInfo(int phone, String groomer_name, String pet_id, String order_id, Date start_time, Date end_time, String status, String notes,String service_type) {
        this.phone = phone;
        this.employee_id = groomer_name;
        this.pet_id = pet_id;
        this.order_id = order_id;
        this.start_time = start_time;
        this.end_time = end_time;
        this.status = status;
        this.notes = notes;
        this.service_type=service_type;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
