package com.duch.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Animal {
    private Integer id;
    private String className;
    private Integer sex;
    private String image;
    private Integer adopt;
    private LocalDateTime adoptTime;
    private LocalDateTime createTime;
    private LocalDateTime updateTime;
}
