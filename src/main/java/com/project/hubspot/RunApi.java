package com.project.hubspot;

import com.project.hubspot.service.PartnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class RunApi implements CommandLineRunner {

    @Autowired
    private PartnerService partnerService;

    @Override
    public void run(String...args) {
        System.out.println(partnerService.gerPartners());
    }
}
