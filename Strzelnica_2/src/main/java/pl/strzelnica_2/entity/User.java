package pl.strzelnica_2.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="users")
public class User {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)

    private String name;

  //  @NotEmpty(message = "Proszę wpisać nazwisko")
  //  private String lastName;

    @Length(min = 9, max = 12, message = "Proszę wpisać poprawny numer telefonu")
    private String phoneNumber;

    @Column(nullable = false, unique = true)
    private String email;

    @Length(min = 6, message = "Hasło musi zawierać minimum 6 znaków")
    @Column(nullable = false)
    private String password;

    @Column(name = "active")
    private Boolean active;


    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(
            name = "users_roles",
            joinColumns = {@JoinColumn(name = "USER_ID", referencedColumnName = "ID")},
            inverseJoinColumns = {@JoinColumn(name = "ROLE_ID", referencedColumnName = "ID")})
    private List<Role> roles = new ArrayList<>();

    @OneToOne ( fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    @JoinColumn(name = "marketing_data_id")
    private MarketingData marketingData;

    @OneToMany(mappedBy = "user")
    private List<Schedule> bookedSchedules;

}