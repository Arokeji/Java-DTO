package com.humberto.dtotutorial.dto;

import lombok.Data;

@Data //Create getters and setters
public class UserLocationDTO {
    private long userId;
    private String email;
    private String place;
    private double longitude;
    private double latitude;
}
