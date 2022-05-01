package first;

public class Title extends Cource{
    private People[] peoples;
    static String title;

    @Override
    public void doIt(Title title) {

        for (People possible : peoples) {
            possible.getResult(title);
        }
    }
    
    public Title(String title, People ... peoples) {
        this.title = title;
        this.peoples = peoples;
        System.out.println(getPeoples());
    }

    public People[] getPeoples() {
        return peoples;
    }
    public void getResult() {
        for (People people : peoples) {
            System.out.println("Результаты соревнований участника по имени  ");
        }
    }
}
