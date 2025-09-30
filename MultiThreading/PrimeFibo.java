package MultiThreading;

public class PrimeFibo {
	public synchronized void primeno() {
		System.out.println("Prime no between 1 - 1000");
		for(int n=2; n<=1000; n++) {
			boolean isPrime = true;
			
			for(int i=2; i<=n/2; i++) {
				if(n%i==0) {
					isPrime=false;
				}
			}
			if(isPrime) {
				System.out.print(n + " ");
				try {
					Thread.sleep(50); // slowdown
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
		System.out.println();	
	}
	
	public synchronized void fibonacci() {
		int a=0, b=1;
		System.out.println("Fibonacci series between 1 - 1000");
		while(a<=1000) {
			System.out.print(a + " ");
			int temp = a + b;
			a = b;
			b = temp;
			try {
				Thread.sleep(50); // slowdown
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println();
	}
	
	public synchronized void perfectno() {
	System.out.println("Perfect numbers between 1 - 1000:");
    for (int n = 1; n <= 1000; n++) {
        int sum = 0;
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        if (sum == n) {
            System.out.print(n + " ");
            try {
				Thread.sleep(50); // slowdown
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
        }
    }
    System.out.println("\n");
	}
	
	public synchronized void armstrongno() {
	    System.out.println("Armstrong numbers between 1 - 1000:");
	    for (int n = 1; n <= 1000; n++) {
	        int sum = 0, temp = n;
	        int digits = String.valueOf(n).length();
	        while (temp > 0) {
	            int digit = temp % 10;
	            sum += (int) Math.pow(digit, digits);
	            temp /= 10;
	        }
	        if (sum == n) {
	            System.out.print(n + " ");
	            try {
					Thread.sleep(50); // slowdown
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
	        }
	    }
	    System.out.println("\n");
	}


	public synchronized void strongno() {
	 System.out.println("Strong numbers between 1 - 1000:");
     for (int n = 1; n <= 1000; n++) {
         int sum = 0, temp = n;
         while (temp > 0) {
             int digit = temp % 10;
             sum += factorial(digit);
             temp /= 10;
         }
         if (sum == n) {
             System.out.print(n + " ");
             try {
					Thread.sleep(50); // slowdown
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
         }
     }
     System.out.println();
 }

 // Helper method to calculate factorial
 private static int factorial(int n) {
     int fact = 1;
     for (int i = 1; i <= n; i++) {
         fact *= i;
     }
     return fact;
 }

	public synchronized void commonPrimeFibo() {
		int a=0, b=1;
		System.out.println("common  between 1 - 1000");
		while(a<=1000) {
			if(isPrime(a)) {
			System.out.print(a + " ");
			}
			int temp = a + b;
			a = b;
			b = temp;
			try {
				Thread.sleep(50); // slowdown
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println();
	}
		private boolean isPrime(int a) {
			if(a<=1) {
				return false;
			}
			else {
				for(int i=2; i<a; i++) {
					if(a%i == 0) {
					return false;
				}
			}
			return true;
		}
	}	
}
	


	
