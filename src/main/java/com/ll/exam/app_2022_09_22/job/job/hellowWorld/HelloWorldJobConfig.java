package com.ll.exam.app_2022_09_22.job.job.hellowWorld;

import lombok.RequiredArgsConstructor;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class HelloWorldJobConfig {
    // 2개가 있어야 잡 생성 가능.
    private final JobBuilderFactory jobBuilderFactory;
    private final StepBuilderFactory stepBuilderFactory;

    // 메서드 명은 프로젝트에서 단 하나여야만한다
    @Bean
    public Job helloWorldJob(){
        return jobBuilderFactory.get("helloWorldJob")
                .build();
    }
}
