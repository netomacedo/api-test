package com.project.hubspot.service;

import com.project.hubspot.model.Partner;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * Created by Francisco Neto on 07/2018.
 */
@Service
public class PartnerService {

    private String url = "http://localhost:3000/partners";
    private List<Partner> partners;

    /**
     * Request data from hubspot API
     * @returns List<Partner>
     */
    public List<Partner> getPartners() {
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<List<Partner>> responseEntity = restTemplate.exchange(url, HttpMethod.GET,
                null, new ParameterizedTypeReference<List<Partner>>(){});
        partners = responseEntity.getBody();
        return partners;
    }
}
