package pl.training.adapters.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExampleController {

  @Value("${example.magic}")
  private String magic;

  @GetMapping(path = "/magic")
  public ResponseDto get() {
    return new ResponseDto(magic);
  }
}
