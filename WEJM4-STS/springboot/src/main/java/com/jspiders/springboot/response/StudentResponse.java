package com.jspiders.springboot.response;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.jspiders.springboot.pojo.StudentPOJO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class StudentResponse {
	
	
	public StudentResponse(String string, String string2, StudentPOJO pojo, Object object) {
		// TODO Auto-generated constructor stub
		
	}
	private String status;
	private String description;
	private StudentPOJO data;
	private List<StudentPOJO> list;

}
