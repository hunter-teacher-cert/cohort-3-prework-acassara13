public class Array{

  public static void main(String[] args) {
        // TODO Auto-generated method stub
        double a[] = new double[]{2,4,6,8};
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

    public static void histogram(int b[])
}