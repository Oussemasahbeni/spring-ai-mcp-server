package com.oussema.mcp;

import org.springframework.ai.tool.ToolCallback;
import org.springframework.ai.tool.ToolCallbacks;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class McpApplication {

	public static void main(String[] args) {
		SpringApplication.run(McpApplication.class, args);
	}


	@Bean
	public List<ToolCallback> oussemaTools(CourseService courseService) {
		return List.of(
				ToolCallbacks.from(courseService)
		);
	}

}
