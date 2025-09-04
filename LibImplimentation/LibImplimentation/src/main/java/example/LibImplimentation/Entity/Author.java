package example.LibImplimentation.Entity;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.*;


@Entity
public class Author
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private LocalDate dob;      // Date of Birth
    private List<String> awards; // Awards won by the author

    // ✅ Default constructor
    public Author() {
    }

    // ✅ Parameterized constructor
    public Author(int id, String name, LocalDate dob, List<String> awards) {
        this.id = id;
        this.name = name;
        this.dob = dob;
        this.awards = awards;
    }

    // ✅ Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public List<String> getAwards() {
        return awards;
    }

    public void setAwards(List<String> awards) {
        this.awards = awards;
    }

    // ✅ toString method
    @Override
    public String toString() {
        return "Author{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dob=" + dob +
                ", awards=" + awards +
                '}';
    }
}
