package com.example;

import java.beans.PropertyChangeSupport;

public class Location {
    private PropertyChangeSupport propertyChangeSupport = new PropertyChangeSupport(this);
    private String weatherEvent;

    public void setWeatherEvent(String weatherEvent) {
        propertyChangeSupport.firePropertyChange("weatherEvent", this.weatherEvent, weatherEvent);
        this.weatherEvent = weatherEvent;
    }

    public void addPropertyChangeListener(WeatherUpdates weatherUpdates) {
        propertyChangeSupport.addPropertyChangeListener(weatherUpdates);
    }

}
