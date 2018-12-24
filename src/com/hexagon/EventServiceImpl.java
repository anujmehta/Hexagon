package com.hexagon;

import com.hexagon.entity.Event;
import com.hexagon.persistance.EventStore;
import com.hexagon.reader.InputReader;

import java.util.List;

public class EventServiceImpl implements EventService {

    @Override
    public void read(InputReader reader) {
        //Read raw data and process into events
        //...
        processData();
    }

    private void processData(){
        //...
    }

    private void storeEvents(){
        for (Event event : eventList) {
            eventStore.store(event);
        }
    }


    private EventStore eventStore;
    private List<Event> eventList;

}
