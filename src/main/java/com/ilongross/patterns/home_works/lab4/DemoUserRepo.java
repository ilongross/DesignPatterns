package com.ilongross.patterns.home_works.lab4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class DemoUserRepo {
    public static void main(String[] args) {

        List<User> users = new ArrayList<>();
        var user1 = new Admin("user1", 35, "admin@");
        var user2 = new Engineer("user2", 40, "engineer");
        var user3 = new Engineer("user3", 25, "engineer");
        var user4 = new Manager("user4", 30, "manager");
        var user5 = new Trainee("user5", 17, "trainee");
        var user6 = new Trainee("user6", 18, "trainee");

        Collections.addAll(users, user1, user2, user3, user4, user5, user6);

        var userRepo = new UserRepoImpl(users);
        System.out.println(userRepo);

        var proxyRepo = new ProxyUserRepo(userRepo);
        proxyRepo.changeUsers(users);
        List<User> list = proxyRepo.getAll().collect(Collectors.toList());

        System.out.println("Users[" + list.size() + "]:");
        list.forEach(System.out::println);

    }
}
