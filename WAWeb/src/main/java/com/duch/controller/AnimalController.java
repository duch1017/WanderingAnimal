package com.duch.controller;

import com.duch.pojo.Animal;
import com.duch.pojo.Result;
import com.duch.service.AnimalService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping(value = "/animal")
public class AnimalController {
    @Autowired
    private AnimalService animalService;

    /**
     * 查看所有被救助的动物
     *
     * @return Result
     */
    @GetMapping
    public Result getAllAnimal() {
        log.info("查看所有被救助的动物");
        List<Animal> animalList = animalService.getAllAnimal();
        return Result.success(animalList);
    }

    @PostMapping
    public Result getYesOrNoAdoptAnimal(Integer adopt) {
        if (adopt == 1) {
            log.info("查看所有被领养的动物");
        } else if (adopt == 0) {
            log.info("查看所有未被领养的动物");
        }
        List<Animal> animalList = animalService.getYesOrNoAdoptAnimal(adopt);
        return Result.success(animalList);
    }
}
