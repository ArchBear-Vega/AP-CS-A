package PICTURE;

import java.awt.Color;
import java.awt.image.BufferedImage;

/**
 * A class that represents a picture. This class inherits from SimplePicture and
 * allows the student to add functionality to the Picture class.
 * 
 * @author Barbara Ericson ericson@cc.gatech.edu
 */
public class Picture extends SimplePicture {
	///////////////////// constructors //////////////////////////////////

	/**
	 * Constructor that takes no arguments
	 */
	public Picture() {
		/*
		 * not needed but use it to show students the implicit call to super() child
		 * constructors always call a parent constructor
		 */
		super();
	}

	/**
	 * Constructor that takes a file name and creates the picture
	 * 
	 * @param fileName
	 *            the name of the file to create the picture from
	 */
	public Picture(String fileName) {
		// let the parent class handle this fileName
		super(fileName);
	}

	/**
	 * Constructor that takes the width and height
	 * 
	 * @param height
	 *            the height of the desired picture
	 * @param width
	 *            the width of the desired picture
	 */
	public Picture(int height, int width) {
		// let the parent class handle this width and height
		super(width, height);
	}

	/**
	 * Constructor that takes a picture and creates a copy of that picture
	 * 
	 * @param copyPicture
	 *            the picture to copy
	 */
	public Picture(Picture copyPicture) {
		// let the parent class do the copy
		super(copyPicture);
	}

	/**
	 * Constructor that takes a buffered image
	 * 
	 * @param image
	 *            the buffered image to use
	 */
	public Picture(BufferedImage image) {
		super(image);
	}

	////////////////////// methods ///////////////////////////////////////

	/**
	 * Method to return a string with information about this picture.
	 * 
	 * @return a string with information about the picture such as fileName, height
	 *         and width.
	 */
	public String toString() {
		String output = "Picture, filename " + getFileName() + " height " + getHeight() + " width " + getWidth();
		return output;

	}

	/** Method to set the blue to 0 */
	public void zeroBlue() {
		Pixel[][] pixels = this.getPixels2D();
		for (Pixel[] rowArray : pixels) {
			for (Pixel pixelObj : rowArray) {
				pixelObj.setBlue(0);
			}
		}
	}

	/**
	 * Method that mirrors the picture around a vertical mirror in the center of the
	 * picture from left to right
	 */
	public void mirrorVertical() {
		Pixel[][] pixels = this.getPixels2D();
		Pixel leftPixel = null;
		Pixel rightPixel = null;
		int width = pixels[0].length;
		for (int row = 0; row < pixels.length; row++) {
			for (int col = 0; col < width / 2; col++) {
				leftPixel = pixels[row][col];
				rightPixel = pixels[row][width - 1 - col];
				rightPixel.setColor(leftPixel.getColor());
			}
		}
	}

	/** Mirror just part of a picture of a temple */
	@SuppressWarnings("unused")
	public void mirrorTemple() {
		int mirrorPoint = 276;
		Pixel leftPixel = null;
		Pixel rightPixel = null;
		int count = 0;
		Pixel[][] pixels = this.getPixels2D();

		// loop through the rows
		for (int row = 27; row < 97; row++) {
			// loop from 13 to just before the mirror point
			for (int col = 13; col < mirrorPoint; col++) {

				leftPixel = pixels[row][col];
				rightPixel = pixels[row][mirrorPoint - col + mirrorPoint];
				rightPixel.setColor(leftPixel.getColor());
			}
		}
	}

