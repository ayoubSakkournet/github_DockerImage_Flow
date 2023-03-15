package com.sakkournet.github_docker_image_workflow;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GithubDockerImageWorkflowApplication {

	@GetMapping("/welcome")
	public String welcome(){
		return "Welcome to the Docker image CI/CD ";
	}


	/*echo "# github_DockerImage_Flow" >> README.md
git init
git add README.md
git commit -m "first commit"
git branch -M main
git remote add origin https://github.com/ayoubSakkournet/github_DockerImage_Flow.git
git push -u origin main*/

	public static void main(String[] args) {
		SpringApplication.run(GithubDockerImageWorkflowApplication.class, args);
	}

}
