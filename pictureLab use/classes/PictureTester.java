/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson 
 */
public class PictureTester
{
  /** Method to test zeroBlue */
  public static void testZeroBlue()
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  public static void testkeepOnlyBlue()
  {
	  Picture beach = new Picture("beach.jpg");
	  beach.explore();
	  beach.keepOnlyBlue();
	  beach.explore();
  }
  public static void testNegate()
  {
	  Picture beach = new Picture("beach.jpg");
	  beach.explore();
	  beach.negate();
	  beach.explore();
  }
  public static void testGrayscale()
  {
	  Picture beach = new Picture("beach.jpg");
	  beach.explore();
	  beach.grayscale();
	  beach.explore();
  }
  
  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture caterpillar = new Picture("caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }
  
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }
  
  /** Method to test the collage method */
  public static void testCollage()
  {
    Picture canvas = new Picture("640x480.jpg");
    canvas.createCollage();
    canvas.explore();
  }
  
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("swan.jpg");
    swan.edgeDetection(10);
    swan.explore();
  }
  public static void testFixUnderwater()
  {
	  Picture water = new Picture("water.jpg");
	  water.explore();
	  water.fixUnderwater();
	  water.explore();
  }
  //test mirror vertical right to left
  public static void testMirrorVerticalltr()
  {
	  Picture motercycle = new Picture("redMotorcycle.jpg");
	  motercycle.explore();
	  motercycle.mirrorVerticalRightToLeft();
	  motercycle.explore();  
	 }
	 public static void testMirrorHorizontal()
	 {
		 Picture motercycle = new Picture("redMotorcycle.jpg");
	  motercycle.explore();
	  motercycle.mirrorHorizontal();
	  motercycle.explore();
	 }
	 public static void testMirrorHorizontalBotToTop()
	 {
		Picture motercycle = new Picture("redMotorcycle.jpg");
	  motercycle.explore();
	  motercycle.mirrorHorizontalBotToTop();
	  motercycle.explore();
	 }
	 public static void testMirrorArms()
	 {
		 Picture snowman = new Picture("snowman.jpg");
		 snowman.explore();
		 snowman.mirrorArms();
		 snowman.explore();
	 }
	 public static void testMirrorGull()
	 {
		 Picture gull = new Picture("seagull.jpg");
		 gull.explore();
		 gull.mirrorGulls();
		 gull.explore();
		 }
	 public static void  testCopy()
	 {		  
		Picture bonfire = new Picture("redMotorcycle.jpg");
		Picture temple = new Picture("redMotorcycle.jpg");
		temple.copy(bonfire, 250, 40, 100, 50, 200, 150);
		temple.copy(bonfire, 200, 50, 80, 30, 200, 180);
		temple.explore();
	}
	public static void testMyCollage()
  {
    Picture canvas = new Picture("640x480.jpg");
    canvas.myCollage();
    canvas.explore();
  }
  
  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
    //testZeroBlue();
    //testkeepOnlyBlue();
    //testKeepOnlyRed();
    //testKeepOnlyGreen();
    //testNegate();
   // testGrayscale();
    //testFixUnderwater();
   // testMirrorVertical();
   //testMirrorHorizontal();
//testMirrorHorizontalBotToTop();
	//testMirrorVerticalltr(); //left to right
    //testMirrorTemple();
  //  testMirrorArms();
   // testMirrorGull();
    //testMirrorDiagonal();
    //testCollage();
    //testCopy();
    //testEdgeDetection();
    //testEdgeDetection2();
    //testChromakey();
    //testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
	//testCopy();
	//testMyCollage();
  }
}