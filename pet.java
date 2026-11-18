public package onetoone;

import jakarta.persistence.*;

@Entity
@Table(name = "pet+table")
public class Pet {
    @Id
    @Column
    int pet_id;
    @Column
    String name;
    @Column
    int age;

    @OneToOne(mappedBy = "pet")
    owner o;

    public Pet() {
    }

    public Pet(int pet_id, String name, int age) {
        this.pet_id = pet_id;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "pet_id=" + pet_id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public int getPet_id() {
        return pet_id;
    }

    public void setPet_id(int pet_id) {
        this.pet_id = pet_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public owner getO() {
        return o;
    }

    public void setO(owner o) {
        this.o = o;
    }
}
 {
    
}
