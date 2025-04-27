package com.example.CricBuzz.DTOS.Request;

import com.example.CricBuzz.Model.Enum.Gender;
import com.example.CricBuzz.Model.Enum.TypeOfPlayer;
import jakarta.persistence.Entity;
import lombok.*;
import lombok.experimental.FieldDefaults;

@AllArgsConstructor
@NoArgsConstructor

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)


public class PlayerRequest {
    Gender gender;
    int age;
    String name;
    String country;
    double height;
    double weight;
    TypeOfPlayer typeOfPlayer;

    public static int getage() {
    }

    public static String getname() {
    }

    public static String getCountryname() {
    }

    public static double getheight() {
    }

    public static Gender getgender() {
        return null;
    }
}
