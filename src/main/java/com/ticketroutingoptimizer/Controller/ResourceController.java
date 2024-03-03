package com.ticketroutingoptimizer.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ticketroutingoptimizer.Service.ResourceService;

@RestController
@CrossOrigin(origins = "*",allowCredentials ="false",allowedHeaders = "*" )
public class ResourceController {
	
	@Autowired
	ResourceService resourceService;
	
    @PostMapping("/ticketRouter")
    public ResponseEntity<String> ticketRouter() {
    	System.out.println("Protected API HIT");
    	return new ResponseEntity<>(resourceService.getAssignmentCompletionStatus(), HttpStatus.OK);
    }
    
    @PostMapping("/public/unprotectedHit")
    public ResponseEntity<String> unprotectedHit() {
    	System.out.println("Unprotected API HIT");
    	return new ResponseEntity<>("Success", HttpStatus.OK);
    }
}

