package com.example.demoversioning.model;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class Name {
    private final String firstName;
    private final String lastName;
}