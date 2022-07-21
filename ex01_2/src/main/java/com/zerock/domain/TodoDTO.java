package com.zerock.domain;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Data
public class TodoDTO {
	private String title;
	// parameter보낼 때 형식과 맞추면 됨.
	@DateTimeFormat(pattern = "yyyy/MM/dd")
	private Date dueDate;
}
