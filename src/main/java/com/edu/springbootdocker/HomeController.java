package com.edu.springbootdocker;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/rest")
public class HomeController {

    @GetMapping("/v1/hello")
    public ResponseEntity hello() {

        try {
            String url = "https://test-thabib.herokuapp.com/StudentsProba";
            HttpEntity<List<Student>> request = new HttpEntity<>(Arrays.asList(
                    new Student("161-40-295"),
                    new Student("161-11-1031")
            ));
            ResponseEntity<String> responseEntity =new RestTemplate().postForEntity(url,request,String.class);

            String str = responseEntity.getBody();
            ObjectMapper mapper = new ObjectMapper();
            mapper.findAndRegisterModules();
            Student[] studentInfo = mapper.readValue(str, Student[].class);

            Arrays.asList(studentInfo).forEach(System.out::println);

            return ResponseEntity.ok("Salam");

        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("error");
        }
    }


}
