import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public final class ExCounter {
	public static void main(String[] args) throws FileNotFoundException {
		File inputFile = new File(args[0]);
		if (!inputFile.exists()) {
			System.out.print("File error.\n");
		}

		Pattern ptrn = Pattern.compile("[a-z]{1}[a-z 0-9]+[a-z]{1}");
		int numberOfPairs = 0;
		Scanner scnr = new Scanner(inputFile);

		while (scnr.hasNextLine()) {
			String line = scnr.nextLine();
			Matcher mtchr = ptrn.matcher(line);
			if (mtchr.find()) {
				numberOfPairs++;
				System.out.print(line + " -> Valid\n");
			}
			else 
				System.out.print(line + " -> Invalid\n");
		}

		System.out.print("Number of Valid Pairs: " + numberOfPairs + "\n");
	}
}

