import java.io.*;

public class TextWriter {

	public static void main(String[] args) {
		try {
			FileWriter writer = new FileWriter("Foo.txt", false);
			BufferedWriter buffer = new BufferedWriter(writer);
			buffer.write("Hello foo!");
			buffer.flush(); // Skriver til filen
			buffer.newLine();
			buffer.write("Hello again!");
			buffer.close(); // Skriver til filen og lukker
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}

}
