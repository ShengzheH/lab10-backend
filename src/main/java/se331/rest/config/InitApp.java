package se331.rest.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;
import se331.rest.entity.Event;
import se331.rest.entity.Organizer;
import se331.rest.entity.Participant;
import se331.rest.repository.EventRepository;
import se331.rest.repository.OrganizerRepository;
import se331.rest.repository.ParticipantRepository;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Component
public class InitApp implements ApplicationListener<ApplicationReadyEvent> {
    @Autowired
    EventRepository eventRepository;
    @Autowired
    OrganizerRepository organizerRepository;

    @Autowired
    ParticipantRepository participantRepository;
    @Override
    @Transactional
    public void onApplicationEvent(ApplicationReadyEvent applicationReadyEvent) {
        Participant par1,par2,par3,par4,par5;
        List<Participant> participantLists;
        par1 = participantRepository.save(Participant.builder().name("partA").telNo("1").build());
        par2 = participantRepository.save(Participant.builder().name("partB").telNo("2").build());
        par3 = participantRepository.save(Participant.builder().name("partC").telNo("3").build());
        par4 = participantRepository.save(Participant.builder().name("partD").telNo("4").build());
        par5 = participantRepository.save(Participant.builder().name("partE").telNo("5").build());
        List<Event> Event1 = new ArrayList<>();
        List<Event> Event2 = new ArrayList<>();
        List<Event> Event3 = new ArrayList<>();
        List<Event> Event4 = new ArrayList<>();
        List<Event> Event5 = new ArrayList<>();
//

        Organizer org1,org2,org3;
        org1 = organizerRepository.save(Organizer.builder().
                name("CAMT").build());
        org2 = organizerRepository.save(Organizer.builder().
                name("CMU").build());
        org3 = organizerRepository.save(Organizer.builder().
                name("ChiangMai").build());
        Event tempEvent;


        tempEvent = eventRepository.save(Event.builder()
                .category("Academic")
                .title("Midterm Exam")
                .description("A time for taking the exam")
                .location("CAMT Building")
                .date("3rd Sept")
                .time("3.00-4.00 pm.")
                .petAllowed(false)
                .build());
        participantLists = new ArrayList<>();
        Event1.add(tempEvent);
        Event2.add(tempEvent);
        Event3.add(tempEvent);
        Event4.add(tempEvent);
        Event5.add(tempEvent);
        participantLists.add(par1);
        participantLists.add(par2);
        participantLists.add(par3);
        participantLists.add(par4);
        participantLists.add(par5);
        tempEvent.setOrganizer(org1);
        tempEvent.setParticipants(participantLists);
        org1.getOwnEvents().add(tempEvent);



        tempEvent = eventRepository.save(Event.builder()
                .category("Academic")
                .title("Commencement Day")
                .description("A time for celebration")
                .location("CMU Convention hall")
                .date("21th Jan")
                .time("8.00am-4.00 pm.")
                .petAllowed(false)
                .build());
        participantLists = new ArrayList<>();
        Event1.add(tempEvent);
        Event2.add(tempEvent);
        Event3.add(tempEvent);
        Event4.add(tempEvent);
        Event5.add(tempEvent);
        participantLists.add(par1);
        participantLists.add(par2);
        participantLists.add(par3);
        participantLists.add(par4);
        participantLists.add(par5);
        tempEvent.setOrganizer(org1);
        tempEvent.setParticipants(participantLists);
        org1.getOwnEvents().add(tempEvent);


        tempEvent = eventRepository.save(Event.builder()
                .category("Cultural")
                .title("Loy Krathong")
                .description("A time for Krathong")
                .location("Ping River")
                .date("21th Nov")
                .time("8.00-10.00 pm.")
                .petAllowed(false)
                .build());
        participantLists = new ArrayList<>();
        Event1.add(tempEvent);
        Event2.add(tempEvent);
        Event3.add(tempEvent);
        Event5.add(tempEvent);
        participantLists.add(par1);
        participantLists.add(par2);
        participantLists.add(par3);
        participantLists.add(par5);
        tempEvent.setOrganizer(org2);
        tempEvent.setParticipants(participantLists);
        org2.getOwnEvents().add(tempEvent);


        tempEvent = eventRepository.save(Event.builder()
                .category("Cultural")
                .title("Songkran")
                .description("Let's Play Water")
                .location("Chiang Mai Moat")
                .date("13th April")
                .time("10.00am - 6.00 pm.")
                .petAllowed(true)
                .build());
        participantLists = new ArrayList<>();
        Event1.add(tempEvent);
        Event2.add(tempEvent);
        Event3.add(tempEvent);
        Event4.add(tempEvent);
        participantLists.add(par1);
        participantLists.add(par2);
        participantLists.add(par3);
        participantLists.add(par4);
        tempEvent.setOrganizer(org3);
        tempEvent.setParticipants(participantLists);
        org3.getOwnEvents().add(tempEvent);


        par1.setEventHistory(Event1);
        par2.setEventHistory(Event2);
        par3.setEventHistory(Event3);
        par4.setEventHistory(Event4);
        par5.setEventHistory(Event5);
    }
}
