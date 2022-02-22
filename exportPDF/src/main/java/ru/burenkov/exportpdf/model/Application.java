package ru.burenkov.exportpdf.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Application {

    private Long id;
    private String fullName;
    private Integer age;
    private Integer mounts;
    private Integer sum;
    private Boolean accept;
}
