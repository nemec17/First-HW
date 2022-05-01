package first;

public class Distance extends Cource{
        private int jump;
        private double stamina;

        public Distance(int jump, double stamina) {
            this.jump = jump;
            this.stamina = stamina;
        }

        @Override
        public void doIt(Title title) {
            for (People people : title.getPeoples()) {
                if (people.JumpifRun() >= jump && people.StaminaIfRun() >= stamina) {
                    people.setResult(this, true);
                } else {
                    people.setResult(this, false);
                }
            }
        }
    public String toString() {
        return "Пробежит ли участник дистанцию, и хватит ли у него выносливости, есть припятствия и их нужно перепрыгнуть.";
    }
}
