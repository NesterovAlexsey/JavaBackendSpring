package lesson1HomeWork;

public class ClientHome {
  public static void main(String[] args) {
    CameraRollHome cameraRollH = new CameraRollHome();
    CameraHome camera = new CameraHome(cameraRollH);
    camera.doPhotograghH();
  }

}
