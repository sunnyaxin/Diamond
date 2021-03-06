import java.util.List;

class Diamond {
    private IsoscelesTriangle triangle = new IsoscelesTriangle();

    Diamond() {
    }

    List<String> diamond(int n) {
        List<String> list = triangle.drawIsosceles(n);
        for (int i = n - 1; i > 0; i--) {
            list.add(triangle.generateLine(n, i));
        }
        return list;
    }

    List<String> diamondName(int n) {
        List<String> list = diamond(n);
        list.set(n-1, "Sunny");
        return list;
    }
}