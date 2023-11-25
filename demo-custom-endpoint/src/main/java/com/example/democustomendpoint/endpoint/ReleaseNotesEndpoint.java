package com.example.democustomendpoint.endpoint;

import com.example.democustomendpoint.endpoint.model.ReleaseNote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.endpoint.annotation.*;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Component
@Endpoint(id="releaseNotes")
public class ReleaseNotesEndpoint {

    List<ReleaseNote> releaseNotes =  new ArrayList<>();

    @ReadOperation
    public List<ReleaseNote> getReleaseNotes() {
        return releaseNotes;
    }

    @WriteOperation
    public ReleaseNote addReleaseNote(String version, String changeLogData) {
        ReleaseNote releaseNote = new ReleaseNote(version, LocalDateTime.now(), changeLogData);
       releaseNotes.add(releaseNote);
        return(releaseNote);
    }

    @DeleteOperation
    public void deleteReleaseNote(@Selector String version) {
    }
}