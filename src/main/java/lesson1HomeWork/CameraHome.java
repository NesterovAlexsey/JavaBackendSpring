package lesson1HomeWork;

public class CameraHome {
//added dependencies with constructors
  public CameraHome(CameraRollHome cameraRollH) {
    this.cameraRollH = cameraRollH;
  }
  private CameraRollHome cameraRollH;

  public void doPhotograghH() {
    System.out.println("Click!");
    cameraRollH.processingH();
  }
}
