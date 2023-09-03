package session11.homework.challenge3;

class B extends Marks {

    private double firstGrade;
    private double secondGrade;
    private double thirdGrade;
    private double forthGrade;

    public B(double firstGrade, double secondGrade, double thirdGrade, double forthGrade) {
        this.firstGrade = firstGrade;
        this.secondGrade = secondGrade;
        this.thirdGrade = thirdGrade;
        this.forthGrade = forthGrade;
    }

    @Override
    double getPercentage() {
        double totalMarks = firstGrade + secondGrade + thirdGrade + forthGrade;
        return (totalMarks / 400) * 100;
    }
}