package lesson1HomeWork;

public class ClientHome {
  public static void main(String[] args) {
    CameraHome camera = new CameraHome();
    CameraRollHome cameraRollH = new WBCameraRoll();
    camera.setCameraRollH(cameraRollH);
    camera.doPhotograghH();
  }

}
