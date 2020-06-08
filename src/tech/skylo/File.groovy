package tech.skylo

import java.nio.charset.Charset
import java.nio.file.Files
import java.nio.file.Path
import java.nio.file.Paths


Path file = Paths.get("/Users/dhimanmayank/Documents/test.txt");
Charset charset = Charset.forName("UTF-8");
try (BufferedReader reader = Files.newBufferedReader(file, charset)) {
    String line;
    while ((line = reader.readLine()) != null) {
        System.out.println(line);
    }

} catch (IOException e) {
    e.printStackTrace();
}


new java.io.File('/Users/dhimanmayank/Documents/test.txt').eachLine('UTF-8') {
    println it
}