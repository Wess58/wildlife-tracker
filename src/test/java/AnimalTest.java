import org.junit.*;
import static org.junit.Assert.*;
import org.sql2o.*;
import java.sql.Timestamp;
import java.util.Date;
import java.text.DateFormat;

public  class AnimalTest{

    @Rule
    public DatabaseRule database = new DatabaseRule();

    @Test
    public void animal_instantiatesCorrectly_true() {
        Animal testAnimal = new Animal("Rhino", "Karani G.K","young","Maasai Mara", "Healthy", "Endangered");
        assertEquals(true, testAnimal instanceof Animal);
    }

    @Test
    public void Animal_instantiatesWithName_String() {
        Animal testAnimal = new Animal("Rhino", "Karani G.K","young","Maasai Mara", "Healthy", "Endangered");
        assertEquals("Rhino", testAnimal.getName());
    }

    @Test
    public void Animal_instantiatesWithlocation_String() {
        Animal testAnimal = new Animal("Rhino", "Karani G.K","young","Maasai Mara", "Healthy", "Endangered");
        assertEquals("Maasai Mara", testAnimal.getLocation());
    }

    @Test
    public void Animal_instantiatesWithRanger_String() {
        Animal testAnimal = new Animal("Rhino", "Karani G.K","young","Maasai Mara", "Healthy", "Endangered");
        assertEquals("Karani G.K", testAnimal.getRanger());
    }

    @Test
    public void Animal_instantiatesWithHealth_String() {
        Animal testAnimal = new Animal("Rhino", "Karani G.K","young","Maasai Mara", "Healthy", "Endangered");
        assertEquals("Healthy", testAnimal.getHealth());
    }

    @Test
    public void Animal_instantiatesWithAge_String() {
        Animal testAnimal = new Animal("Rhino", "Karani G.K","young","Maasai Mara", "Healthy", "Endangered");
        assertEquals("young", testAnimal.getAge());
    }

    @Test
    public void Animal_instantiatesWithStatus_String() {
        Animal testAnimal = new Animal("Rhino", "Karani G.K","young","Maasai Mara", "Healthy", "Endangered");
        assertEquals("Endangered", testAnimal.getStatus());
    }

    // @Test
    // public void save_returnsTrueIfDescriptionsAretheSame() {
    //     Animal testAnimal = new Animal("Rhino", "Karani G.K","young","Maasai Mara", "Healthy", "Endangered");
    //     testAnimal.save();
    //     assertTrue(Animal.all().get(0).equals(testAnimal));
    // }

    // @Test
    // public void all_returnsAllInstancesOfAnimal_true() {
    //     Animal firstAnimal = new Animal("Rhino", "Karani G.K","young","Maasai Mara", "Healthy", "Endangered");
    //     firstAnimal.save();
    //     Animal secondAnimal = new Animal("Lion", "Karani G.K","adult","Tsavo East ",  "Okay",  "not endangered");
    //     secondAnimal.save();
    //     assertEquals(true, Animal.all().get(0).equals(firstAnimal));
    //     assertEquals(true, Animal.all().get(1).equals(secondAnimal));
    // }

    @Test
    public void save_recordsTimeOfCreationInDatabase() {
        Animal testAnimal = new Animal("Rhino", "Karani G.K","young","Maasai Mara", "Healthy", "Endangered");
        testAnimal.save();
        Timestamp savedAnimalSpotted = Animal.find(testAnimal.getId()).getSpotted();
        Timestamp rightNow = new Timestamp(new Date().getTime());
        assertEquals(rightNow.getDay(), savedAnimalSpotted.getDay());
    }










}
