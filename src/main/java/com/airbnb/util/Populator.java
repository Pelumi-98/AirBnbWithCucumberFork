package com.airbnb.util;

import com.airbnb.model.Room;
import com.airbnb.repository.RoomRepository;
import com.airbnb.service.RoomService;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

@Component
public class Populator {

    private final RoomRepository roomRepository;

    public Populator(RoomRepository roomRepository) {
        this.roomRepository = roomRepository;
    }

    @PostConstruct //run this code one time after creating the app
    public void init() {
        Room room1 = new Room();
        room1.setName("Cliffhanger");
        room1.setRate(100);
        roomRepository.save(room1);

        Room room2 = new Room();
        room2.setName("Slickrock");
        room2.setRate(125);
        roomRepository.save(room2);
    }
}