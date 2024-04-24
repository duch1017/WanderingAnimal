package com.duch.service;

import com.duch.pojo.Animal;

import java.util.List;

/**
 * @author duch
 * @description 针对表【animal(动物表)】的数据库操作Service
 * @createDate 2024-04-24 23:34:16
 */
public interface AnimalService {

    List<Animal> getAllAnimal();

    List<Animal> getYesOrNoAdoptAnimal(Integer adopt);
}
