package se331.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import se331.rest.entity.Participant;
import se331.rest.service.ParticipantService;
import se331.rest.util.LabMapper;

import java.util.List;

@RestController
public class ParticipantController {

    @Autowired
    ParticipantService participantService;

    @GetMapping("/participants")
    ResponseEntity<?> getParticipants(){
//        List<Participant> list =  participantService.getAllParticipant();
        return ResponseEntity.ok(LabMapper.INSTANCE.getParticipantDTO(participantService.getAllParticipant()));
    }
}
