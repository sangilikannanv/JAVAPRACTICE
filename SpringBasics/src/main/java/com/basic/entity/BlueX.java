package com.basic.entity;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class BlueX implements Paint {
	public void color () {
		System.out.println("Blue");
	}
}
