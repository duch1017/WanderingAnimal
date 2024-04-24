package com.duch.mapper;

import com.duch.pojo.Animal;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author duch
 * @description 针对表【animal(动物表)】的数据库操作Mapper
 * @createDate 2024-04-24 23:34:16
 * @Entity com.duch.pojo.Animal
 */

@Mapper
public interface AnimalMapper {

    List<Animal> getAllAnimal();

    List<Animal> getYesOrNoAdoptAnimal(@Param("adopt") Integer adopt);
}




