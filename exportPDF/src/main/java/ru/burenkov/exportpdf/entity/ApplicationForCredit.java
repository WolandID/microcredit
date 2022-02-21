package ru.burenkov.exportpdf.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name ="processed_requests")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ApplicationForCredit {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "full_name")
    private String fullName;

    private Integer age;

    private Integer mounts;

    private Integer sum;

    private Boolean accept;
}
