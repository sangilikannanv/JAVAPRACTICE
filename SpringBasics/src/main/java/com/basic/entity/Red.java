package com.basic.entity;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Red implements Paint{
	public void color() {
		System.out.println("Red");
	}
}
