import org.sql2o.*;
import java.util.List;
import java.sql.Timestamp;

public class Animal {

    private String name;
    private String ranger;
    private String age;
    private String location;
    private String health;
    private String status;
    private Timestamp spotted;
    private int id;

    public Animal (String name, String ranger, String age, String location, String health, String status){
        this.name = name;
        this.ranger = ranger;
        this.age = age;
        this.location = location;
        this.health = health;
        this.status = status;


    }

  
}
