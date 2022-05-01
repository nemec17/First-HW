package first;

public class Cource <P extends Distance>{

    private P[] obstacles;

    @SafeVarargs
    public Cource(P... obstacles) {
        this.obstacles = obstacles;

    }

    public void doIt(Title title) {
        for (P obstacle : obstacles) {
            obstacle.doIt(title);
        }
    }
}
