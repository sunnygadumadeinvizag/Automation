package preconditions;

import java.util.Objects;

public class Product {

    private String name;
    private int price;
    private String category;
    private String grade;


    public Product(String name, int price, String category, String grade) {
        super();
        this.name = name;
        this.price = price;
        this.category = category;
        this.grade = grade;
    }

    public Product(String name, int price) {
        super();
        this.name = name;
        this.price = price;
    }


    @Override
    public int hashCode() {
        return Objects.hash(category, grade, name, price);
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Product other = (Product) obj;
        return Objects.equals(category, other.category) && Objects.equals(grade, other.grade)
                && Objects.equals(name, other.name) && price == other.price;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }


}
