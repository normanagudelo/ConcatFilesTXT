import java.io.*;

public class FileConcatenator {
    public static void main(String[] args) {
        // Array containing paths to the input files to be concatenated
        String[] inputFiles = {"file1.txt", "file2.txt", "file3.txt"};
        // Path to the output file where concatenated content will be saved
        String outputFile = "output.txt";

        try {
            // Create a FileWriter object to write to the output file
            FileWriter writer = new FileWriter(outputFile);

            // Loop through each input file
            for (String inputFile : inputFiles) {
                // Create a FileReader object to read from the input file
                FileReader reader = new FileReader(inputFile);
                int character;

                // Read each character from the input file and write to the output file
                while ((character = reader.read()) != -1) {
                    writer.write(character);
                }

                // Close the reader for the current input file
                reader.close();
            }

            // Close the writer for the output file
            writer.close();
            
            System.out.println("Files concatenated successfully!");
        } catch (IOException e) {
            // Handle any IO exceptions that may occur
            e.printStackTrace();
        }
    }
}

