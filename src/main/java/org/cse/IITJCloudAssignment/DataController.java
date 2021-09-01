package org.cse.IITJCloudAssignment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DataController {

	@Autowired
	private DataService dataService;
	
	@GetMapping(path = "/assignments")
	public ResponseEntity<Object> getAssignmentData() {
		return dataService.getAllData();
	}
	
}
