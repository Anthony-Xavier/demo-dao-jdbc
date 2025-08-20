package modle.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

public class Seller implements Serializable {

    private int Id;
    private String name;
    private String email;
    private Date bithDate;
    private Double baseSalary;

    private Department department;

    public Seller(){};

    public Seller(int id, String name, String email, Date bithDate, Double baseSalary, Department department) {
        Id = id;
        this.name = name;
        this.email = email;
        this.bithDate = bithDate;
        this.baseSalary = baseSalary;
        this.department = department;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getBithDate() {
        return bithDate;
    }

    public void setBithDate(Date bithDate) {
        this.bithDate = bithDate;
    }

    public Double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Seller seller = (Seller) o;
        return Id == seller.Id && Objects.equals(name, seller.name) && Objects.equals(email, seller.email) && Objects.equals(bithDate, seller.bithDate) && Objects.equals(baseSalary, seller.baseSalary) && Objects.equals(department, seller.department);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Id, name, email, bithDate, baseSalary, department);
    }

    @Override
    public String toString() {
        return "Seller{" +
                "Id=" + Id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", bithDate=" + bithDate +
                ", baseSalary=" + baseSalary +
                ", department=" + department +
                '}';
    }
}
