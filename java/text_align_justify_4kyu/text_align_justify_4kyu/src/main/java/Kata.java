import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Kata {
    public static String justify(String text, int width) {
        List<List<String>> lines = Kata.wrapText(text, width);

        return IntStream.range(0, lines.size())
                .mapToObj(index -> {
                    var isLast = index == lines.size() - 1;
                    var line = lines.get(index);

                    if (!isLast) {
                        return justifyLine(line, width);
                    }

                    return String.join(" ", line);
                })
                .collect(Collectors.joining("\n"));
    }

    private static String justifyLine(List<String> line, int width) {
        int wordsLength = line.stream().mapToInt(String::length).sum();

        if (line.size() == 0) {
            return "";
        }

        if (line.size() == 1) {
            return line.get(0);
        }

        int spaces = width - wordsLength;
        int gaps = line.size() - 1;

        StringBuilder result = new StringBuilder(line.get(0));

        for (int i = 1; i < line.size(); i++) {
            String word = line.get(i);

            int gapSpacesCount = (int) Math.ceil((double) spaces / gaps);
            String gapSpaces = " ".repeat(gapSpacesCount);
            result.append(gapSpaces).append(word);

            gaps--;
            spaces -= gapSpacesCount;
        }

        return result.toString();
    }

    private static List<List<String>> wrapText(String text, int width) {
        List<String> words = Arrays.stream(text.split("\\s")).toList();
        List<List<String>> result = new ArrayList<>();

        List<String> currentLine = new ArrayList<>();
        int currentLineLength = 0;

        for (var word : words) {
            if (currentLineLength == 0) {
                currentLineLength += word.length();
                currentLine.add(word);
            } else {
                int nextCurrentLineLength = currentLineLength + word.length() + 1;

                if (nextCurrentLineLength <= width) {
                    currentLineLength = nextCurrentLineLength;
                    currentLine.add(word);
                } else {
                    result.add(currentLine);
                    currentLine = new ArrayList<>();
                    currentLine.add(word);
                    currentLineLength = word.length();
                }
            }
        }

        if (!currentLine.isEmpty()) {
            result.add(currentLine);
        }

        return result;
    }
}
