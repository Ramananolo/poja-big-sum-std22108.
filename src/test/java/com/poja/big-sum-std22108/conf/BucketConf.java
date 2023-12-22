package com.poja.big-sum-std22108.conf;

import org.springframework.test.context.DynamicPropertyRegistry;
import com.poja.big-sum-std22108.PojaGenerated;

@PojaGenerated
public class BucketConf {

  void configureProperties(DynamicPropertyRegistry registry) {
    registry.add("aws.s3.bucket", () -> "dummy-bucket");
  }
}
