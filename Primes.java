public class Primes {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        boolean [] arr = new boolean [n+1];

        arr[0] = false;
        arr[1] = false;
        for(int j=2;j<arr.length;j++)
        {
            arr[j] = true;
        }

        System.out.println("Prime numbers up to " + n + ":");
        int i = 2;

        while(i<=Math.sqrt(n))
        {
            if(arr[i] == true)
            {
                for(int l = i + i; l < arr.length; l = l + i)
                {
                    arr[l] = false;
                }
            }

            i++;

        }

        int count = 0;
        for(int m = 0; m<arr.length; m++)
        {
            if(arr[m] == true)
            {
                System.out.println(m);
                count ++;
            }
        }
        int percentage = (int)(((double)count / n) * 100);
        System.out.println("There are " + count + " primes between 2 and " + n + 
                       " (" + percentage + "% are primes)");
}
}