package pl.training.adapters.rest;


public class ResponseDto {
  private String value;

  public ResponseDto(String value) {
    this.value = value;
  }

  public ResponseDto() {
  }

  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }
}
