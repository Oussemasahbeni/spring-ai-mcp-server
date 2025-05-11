# Spring AI MCP Server

## 🚀 Overview

The Spring AI MCP Server is a Java-based application built with Spring Boot and Spring AI..

This server is designed to be launched and managed by an external orchestration tool or script that utilizes a JSON configuration to define how the server process should be started.

## 📋 Prerequisites

Before you can run the MCP server, ensure you have the following installed:

1.  **Java Development Kit (JDK)**: Version 21 or higher (as specified in your launch command). You can download it from [Oracle JDK](https://www.oracle.com/java/technologies/downloads/) or [OpenJDK](https://openjdk.java.net/).
2.  **The MCP Server JAR file**: `mcp-0.0.1-SNAPSHOT.jar` (or the latest version you've built).
3.  **An Orchestration Tool/Script**: A system or script capable of reading the JSON configuration (like the example you provided) and executing the defined command.


### Launch Configuration (JSON)

The server is launched using a JSON configuration that specifies the command and arguments. Here's an example structure:

```json
{
    "mcpServers": {
        "your-server-identifier": {
            "command": "path/to/your/java/executable",
            "args": [
                "-jar",
                "path/to/your/mcp-SNAPSHOT.jar",
                "--spring.profiles.active=yourprofile", // Optional: Spring profiles
                "--server.port=8081" // Optional: Override server port
            ]
        }
    }
}