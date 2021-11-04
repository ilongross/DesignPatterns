package com.ilongross.patterns.microservices.event_driven;

public class DemoKafka {
    public static void main(String[] args) {
        var kafka =  new KafkaImitator();
        var spot = new Spot(kafka);
        var search = new Search(kafka);

        var spotUser = new SpotUser(1, "Ilon", (short) 31, true);
        var searchUser = new SearchUser(1, (short) 31, true);

        search.getSearchUserSet().add(searchUser);

        spotUser.setAge((short) 32);
        spot.add(spotUser);
        searchUser.setId((short)32);
        search.getSearchUserSet().forEach(System.out::println);

        kafka.showEvents();

    }
}
