package com.gsk.gi.test;

import com.gsk.gi.Launcher;
import com.gsk.gi.model.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.IntegrationTest;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.WebIntegrationTest;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

import static javafx.beans.binding.Bindings.when;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Launcher.class)
@WebAppConfiguration
@IntegrationTest("server.port:8070")
public class CRUDTest {

    public static final String SERVER_ADDR = "http://localhost:8070/";

    @Test
    public void testTeam(){
        RestTemplate restTemplate = new RestTemplate();
        Team sampleTeam = new Team();
        sampleTeam.setCountry("country1");
        sampleTeam.setCity("city1");
        sampleTeam.setName("team1");
        Team createdTeam = restTemplate.postForEntity(SERVER_ADDR + "team", sampleTeam, Team.class).getBody();

        Player samplePlayer = new Player();
        samplePlayer.setTeam(createdTeam);
        samplePlayer.setEmail("sample@email.com");
        samplePlayer.setFirstName("firstName1");
        samplePlayer.setLastName("lastName1");
        samplePlayer.setPassword("password1");
        samplePlayer.setPhone("9891232445565");
        Player createdPlayer = restTemplate.postForEntity(SERVER_ADDR + "player", samplePlayer, Player.class).getBody();

        ClipObject sampleClipObject1 = new ClipObject();
        sampleClipObject1.setBorderColor("#000000");
        sampleClipObject1.setColor("#111111");
        sampleClipObject1.setPosition(new Position(20, 100));
        sampleClipObject1.setSize(100);
        sampleClipObject1.setText("test object");
        sampleClipObject1.setVisible(true);

        ClipObject sampleClipObject2 = new ClipObject();
        sampleClipObject2.setBorderColor("#000000");
        sampleClipObject2.setColor("#111111");
        sampleClipObject2.setPosition(new Position(20, 100));
        sampleClipObject2.setSize(100);
        sampleClipObject2.setText("another test object");
        sampleClipObject2.setVisible(false);

        List<ClipObject> objects = new ArrayList<ClipObject>(2);
        objects.add(sampleClipObject1);
        objects.add(sampleClipObject2);

        Clip sampleClip = new Clip();
        sampleClip.setBeginPoint(0L);
        sampleClip.setDataFileAddr("/data/file/address");
        sampleClip.setDuration(21121L);
        sampleClip.setEngdPoint(23211L);
        sampleClip.setMetaDataAddr("/meta/data/address");
        sampleClip.setExtraction_time(243424L);
        sampleClip.setObjects(objects);
        sampleClip.setTitle("sample clip");
        Clip createClip = restTemplate.postForEntity(SERVER_ADDR + "clip", sampleClip, Clip.class).getBody();

        System.out.println(createClip);
    }


}
