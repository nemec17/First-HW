package first;

import java.util.HashMap;
import java.util.Map;

public class People {
    private String name;
    private int weight;
    private int speed;
    private int stamina;
    private int jump;
    private Map<String, Boolean> result = new HashMap<>();

    public People(String name, int weight, int speed, int stamina, int jump) {
        this.name = name;
        this.weight = weight;
        this.speed = speed;
        this.stamina = stamina;
        this.jump = jump;
    }
    public String getPeople() {
        return name;
    }

    public int JumpifRun() {
        return jump;
    }
    public double StaminaIfRun() {
        return stamina;
    }
    public Map<String, Boolean> getResult(Title title) {
        return result;
    }
    public <P extends Distance> void setResult(P possible, boolean result) {
        this.result.put(possible.toString(), result);
        System.out.println(result);
    }
}
