package com.geekbrains.repositories;

import com.geekbrains.entites.Human;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Component
public class HumanRepository {

    List<Human> humanArrayList = new ArrayList<>();
//    Human human1 = new Human(1, "Julie1", "Roberts",67);
//    Human human2 = new Human(2, "Julie2", "Roberts",68);
//    Human human3 = new Human(3, "Julie3", "Roberts",69);
    public void setHumanArrayList(){
        humanArrayList.add(new Human(1, "Julie1", "Roberts1",67));
        humanArrayList.add(new Human(2, "Julie2", "Roberts2",68));
        humanArrayList.add(new Human(3, "Julie3", "Roberts3",69));
        humanArrayList.add(new Human(4, "Julie4", "Roberts4",70));
        humanArrayList.add(new Human(5, "Julie5", "Roberts5",71));
    }


    public Human findOneById(int id){
        setHumanArrayList();
//        humanArrayList.add(human1);
//        humanArrayList.add(human2);
//        humanArrayList.add(human3);
//        humanArrayList.add(new Human(2, "Julie2", "Roberts",68));
//        humanArrayList.add(new Human(3, "Julie3", "Roberts",69));
//        System.out.println("----------");
        for (Human human:humanArrayList) {
            if (human.getId()==id)
                return human;
        }
        Human human = new Human();
//        human.setName("Julia"+id);
//        human.setSurname("Roberts");
        return null;
    }

    public List<Human> getHumanArrayList (){
        setHumanArrayList();
        return humanArrayList;
    }
}
