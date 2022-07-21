package com.zerock.domain;

import java.util.ArrayList;

import lombok.Data;

@Data
public class SampleDTOList {
	
	ArrayList<SampleDTO> list;

	public SampleDTOList() {
		list = new ArrayList<>();
	}
}
