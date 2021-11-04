package com.ilongross.patterns.home_works.lab10.event_driven;

import java.util.HashSet;
import java.util.Set;

public class EditName {

    private Set<EditNameUser> editedNamesUserSet = new HashSet<>();
    private KafkaImitator kafkaImitator;

    public EditName(KafkaImitator kafkaImitator) {
        this.kafkaImitator = kafkaImitator;
    }

    public void editName(EditNameUser editNameUser) {
        editedNamesUserSet.add(editNameUser);
        var editEvent = (SpotEditNameEvent)kafkaImitator.readForConsumer(this.toString());

        for (EditNameUser editedUser : editedNamesUserSet) {
            if(editEvent.getUserId() == editedUser.getId()) {
                editedUser.setNewName(editEvent.getNewName());
                editedNamesUserSet.add(editedUser);
            }
        }
    }
}
