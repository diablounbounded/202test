package pojo;

public class Groomer {
    public String groomer_name;
    public String filepath;

    public int rank;
    public String exp;
    public int employee_id;


    public String getFilepath() {
        return filepath;
    }

    public void setFilepath(String filepath) {
        this.filepath = filepath;
    }

    public String getGroomer_name() {
        return groomer_name;
    }

    public void setGroomer_name(String groomer_name) {
        this.groomer_name = groomer_name;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public String getExp() {
        return exp;
    }

    public void setExp(String exp) {
        this.exp = exp;
    }

    public int getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(int employee_id) {
        this.employee_id = employee_id;
    }

    public Groomer(String groomer_name, int rank, String exp, int employee_id) {
        this.groomer_name = groomer_name;

        this.rank = rank;
        this.exp = exp;
        this.employee_id = employee_id;
    }
}
