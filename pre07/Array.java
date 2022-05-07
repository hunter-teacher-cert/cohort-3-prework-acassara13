public class Array{

/*public static double[] powArray (double a[]){
    for (int i = 0; i < a.length; i++) {
         a[i] = Math.pow(a[i], 2.0);
    }
    return a;
}
public static void main(String[] args) {
    double[] a = new double[]{2, 4, 6, 8};
    System.out.println(Arrays.toString(powArray(a)));
}*/
  public static void main(String[] args) {
        // TODO Auto-generated method stub
        double a[] = new double[]{2,5,4,6};
         powArray(a,0);
        for(double value:a){
            System.out.println(value);
        }

    }

    public static void powArray(double a[], int index) {
        if (index < a.length) {
            a[index] = Math.pow(a[index], 2.0);
            powArray(a, ++index);
        }
    }
}