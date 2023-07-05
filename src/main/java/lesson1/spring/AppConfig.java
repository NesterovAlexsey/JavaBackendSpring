package lesson1.spring;

import lesson1.Camera;
import lesson1.CameraRoll;
import org.springframework.context.annotation.Bean;

public class AppConfig {
  @Bean(name="cameraRoll")
  public CameraRoll cameraRoll() {
    return new CameraRoll() ;
  }

  @Bean(name="camera")
  public Camera camera(CameraRoll cameraRoll) {
    Camera camera = new Camera(cameraRoll);
    return camera;
  }

}
