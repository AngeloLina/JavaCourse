package telran.app;

import telran.data.Dog;

public class AppDogs {
    public static void main(String[] args) {
       /* Dog dog1 = new Dog();
        dog1.age = 2;
        dog1.breed = "husky";
        dog1.nickName = "Bobik";
        dog1.weight = 25.5;
    */
        Dog dog2 = new Dog("Sharik", 3, "pudel", 8);
        Dog dog1 = new Dog("Bobik", 2, "husky", 25.5);

        dog2.dogSleep();
        dog1.dogRun();

        dog1.display();
        System.out.println();
        dog2.display();
        System.out.println();
        System.out.println(dog1.getNickName());

        dog1.setNickName("Bublik");
        System.out.println(dog1.getNickName());

        System.out.println(dog2.toString());

        }


    }