	/**
	 * copy from the passed fromPic to the specified startRow and startCol in the
	 * current picture
	 * 
	 * @param fromPic
	 *            the picture to copy from
	 * @param startRow
	 *            the start row to copy to
	 * @param startCol
	 *            the start col to copy to
	 */
	public void copy(Picture fromPic, int startRow, int startCol) {
		Pixel fromPixel = null;
		Pixel toPixel = null;
		Pixel[][] toPixels = this.getPixels2D();
		Pixel[][] fromPixels = fromPic.getPixels2D();
		for (int fromRow = 0, toRow = startRow; fromRow < fromPixels.length
				&& toRow < toPixels.length; fromRow++, toRow++) {
			for (int fromCol = 0, toCol = startCol; fromCol < fromPixels[0].length
					&& toCol < toPixels[0].length; fromCol++, toCol++) {
				fromPixel = fromPixels[fromRow][fromCol];
				toPixel = toPixels[toRow][toCol];
				toPixel.setColor(fromPixel.getColor());
			}
		}
	}

	/** Method to create a collage of several pictures */
	public void createCollage() {
		Picture flower1 = new Picture(PictureExplorer.PATH + "flower1.jpg");
		Picture flower2 = new Picture(PictureExplorer.PATH + "flower2.jpg");
		this.copy(flower1, 0, 0);
		this.copy(flower2, 100, 0);
		this.copy(flower1, 200, 0);
		Picture flowerNoBlue = new Picture(flower2);
		flowerNoBlue.zeroBlue();
		this.copy(flowerNoBlue, 300, 0);
		this.copy(flower1, 400, 0);
		this.copy(flower2, 500, 0);
		this.mirrorVertical();
		this.write("collage.jpg");
	}

	/**
	 * Method to show large changes in color
	 * 
	 * @param edgeDist
	 *            the distance for finding edges
	 */
	public void edgeDetection(int edgeDist) {
		Pixel leftPixel = null;
		Pixel rightPixel = null;
		Pixel[][] pixels = this.getPixels2D();
		Color rightColor = null;
		for (int row = 0; row < pixels.length; row++) {
			for (int col = 0; col < pixels[0].length - 1; col++) {
				leftPixel = pixels[row][col];
				rightPixel = pixels[row][col + 1];
				rightColor = rightPixel.getColor();
				if (leftPixel.colorDistance(rightColor) > edgeDist)
					leftPixel.setColor(Color.BLACK);
				else
					leftPixel.setColor(Color.WHITE);
			}
		}
	}

	public void keepOnlyBlue() {
		Pixel[][] img = getPixels2D();

		for (Pixel[] p : img) {
			for (Pixel e : p) {
				e.setRed(0);
				e.setGreen(0);
			}
		}

	}

	/*
	 * Main method for testing - each class in Java can have a main method
	 */
	public static void main(String[] args) {
		Picture beach = new Picture("beach.jpg");

		beach.explore();
	}

	public void grayscale() {
		Pixel[][] p = getPixels2D();

		int red = 0;
		int blue = 0;
		int green = 0;
		for (Pixel[] pixs : p) {
			for (Pixel e : pixs) {
				red = e.getRed();
				blue = e.getBlue();
				green = e.getGreen();
				int avd = (red + blue + green) / 3;
				e.setRed(avd);
				e.setBlue(avd);
				e.setGreen(avd);
			}
		}
	}

	public void negate() {
		Pixel[][] img = getPixels2D();

		for (Pixel[] p : img) {
			for (Pixel e : p) {
				e.setRed(Math.abs(e.getRed() - 255));
				e.setBlue(Math.abs(e.getBlue() - 255));
				e.setGreen(Math.abs(e.getGreen() - 255));
			}
		}
	}

	public void fixUnderwater() {
		Pixel[][] img = getPixels2D();

		for (Pixel[] p : img) {
			for (Pixel e : p) {

				e.setRed((int) (e.getRed() * 4.5));
				e.setBlue((int) (e.getBlue() * .90));

			}
		}

	}

	public void rightHalfGreen() {
		Pixel[][] img = getPixels2D();

		for (int i = 0; i < img.length; i++) {
			for (int j = img[0].length / 2; j < img[0].length; j++) {
				img[i][j].setBlue(0);
				img[i][j].setRed(0);
			}
		}
	}

