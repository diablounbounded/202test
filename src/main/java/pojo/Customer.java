package pojo;

public class Customer {
    public String user_name;
    public String password;
    //public int balance;
    //public int  vip_level;
    public int  card_id;

    public int phone;

    public Customer(String user_name, String password, Card card,int phone) {
        this.user_name = user_name;
        this.password = password;
        //this.vip_level = vip_level;
        this.card_id = card.card_id;
        this.phone = phone;
    }

    public Customer(String user_name, String password, int card_id,int phone) {
        this.user_name = user_name;
        this.password = password;
        //this.vip_level = vip_level;
        this.card_id = card_id;
        this.phone = phone;
    }

    public int getCard() {
        return card_id;
    }

    public void setCard(Card card) {
        card_id = card.card_id;
    }
    public void setCard(int card_id) {
        this.card_id = card_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }



//    //public int getVip() {
//        return vip_level;
//    }
//
//    public void setVip(int vip_level) {
//        this.vip_level = vip_level;
//    }
}
