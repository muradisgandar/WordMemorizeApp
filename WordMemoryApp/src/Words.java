public class Words {
    String english;
    String azerbaijan;

    public Words() {

    }

    public Words(String english, String azerbaijan) {
        this.english = english;
        this.azerbaijan = azerbaijan;
    }

    public String getEnglish() {
        return english;
    }

    public void setEnglish(String english) {
        this.english = english;
    }

    public String getAzerbaijan() {
        return azerbaijan;
    }

    public void setAzerbaijan(String azerbaijan) {
        this.azerbaijan = azerbaijan;
    }

    @Override
    public String toString() {
        return "Words{" +
                "english='" + english + '\'' +
                ", azerbaijan='" + azerbaijan + '\'' +
                '}';
    }
}
