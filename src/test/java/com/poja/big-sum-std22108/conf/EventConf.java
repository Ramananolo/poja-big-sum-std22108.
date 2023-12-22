package com.poja.big-sum-std22108.conf;

import org.springframework.test.context.DynamicPropertyRegistry;
import com.poja.big-sum-std22108.PojaGenerated;

@PojaGenerated
public class EventConf {

  void configureProperties(DynamicPropertyRegistry registry) {
    registry.add("aws.region", () -> "dummy-region");
    registry.add("aws.sqs.queue.url", () -> "dummy-queue-url");
    registry.add("aws.eventBridge.bus", () -> "dummy-bus-url");
  }
}
