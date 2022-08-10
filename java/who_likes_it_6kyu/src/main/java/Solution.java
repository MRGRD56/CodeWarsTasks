import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {
    public static String whoLikesIt(String... names) {
        var namesList = Arrays.stream(names).toList();
        var fittedNames = fitNamesArray(namesList, 3);
        var namesString = combineNames(fittedNames);
        return String.format("%s %s this", namesString, formatLikeVerb(names.length));
    }

    private static List<String> fitNamesArray(List<String> names, int maxNames) {
        if (names.size() == 0) {
            return List.of("no one");
        }

        if (names.size() <= maxNames) {
            return names;
        }

        var result = names.stream().limit(maxNames - 1).collect(Collectors.toList());
        var restNamesCount = names.size() - (maxNames - 1);
        var restNamesString = String.format("%d others", restNamesCount);
        result.add(restNamesString);
        return result;
    }

    private static String combineNames(List<String> names) {
        var result = new StringBuilder();
        for (var i = 0; i < names.size(); i++) {
            if (i != 0) {
                if (i == names.size() - 1) {
                    result.append(" and");
                } else {
                    result.append(",");
                }

                result.append(" ");
            }

            result.append(names.get(i));
        }

        return result.toString();
    }

    private static String formatLikeVerb(int count) {
        return (count >= 0 && count <= 1) ? "likes" : "like";
    }
}