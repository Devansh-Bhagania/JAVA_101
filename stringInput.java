import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;   


public class stringInput {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        System.out.print(st);

       
        // Create the command to execute
        String command = "curl";
        String apiUrl = "https://code-god.vercel.app.com/dsa?question=binary-search";
        String[] curlCommand = {command, apiUrl};

        // Create the process builder
        ProcessBuilder processBuilder = new ProcessBuilder("curl","-s","https://code-god.vercel.app.com/dsa?question=binary-search");
        Process proc = processBuilder.start();

        // Read the output
        BufferedReader reader = new BufferedReader(new InputStreamReader(proc.getInputStream()));
        StringBuilder builder = new StringBuilder();
        String line;
        while ((line = reader.readLine()) != null) {
            builder.append(line);

            builder.append(System.getProperty("line.separator"));
        }
        String result = builder.toString();
        System.out.println(result);
        

        // try {
        //     // Start the process
        //     Process process = processBuilder.start();

        //     // Read the output from the process
        //     BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
        //     String line;
        //     StringBuilder response = new StringBuilder();

        //     while ((line = reader.readLine()) != null) {
        //         response.append(line);
        //     }

        //     // Wait for the process to complete
        //     int exitCode = process.waitFor();

        //     if (exitCode == 0) {
        //         // API request successful
        //         String apiResponse = response.toString();
        //         // Process the API response
        //         // ...
        //         System.out.println(apiResponse);
        //     } else {
        //         // API request failed
        //         System.out.println("API request failed with exit code: " + exitCode);
        //     }
        // } catch (IOException | InterruptedException e) {
        //     e.printStackTrace();
        // }
    
        sc.close();
    }
}
