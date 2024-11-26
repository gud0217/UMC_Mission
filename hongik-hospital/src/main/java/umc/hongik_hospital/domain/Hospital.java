package umc.hongik_hospital.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
public class Hospital {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String hname;

    private String address;

    @OneToMany(mappedBy = "hospital")
    List<Department> departments = new ArrayList<>();
}
