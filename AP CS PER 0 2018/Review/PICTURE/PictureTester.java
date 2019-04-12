package PICTURE;

/**
 * This class contains class (static) methods that will help you test the
 * Picture class methods. Uncomment the methods and the code in the main to
 * test.
 * 
 * @author Barbara Ericson
 */
public class PictureTester {
	/** Method to test zeroBlue */
	public static void testZeroBlue() {
		Picture beach = new Picture(PictureExplorer.PATH + "beach.jpg");
		beach.explore();
		beach.zeroBlue();
		beach.explore();
	}

	/** Method to test mirrorVertical */
	public static void testMirrorVertical() {
		Picture caterpillar = new Picture(PictureExplorer.PATH + "caterpillar.jpg");
		caterpillar.explore();
		caterpillar.mirrorVertical();
		caterpillar.explore();
	}

	/** Method to test mirrorTemple */
	public static void testMirrorTemple() {
		Picture temple = new Picture(PictureExplorer.PATH + "temple.jpg");
		temple.explore();
		temple.mirrorTemple();
		temple.explore();
	}

	/** Method to test the collage method */
	public static void testCollage() {
		Picture canvas = new Picture(PictureExplorer.PATH + "640x480.jpg");
		canvas.createCollage();
		canvas.explore();
	}

	/** Method to test edgeDetection */
	public static void testEdgeDetection() {
		Picture swan = new Picture(PictureExplorer.PATH + "swan.jpg");
		swan.edgeDetection(10);
		swan.explore();
	}

	public static void testKeepOnlyBlue() {
		Picture beach = new Picture(PictureExplorer.PATH + "beach.jpg");
		beach.explore();
		beach.keepOnlyBlue();
		beach.explore();

	}

	/**
	 * Main method for testing. Every class can have a main method in Java
	 */
	public static void main(String[] args) {
		// uncomment a call here to run a test
		// and comment out the ones you don't want
		// to run
		// testZeroBlue();
		// testKeepOnlyBlue();
		// testKeepOnlyRed();
		// testKeepOnlyGreen();
		 testNegate();
		 testGrayscale();
		 testFixUnderwater();
		 testMirrorVertical();
		// testMirrorVerticalRightToLeft();
		// testMirrorHorizontal();
		// testMirrorHorizontalBotToTop();
		// testMirrorDiagonal();
		// testMirrorTemple();
		testMirrorArms();
		testMirrorGull();
		// testMirrorDiagonal();
		// testCollage();
		// testCopy();
		// testEdgeDetection();
		// testEdgeDetection2();
		// testChromakey();
		// testEncodeAndDecode();
		// testGetCountRedOverValue(250);
		// testSetRedToHalfValueInTopHalf();
		// testClearBlueOverValue(200);
		// testGetAverageForColumn(0);

		// testRightHalfGreen();
		// testCloseToWhite();

	}

	public static void testMirrorGull() {
		// TODO Auto-generated method stub
		Picture p = new Picture(PictureExplorer.PATH + "seagull.jpg");
		p.mirrorGull();
		p.explore();
		
	}

	public static void testMirrorArms() {
		// TODO Auto-generated method stub
		Picture p = new Picture(PictureExplorer.PATH + "snowman.jpg");
		p.mirrorArms();
		p.explore();
	}

	public static void testMirrorHorizontal() {
		// TODO Auto-generated method stub
		Picture p = new Picture(PictureExplorer.PATH + "redMotorcycle.jpg");
		p.mirrorHorizontal();
		p.explore();
		Picture b = new Picture(PictureExplorer.PATH + "robot.jpg");
		b.mirrorHorizontal();
		b.explore();
	}

	private static void testFixUnderwater() {
		Picture p = new Picture(PictureExplorer.PATH + "water.jpg");
		p.fixUnderwater();
		p.explore();

	}

	private static void testGrayscale() {
		Picture gorge = new Picture(PictureExplorer.PATH + "gorge.jpg");
		gorge.grayscale();
		gorge.explore();

	}

	private static void testNegate() {
		Picture g = new Picture(PictureExplorer.PATH + "gorge.jpg");
		g.negate();
		g.explore();

	}

	public static void testRightHalfGreen() {
		Picture g = new Picture(PictureExplorer.PATH + "gorge.jpg");
		g.rightHalfGreen();
		g.explore();
	}

	public static void testCloseToWhite() {
		Picture g = new Picture(PictureExplorer.PATH + "640x480.jpg");
		if (g.closeToWhite()) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}

	}

	public static void testMirrorVerticalRightToLeft() {
		Picture g = new Picture(PictureExplorer.PATH + "caterpillar.jpg");
		g.mirrorVerticalRightToLeft();
		g.explore();
		Picture b = new Picture(PictureExplorer.PATH + "robot.jpg");
		b.mirrorVerticalRightToLeft();
		b.explore();
	}

	public static void testMirrorHorizontalBotToTop() {
		Picture g = new Picture(PictureExplorer.PATH + "redMotorcycle.jpg");
		g.mirrorHorizontalBotToTop();
		g.explore();
		Picture b = new Picture(PictureExplorer.PATH + "robot.jpg");
		b.mirrorHorizontalBotToTop();
		b.explore();
	}

	public static void testMirrorDiagonal() {
		Picture g = new Picture(PictureExplorer.PATH + "beach.jpg");
		g.mirrorDiagonal();
		g.explore();
	}

}