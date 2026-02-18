package com.at7766499.gmail.com.LearningRESTAPIs.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class studentDTO {
    private long id;
    private String name;
    private String email;

}
