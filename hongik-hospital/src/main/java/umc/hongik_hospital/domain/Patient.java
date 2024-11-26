package umc.hongik_hospital.domain;

import jakarta.persistence.*;
import lombok.*;
import umc.hongik_hospital.domain.enums.Gender;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private long age;

    @Enumerated(EnumType.STRING)
    private Gender gender;

    private String pname;

    @OneToMany(mappedBy = "patient")
    private List<Reservation> reservations = new ArrayList<>();
}
