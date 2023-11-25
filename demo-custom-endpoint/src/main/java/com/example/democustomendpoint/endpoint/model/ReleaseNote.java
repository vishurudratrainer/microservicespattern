package com.example.democustomendpoint.endpoint.model;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.time.LocalDateTime;

@Data
@RequiredArgsConstructor
public class ReleaseNote {

    private final String version;
    private final LocalDateTime date;
    private final String changeLogData;
}
