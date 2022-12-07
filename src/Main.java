public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison Computation Program");
        Line line1=new Line();
        System.out.println("Enter Value for Line 1");
        Double lineOne =line1.getLengthOfLine();
        Line line2=new Line();
        System.out.println("Enter Value for Line 2");
        Double lineTwo=line2.getLengthOfLine();
        System.out.println("Length of line 1 :"+lineOne);
        System.out.println("Length of line 2 :"+lineTwo);
        Line line=new Line();
        line.isEqual(lineOne,lineTwo);
        line.copmpare(lineOne,lineTwo);
    }
}