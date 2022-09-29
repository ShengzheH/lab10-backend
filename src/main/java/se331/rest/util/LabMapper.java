package se331.rest.util;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import se331.rest.entity.*;

import java.util.List;

@Mapper
public interface LabMapper {
    LabMapper INSTANCE = Mappers.getMapper(LabMapper.class);
    EventDTO getEventDTO(Event event);
    List<EventDTO> getEventDTO(List<Event> events);

    OrganizerDTO getOrganizerDTO(Organizer organizer);
    List<OrganizerDTO> getOrganizerDtO(List<Organizer> organizers);

    ParticipantDTO getParticipantDTO(Participant participant);

    List<ParticipantDTO> getParticipantDTO(List<Participant> participants);
}