package com.duch.service.impl;

import com.duch.mapper.AnimalMapper;
import com.duch.pojo.Animal;
import com.duch.service.AnimalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author duch
 * @description 针对表【animal(动物表)】的数据库操作Service实现
 * @createDate 2024-04-24 23:34:16
 */
@Service
public class AnimalServiceImpl implements AnimalService {
    @Autowired
    private AnimalMapper animalMapper;

    /**
     * 查看所有被救助的动物
     *
     * @return
     */
    @Override
    public List<Animal> getAllAnimal() {
        return animalMapper.getAllAnimal();
    }

    /**
     * 查看所有被领养或者未被领养的动物
     *
     * @param adopt
     * @return
     */
    @Override
    public List<Animal> getYesOrNoAdoptAnimal(Integer adopt) {
        return animalMapper.getYesOrNoAdoptAnimal(adopt);
    }
}




