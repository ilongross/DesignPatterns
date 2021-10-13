package com.ilongross.patterns.home_works.lab4;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ProxyUserRepo implements UserRepo{

    private UserRepo userRepo;

    public ProxyUserRepo(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    @Override
    public Stream<User> getAll() {
        return userRepo.getAll().filter(u -> u.getAge() >= 18);
    }

    @Override
    public void changeUsers(List<User> users) {
        userRepo.changeUsers(users.stream()
                .filter(u -> !u.getRole().equals("admin@"))
                .collect(Collectors.toList()));
    }

    @Override
    public String toString() {
        return userRepo.toString();
    }
}
