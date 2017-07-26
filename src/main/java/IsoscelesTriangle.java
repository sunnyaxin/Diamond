import java.util.ArrayList;
import java.util.List;

class IsoscelesTriangle {
    IsoscelesTriangle() {
    }

    List<String> drawIsosceles(int n) {
        List<String> list = new ArrayList<>();
        for (int line = 1; line <= n; line++) {
            list.add(generateLine(n, line));
        }
        return list;
    }

    String generateLine(int n, int line) {
        return generateBlank(n, line) +
                generateStar(line) +
                generateBlank(n, line);
    }

    private String generateStar(int line) {
        StringBuilder star = new StringBuilder();
        for (int i = 0; i < (2 * line - 1); i++) {
            star.append("*");
        }
        return star.toString();
    }

    private String generateBlank(int n, int line) {
        StringBuilder blank = new StringBuilder();
        for (int i = 0; i < (n - line); i++) {
            blank.append(" ");
        }
        return blank.toString();
    }
}