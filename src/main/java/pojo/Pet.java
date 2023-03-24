package pojo;

public class Pet {
    public String type;
    public String pet_name;
    public int owner_phone;

    public String pet_id;

    public String getType() {
        return type;
    }

    public String getPet_id() {
        return pet_id;
    }

    public void setPet_id(String pet_id) {
        this.pet_id = pet_id;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPet_name() {
        return pet_name;
    }



    public void setPet_name(String pet_name) {
        this.pet_name = pet_name;
    }

    public int getOwner() {
        return owner_phone;
    }

    public void setOwner(Customer owner) {
        this.owner_phone = owner.phone;
    }

    public Pet(String type, String pet_name, Customer owner, String pet_id) {
        this.type = type;
        this.pet_name = pet_name;
        this.owner_phone = owner.phone;
        this.pet_id = pet_id;
    }
}
