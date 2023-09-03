package session11.homework.challenge3;

class A extends Marks {

    private double firstGrade;
    private double secondGrade;
    private double thirdGrade;

    public A(double firstGrade, double secondGrade, double thirdGrade) {
        this.firstGrade = firstGrade;
        this.secondGrade = secondGrade;
        this.thirdGrade = thirdGrade;
    }

    @Override
    double getPercentage() {
        double totalMarks = firstGrade + secondGrade + thirdGrade;
        return (totalMarks / 300) * 100;
    }
}