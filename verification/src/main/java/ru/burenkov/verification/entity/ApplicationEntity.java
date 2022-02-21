package ru.burenkov.verification.entity;

import lombok.*;


import javax.persistence.*;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "processed_requests")
public class ApplicationEntity {
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
