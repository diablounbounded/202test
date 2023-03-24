package dao;

import org.springframework.stereotype.Repository;
import pojo.Card;
import pojo.Pet;

import java.util.List;

@Repository
public interface PetMapper {
    int addPet(Pet pet);


    //删除一个Card int addBook(books books);
    int deleteByPetId(int pet_id);

    //更新一个Pet
    int updatePet(Pet pet);

    //查询一个Card
    Pet QueryPetById(String pet_id);

    //Pet QueryPetByName(String pet_name);

    List<Pet> QueryPetByOwner(String owner_phone);
}