	public boolean closeToWhite() {
		Pixel[][] img = getPixels2D();

		for (Pixel[] p : img) {
			for (Pixel e : p) {
				int average = (e.getBlue() + e.getRed() + e.getGreen()) / 3;
				if (average < 240) {
					return false;
				}
			}
		}

		return true;
	}

	public void mirrorVerticalRightToLeft() {
		Pixel[][] pixels = this.getPixels2D();
		Pixel leftPixel = null;
		Pixel rightPixel = null;
		int width = pixels[0].length;
		for (int row = 0; row < pixels.length; row++) {
			for (int col = width - 1; col > width / 2; col--) {
				leftPixel = pixels[row][col];
				rightPixel = pixels[row][width - 1 - col];
				rightPixel.setColor(leftPixel.getColor());
			}
		}
	}

	public void mirrorHorizontal() {
		Pixel[][] pixels = this.getPixels2D();
		Pixel topPixel = null;
		Pixel bottomPixel = null;
		int width = pixels[0].length;
		for (int row = 0; row < pixels.length / 2; row++) {
			for (int col = 0; col < width; col++) {
				topPixel = pixels[row][col];
				bottomPixel = pixels[pixels.length - 1 - row][col];
				bottomPixel.setColor(topPixel.getColor());
			}
		}
	}

	public void mirrorHorizontalBotToTop() {
		Pixel[][] pixels = this.getPixels2D();
		Pixel topPixel = null;
		Pixel bottomPixel = null;
		int width = pixels[0].length;
		int height = pixels.length;
		for (int row = height - 1; row >= pixels.length / 2; row--) {
			for (int col = 0; col < width; col++) {
				topPixel = pixels[row][col];
				bottomPixel = pixels[pixels.length - 1 - row][col];
				bottomPixel.setColor(topPixel.getColor());
			}
		}
	}

	public void mirrorDiagonal() {
		Pixel[][] pixels = this.getPixels2D();
		Pixel topPixel = null;
		Pixel bottomPixel = null;
		int width = pixels[0].length;
		int height = pixels.length;
		for (int row = 0; row < height; row++) {
			for (int col = 0; col < width; col++) {
				if (row >= col) {
					topPixel = pixels[row][col];
					bottomPixel = pixels[col][row];
					bottomPixel.setColor(topPixel.getColor());
				}
			}
		}
	}

	public void mirrorArms() {
		Pixel[][] pixels = this.getPixels2D();

		mirrorArm1(pixels);

		mirrorArm2(pixels);

	}

	private void mirrorArm2(Pixel[][] pixels) {
		int arm2L = 294, arm2H = 190;
		int half = 153;
		int body = 239;

		Pixel old = null;
		Pixel newer = null;

		for (int row = half; row <= arm2H; row++) {
			for (int col = body; col <= arm2L; col++) {
				old = pixels[row][col];
				newer = pixels[arm2H + (arm2H - row)][col];
				newer.setColor(old.getColor());
			}
		}
	}

	private void mirrorArm1(Pixel[][] pixels) {
		// TODO Auto-generated method stub
		int arm1L = 108, arm1H = 190;
		int half = 153;
		int body = 170;

		Pixel old = null;
		Pixel newer = null;

		for (int row = half; row <= arm1H; row++) {
			for (int col = arm1L; col <= body; col++) {
				old = pixels[row][col];
				newer = pixels[arm1H + (arm1H - row)][col];
				newer.setColor(old.getColor());
			}
		}
	}

	public void mirrorGull() {
		int boundTop = 230;
		int boundBot = 320;
		int boundLeft = 230;
		int boundRight = 350;

		Pixel[][] i = getPixels2D();

		for (int r = boundTop; r <= boundBot; r++) {
			for (int c = boundLeft; c <= boundRight; c++) {
				Pixel old = i[r][c];
				Pixel nou = i[r][i[0].length - c + 20];

				nou.setColor(old.getColor());

			}
		}
	}

} // this } is the end of class Picture, put all new methods before this
