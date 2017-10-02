package net.proselyte.springsecurityapp.model;


import com.oracle.webservices.internal.api.databinding.DatabindingMode;

import javax.persistence.*;
import java.sql.Date;
import lombok.Data;


@Data
@Entity
@Table(name = "passengers")
public class Passenger {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int id;

    @Column
    private String name;

    @Column
    private String surname;

    @Column
    private Date birthdate;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "user_id")
    private User user;
}
