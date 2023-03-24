package pojo;

public class Service {
    public String type_name;
    public String description;
    public int price;

    public String getType() {
        return type_name;
    }

    public void setType(String type) {
        this.type_name = type;
    }

    public String getType_name() {
        return type_name;
    }

    public void setType_name(String type_name) {
        this.type_name = type_name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
//    public int getType_id() {
//        return type_id;
//    }
//
//    public void setType_id(int type_id) {
//        this.type_id = type_id;
//    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Service(String type, String description, int price) {
        this.type_name = type;
        this.description = description;
        this.price = price;
    }
}
