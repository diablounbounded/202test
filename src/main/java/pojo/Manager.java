package pojo;

public class Manager {
    public String manager_name;
    public String phone;

    public String password;

    public int manager_id;

    public Manager(String manager_name, String phone, String passward, int manager_id) {
        this.manager_name = manager_name;
        this.phone = phone;
        this.password = passward;
        this.manager_id = manager_id;
    }

    public String getManager_name() {
        return manager_name;
    }

    public void setManager_name(String manager_name) {
        this.manager_name = manager_name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassward() {
        return password;
    }

    public void setPassward(String passward) {
        this.password = passward;
    }

    public int getManager_id() {
        return manager_id;
    }

    public void setManager_id(int manager_id) {
        this.manager_id = manager_id;
    }
}
