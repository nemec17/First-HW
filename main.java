package first;

public class main {
    

    public static void main(String[] args) {

        Cource cource = new Cource(new Distance(5, 3));

        String[] nam = {"Vasya", "Sasha", "Masha", "Rita", "Olya", "Jenya", "Dima", "Alexey"};

        
        for (int i = 0; i < nam.length; i++) {
            double weig = 150 + (Math.random() * 100);
            weig = (int) weig;

            double speed = 10 + (Math.random() * 10);
            speed = (int) speed;

            double stamina = Math.random() * 100;
            stamina = (int) stamina;

            double jump = Math.random() * 3;
            jump = (int) jump;

            if (weig > 210 && weig < 240) {
                weig = weig - 30;
            } else if (weig >= 240) {
                weig = weig - 60;
            } else weig = weig;

            if ((i + 1) % 2 == 0) {
                Title first = new Title("Winner", new People(nam[i], (int) weig, (int) speed, (int) stamina, (int) jump));
            } else {
                Title second = new Title("Sportmens", new People(nam[i], (int) weig, (int) speed, (int) stamina, (int) jump));
            }
        }
    }
}
