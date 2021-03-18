package SessionLap04;

public class vd7 {
  public static void main(String[]args){
    int mark[] ={74,43,58,60,90,64,70};
    int sum = 0;
    int sumSq = 0;
    double mean , stdDev;

    for (int i = 0;i<mark.length;i++){
      sum += mark[i];
      sumSq += mark[i] *mark[i];
    }
    mean = (double) sum/mark.length;
    stdDev = Math.sqrt((double) sumSq/mark.length-mean*mean);

    System.out.printf("Mean is %.2f%n",mean);
    System.out.printf("%.2f%n",stdDev);
  }
}
