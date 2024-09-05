package com.template;

public class Elevator {
    int passengers;
    int max_passengers;
    int curr_floor;
    int max_floor;

    public Elevator(int passengers, int max_floor, int max_passengers) {
        this.passengers = passengers;
        this.max_passengers = max_passengers;
        this.max_floor = max_floor;
    }

    public void moveToFloor(int floor) {
        if (floor <= max_floor) {
            this.curr_floor = floor;
        }
    }

    public int getCurrentFloor() {
        return curr_floor;
    }

    public void addPassenger() {
        if (passengers < max_passengers) {
            passengers++;
        }
    }

    public int getPassengerCount() {
        return passengers;
    }

    public void removePassenger() {
        if (passengers > 0) {
            passengers--;
        }
    }

}
