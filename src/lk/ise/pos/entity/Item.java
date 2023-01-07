package lk.ise.pos.entity;

/**
 * @author : W.W.M.H.Chamuditha
 * @since : 1/7/2023
 **/
public class Item {

    private String code;
    private String  description;
    private String qtyOnHand;
    private double salary;

    public Item(String code, String description, String qtyOnHand, double salary) {
        this.code = code;
        this.description = description;
        this.qtyOnHand = qtyOnHand;
        this.salary = salary;
    }

    public Item() {
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getQtyOnHand() {
        return qtyOnHand;
    }

    public void setQtyOnHand(String qtyOnHand) {
        this.qtyOnHand = qtyOnHand;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
