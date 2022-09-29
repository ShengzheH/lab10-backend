package se331.rest.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.ManyToOne;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ParticipantOwnEventsDTO {
    Long id;
//    String category;
//    String title;
//    String description;
//    String location;
//    String date;
//    String time;
//    Boolean petAllowed;
//    ParticipantOwnEventDTOownorga organizer;
}
