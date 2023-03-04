package com.javadeveloper.rest.api.rest;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author Ari Abdul Majid
 * @version :$, (Created on 04/03/2023)
 * @since 1.0.Alpha1
 */

@RestController
@RequestMapping("/api/job")
@RequiredArgsConstructor
public class JobController {

    @GetMapping("/list")
    public ResponseEntity<?>getJobList() {
        String url = "http://dev3.dansmultipro.co.id/api/recruitment/positions.json";
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<Object> result = restTemplate.getForEntity(url, Object.class);

        return ResponseEntity.ok().body(result.getBody());
    }

    @GetMapping("/detail/{id}")
    public ResponseEntity<?>getDetailJob(@PathVariable String id) {
        String url = "http://dev3.dansmultipro.co.id/api/recruitment/positions/{ID}";
        RestTemplate restTemplate = new RestTemplate();

        Object result = restTemplate.getForObject(url, Object.class, id);

        return ResponseEntity.ok().body(result);
    }
}
