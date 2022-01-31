package ru.burenkov.verification.model;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Application {


    private String fullName;
    private Integer age;
    private Integer mounth;
    private Integer sum;

}