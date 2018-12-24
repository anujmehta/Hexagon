package com.hexagon.persistance;

import com.hexagon.entity.Event;

public interface EventStore {

    public void store(Event event);
}
