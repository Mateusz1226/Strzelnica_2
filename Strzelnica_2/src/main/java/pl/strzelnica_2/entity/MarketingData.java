package pl.strzelnica_2.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "Marketing_datas")
public class MarketingData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = " Marketing_data_id")
    private Long Id;
    private String Region;
    private int Age;
    private Boolean MarketingAgreement;
    @OneToOne(mappedBy = "marketingData")
    private User user;

}
