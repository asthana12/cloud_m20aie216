package org.cse.IITJCloudAssignment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import lombok.Data;

@Service
@Data
public class DataService {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public ResponseEntity<Object> getAllData() {
		List<Map<String, Object>> dataList = new ArrayList<>();
		Map<String,Object> statusMap = new HashMap<>();
		try {
			dataList = jdbcTemplate.queryForList("select * from ASSIGNMENT.COURSE_WORK");
			statusMap.put("status", "SUCCESS");
		} catch (Exception e) {
			statusMap.put("status", "Some Error Occured");
		}
		dataList.add(statusMap);
		return ResponseEntity.ok(dataList);
	}

}
