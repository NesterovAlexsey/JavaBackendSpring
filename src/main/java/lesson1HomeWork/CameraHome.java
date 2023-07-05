package lesson1HomeWork;

public class CameraHome {
  private CameraRollHome cameraRollH;

  public CameraRollHome getCameraRollH() {
    return cameraRollH;
  }

  public CameraRollHome setCameraRollH(CameraRollHome cameraRollH) {
    return this.cameraRollH = cameraRollH;
  }

  public void doPhotograghH() {
    System.out.println("Click!");
    cameraRollH.processingH();
  }
}
