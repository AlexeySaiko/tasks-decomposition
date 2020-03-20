package by.htp.hometask.saiko.decomposition;

import java.util.Random;
import java.util.Scanner;

public class Tasks {

	public static void main(String[] args) {
	
		task01();
		task02();
		task03();
		task04();
		task05();
		task06();
		task07();
		task08();
		task09();
		task10();
		task11();
		task12();
		task13();
		task14();
		task15();
		task16();
		task17();
		task18();
		task19();
		task20();
	}

	
	public static void task01() {
		
		// ����������� ����� ������������ ����� ������. �������� ����� ��� ���������� ��� �������. 
		
		int x1 = 10;
		int y1 = 12;
		int x2 = 3;
		int y2 = 7;
		int x3 = 9;
		int y3 = 6;
		
		double s = 0.5 * Math.abs((x2 - x1) * (y3 - y1) - (x3 - x1) * (y2 - y1));
	
		printResult(s);
	}
	
	public static void printResult(double s) {
		System.out.println("������� ������������ = " + s);
	}

	
	public static void task02() {
		
		// �������� �����(������) ��� ���������� ����������� ������ �������� � ����������� ������ �������� ���� ����������� �����: 
		
	        int a = 96;
	        int b = 10;

	        System.out.println("���: " + calcNod(a, b));
	        System.out.println("���: " + calcNok(a, b));
	        
	    }

	    public static int calcNod(int a, int b) {
	        int nod = 1;

	        for (int i = 1; i <= a; i++) {
	            if ((a % i == 0) && (b % i == 0)) {
	                nod = i;
	            }
	        }
	        return nod;
	    }

	    public static int calcNok(int a, int b) {
	    	int nok = (a * b) / (calcNod(a, b));
	        return nok;
	    }
	    
	    
	    public static void task03() {
	    	
	    	// �������� �����(������) ��� ���������� ����������� ������ �������� ������� ����������� �����. 
	    	
	    	int a = 10;
	    	int b = 12;
	    	int c = 20;
	    	int d = 30;
	    	
	    	System.out.println("���: " + calcNod(a, b, c, d));
	    }
	    
	    public static int calcNod(int a, int b, int c, int d) {
	    	
	    	int nod = 1;
	    	
	    	for(int i = 1; i <= a; i++) {
	    		if((a % i == 0) && (b % i == 0) && (c % i == 0) && (d % i == 0)) {
	    			nod = i;
	    		}
	    	}
	    	return nod;
	    }
	    
	    
	    public static void task04() {
	    	
	    	// �������� �����(������) ��� ���������� ����������� ������ �������� ���� ����������� �����. 
	    	
	    	int a = 24;
	    	int b = 32;
	    	int c = 44;
	    	calcNok(a, b, c);
	    	System.out.println("���: " + calcNok(a, b ,c));
	    }
	    
	    public static int calcNod(int a, int b, int c) {
	    	
	    	int nod = 1;
	    	
	    	for(int i = 1; i <= a; i++) {
	    		if((a % i == 0) && (b % i == 0) && (c % i == 0)) {
	    			nod = i;
	    		}
	    	}
	    	return nod;
	    }
	    
	    public static int calcNok(int a, int b, int c) {
	    	
	    	int nok = (a * b * c) / (calcNod(a, b, c));
	        return nok;
	    }
	    
	    
	    public static void task05() {
	    	
	    	// �������� �����(������) ��� ���������� ����� �������� � �������� �� ���� �����. 
	    	
	    	int a = 33;
	    	int b = 10;
	    	int c = -2;
	    	int max = calcMax(a, b, c);
	    	int min = calcMin(a, b, c);
	    	int sum = calcSum(max, min);
			
	    	System.out.println("����� �������� � �������� �� ���� ����� = " + sum);
	    }
	    
	    public static int calcMax(int a, int b, int c) {
	    	int max = Math.max(Math.max(a, b), c);
	    	return max;
	    }
	    
	    public static int calcMin(int a, int b, int c) {
	    	int min = Math.min(Math.min(a, b), c);
	    	return min;
	    }
	    
	    public static int calcSum(int max, int min) {
	    	int sum = max + min;
	    	return sum;
	    }
	   
	    
	    public static void task06() {
	    	
	    	// ��������� ������� ����������� �������������� �� �������� �, ��������� ����� ���������� ������� ������������. 
	    	
	    	int a = 7;
	    	double areaTr = calcAreaTr(a);
	    	double areaHex = calcAreaHex(areaTr);
	    	System.out.println("������� �������������� = " + areaHex);
	    }
	    
	    public static double calcAreaTr(int a) {
	    	
	    	double areaTr = Math.sqrt(3) / 4 * a * a;
	    	return areaTr;
	    }
	   
	    public static double calcAreaHex(double areaTr) {
	    	
	    	double areaHex = 6 * areaTr;
	    	return areaHex;
	    }
	    
	    
	    public static void task07() {
	    	
	    	// �� ��������� ������ ������ ������������ n �����. �������� �����(������), ������������, ����� ������ �� ��� ����� ����� ������� ����������. ��������. ���������� ����� ������� � ������
	    
	    	int n = 10;
			double [] coord = new double[n];
			Random rand = new Random(10);

			for (int i = 0; i < coord.length; i++) {
				coord[i] = rand.nextDouble();
			}

			double max = 0;
			int in_i = 0;
			int in_j = 0;

			for (int i = 0; i < coord.length - 1; i += 2) {
				for (int j = i + 2; j < coord.length - 1; j += 2){

					double curDist;
					curDist = dist(coord[i], coord[i + 1], coord[j], coord[j + 1]);

					if (max < curDist) {
						max = curDist;
						in_i = i;
						in_j = j;
					}
				}
			}

			System.out.println("����� ������� ���������� ����� �������: �(" + coord[in_i] + ", " +  coord[in_i + 1] + ") � B(" + coord[in_j] + "," + coord[in_j + 1] + ")");
		}

		public static double dist (double x1, double y1, double x2, double y2) {
			
			double dist = 0;
			
			dist = Math.sqrt((Math.pow(x2, 2) - Math.pow(x1, 2)) - (Math.pow(y2, 2) - Math.pow(y1, 2)));
			return dist;
		}
	        
	    
	    public static void task08() {
	    	
	    	// ��������� ���������, ������� � ������� A[N] ������� ������ �� �������� ����� (������� �� ������ �����, ������� ������ ������������� �������� �������, �� ������ ���� ������ ���������)
	    	
	    	int[] mas = {23, 45, 2, 0, 38, 12, 43};
			int res;
			
			res = SecondValue(mas);
			
			System.out.println("������ �� �������� ����� �������: " + res);	
		}
			public static int SecondValue(int[] mas) {
			
				for (int i = mas.length - 1; i > 0; i--) {
					for (int j = 0; j < i; j++) {
						if (mas[j] > mas[j + 1]) {
							int x = mas[j];
							mas[j] = mas[j + 1];
							mas[j + 1] = x;
											}
				}
			}
			return mas[mas.length - 2]; 
	    }
	    
			
	    public static void task09() {
	    	
	    	// �������� �����(������), �����������, �������� �� ������ ��� ����� ������� ��������.  
	    	
	    	int a = 10;
	    	int b = 6;
	    	int c = 2;
	    	calNok(a, b, c);
	    	
	    	if(calNok(a, b, c) == a * b * c) {
	    		System.out.println("����� �������� ������� ��������");
	    	} else {
	    		System.out.println("����� �� �������� ������� ��������");
	    	}
	    }
	    
	    public static int calNod(int a, int b, int c) {
	    	
	    	int nod = 1;
	    	
	    	for(int i = 1; i <= a; i++) {
	    		if((a % i == 0) && (b % i == 0) && (c % i == 0)) {
	    			nod = i;
	    		}
	    	}
	    	return nod;
	    }
	    
	    public static int calNok(int a, int b, int c) {
	    	
	    	int nok = (a * b * c) / (calNod(a, b, c));
	        return nok;
	    }
	    	    
	    
	    public static void task10() {
	    	
	    	// �������� �����(������) ��� ���������� ����� ����������� ���� �������� ����� �� 1 �� 9.
	    	
	    	System.out.println("����� ����������� ���� �������� ����� �� 1 �� 9 = " + sumFact());
	    }

	    public static int sumFact() {
	      
	    	int sum = 0;
	        int fact = 1;

	        for (int i = 1; i <= 9; i++) {
	            fact *= i;
	            if (i % 2 != 0) {
	                sum += fact;
	            }
	        }
	        return sum;
	  }
	    
	    
	    public static void task11() {
	    	
	    	// ����� ������ D. ���������� ��������� �����: D[l] + D[2] + D[3]; D[3] + D[4] + D[5]; D[4] +D[5] +D[6]. ���������. ��������� �����(������) ��� ���������� ����� ���� ��������������� ������������� ��������� ������� � �������� �� k �� m.
	    	
	    	int n = 6;
	    	int[] mas = new int[n];
	    	
	    	System.out.print("������: ");
	    	
	    	for (int i = 0; i < n; i++) {
	    		mas[i] = i + 1;
	    		
	    		System.out.print(mas[i] + " ");
	    	}
	    	
	    	calcSum(1, 3, mas);
	    	calcSum(3, 5, mas);
	    	calcSum(4, 6, mas);
	    }	
	    	
	    public static int calcSum(int k, int m, int[] mas) {
	    		
	    	int sum = 0;
	    		
	    	for(int i = k - 1; i <= m - 1; i++) {
	    		sum += mas[i];
	    	}
	    		
	    	System.out.print('\n' + "����� �� " + k + " �� " + m + " = " + sum);
	    		return sum;
	    	}
	    
	    
	    public static void task12() {
	    	
	    	// ���� ����� X, Y, Z, � � ����� ������ ����������������. �������� �����(������) ���������� ��� �������, ���� ���� ����� ��������� ������ X � Y� ������.
	    	
	    	int x = 4;
	    	int y = 6;
	    	int z = 5;
	    	int t = 9;
	    	int per = 0;
	     	calcArea(x, y, z, t, per);
	    	
	    	System.out.println('\n' + "������� = " + calcArea(x, y, z, t, per));
	    	
	    }
	    
	    public static int calcHalfPerimeter(int x, int y, int z, int t) {
	    	
	    	int per = (x + y + z + t) / 2;
	    	return per;
	    }
	    
	    public static double calcArea(int x, int y, int z, int t, int per) {
	    	
	    	double area = Math.sqrt((per - x) * (per - y) * (per - z) * (per - t));
	    	return area;
	    }

	    
	    public static void task13() {
	    	
	    	// ���� ����������� ����� N. �������� �����(������) ��� ������������ �������, ���������� �������� �������� ����� ����� N.

	    	int n = 143623;
	    	methNum(n);
		}

		public static int[] methNum(int n) {
			int k = 0;
			int m = n;
			while (m > 0) {
				m = m / 10;
				k++;
			}
			
			int g = 0;
			int[] mass = new int[k];
			for (int i = (k - 1); i >= 0; i--) {
				g = n % 10;
				mass[i] = g;
				n = n / 10;
				System.out.print(mass[i] + " ");
			}
			return mass;
	    }
	    
		
	    public static void task14() {
	    	
	    	// �������� �����(������), ������������, � ����� �� ������ ���� ����� ������ ����.
	    	
	    	int x = 252223;
			int y = 12343;

			calcNumeral(x, y);
		}

		public static void calcNumeral(int x, int y) {

			while (x > 0 && y > 0) {

				x = x / 10;
				y = y / 10;
				if (x == 0 && y == 0) {
					System.out.println('\n' + "� ���� ������ ���������� ���������� ����");
					
				}
				else if (y == 0) {
					System.out.println('\n' + "� ������ ����� ������ ����");
				}

				else if (x == 0) {
					System.out.println('\n' + "�� ������ ����� ������ ����");
				}

			}
	    	
	    }
	    
		
		public static void task15() {
			
			// ���� ����������� ����� � � N. �������� �����(������) ������������ ������� �, ���������� �������� �������� �����, ����� ���� ������� ����� � � ������� �� ������� N
			
			 int k = 12;
		     int n = 9;
		     int [] mas = new int [1000];
		     int count = 0;
		    
		     for (int i = 0; i < 12; i++) {
		         for (int j = 0; j < 12; j++) {
		             for (int h = 0; h < 12; h++) {
		                 if (i + j + h == k && i <= n && j <= n && h <= n) {
		                     mas[count] = 100 * i + 10 * j + h;
		                     count++;
		                  }
		              }
		          }
		      }

		      for (int i = 0; i < count; i++) {
		          System.out.print(mas[i] + " ");
		      }
		}
		
		
		public static void task16() {
			
			// ��� ������� ����� ���������� �����������, ���� ��� ���������� ���� �� ����� �� 2 (��������, 41 � 43). ����� � ���������� ��� ���� ���������� �� ������� [n,2n], ��� n - �������� ����������� ����� ������ 2. ��� ������� ������ ������������ ������������
			
			int n = 99;

			findTwinsNumbers(n);
		}

		public static void findTwinsNumbers(int n) {
			System.out.printf("���� ���������� �� ������� [%d,%d]:\n", n, (2 * n));

			for (int i = n; i <= n * 2 - 2; i++) {
			    if (twinsNumber(i) && twinsNumber(i + 2)) {
			    	System.out.printf("%d � %d\n", i, i + 2);
			    }
			}
	    }

		public static boolean twinsNumber(int num) {
			
			boolean number = true;

			for (int i = 2; i < num; i++) {
			    if (num % i == 0) {
				number = false;
				break;
			    }
			}
			return number;	
		}
		
		
		public static void task17() {
			
			// ����������� �����, � ������ �������� n ����, ���������� ������ ����������, ���� ����� ��� ����, ����������� � ������� n, ����� ������ �����. ����� ��� ����� ���������� �� 1 �� k. ��� ������� ������ ������������ ������������.
			
			System.out.print("������� �����: ");
	        Scanner sc = new Scanner(System.in);

	        int k = sc.nextInt();

	        findNum(k);
	    }

	    public static void findNum(int limit) {
	        
	    	for (int i = 1; i <= limit; i++) {
	            int sum = 0;
	            int temp = i;

	            for (int j = 1; j <= count(i); j++) {
	                sum += temp % 10;
	                temp /= 10;
	            }

	            if (Math.pow(sum, count(i)) == i) {
	                System.out.println(i);
	            }
	        }
	    }

	    public static int count(int number) {
	       
	    	int count = 0;
	        while (number != 0) {
	            number /= 10;
	            count++;
	        }
	        return count;
		}
		    
	    
		public static void task18() {
			
			// ����� ��� ����������� n-������� �����, ����� � ������� �������� ������ ������������ ������������������ (��������, 1234, 5789). ��� ������� ������ ������������ ������������.
			
			int [] mas = new int[10];
	        for (int i = 0; i < mas.length; i++) {
	            mas[i] = i + 1;
	            System.out.print(mas[i] + " ");
	        }
	    
	        boolean flag = true;
	        for (int i = 1; i < mas.length; i++) {
	             if (mas[i] <= mas[i-1]) {
	            	 flag = false;
	                 break;
	             }
	         }

	        if (flag) {
	             System.out.println('\n' + "������ �������� ������ ������������ �������������������");
	         } else {
	             System.out.println('\n' + "������ �� �������� ������ ������������ �������������������");
	         }
		}
		
		
		public static void task19() {
			
			// �������� ���������, ������������ ����� n - ������� �����, ���������� ������ �������� �����. ���������� �����, ������� ������ ���� � ��������� �����. ��� ������� ������ ������������ ������������.
			
			boolean flag;
	        int sum = 0;
	        int count;
	        int n = 5;

	        for (int x = (int) Math.pow(10, n - 1 ); x < (int) Math.pow(10, n); x++) {
	            flag = neChet(x);
	            if (flag) {
	                sum += x;
	            }
	        }
	        
	        count = �het(sum);

	        System.out.println("����� �����, ���������� ������ �������� ����� �����: " + sum);
	        System.out.println("���������� ������ ���� � ��������� ����� �����: " + count);
	    }

	    public static boolean neChet (int x) {
	       
	    	boolean flag = true;
	        int a;

	        while (x != 0) {
	            a = x % 10;
	            if (a % 2 != 0) {
	                x /= 10;
	            }  else {
	              flag = false;
	              break;
	            }
	        }
	        return flag;
	    }

	    public static int �het (int sum) {
	        int count = 0;
	        int a;

	        while (sum != 0) {
	            a = sum % 10;
	            if (a % 2 == 0) {
	                count++;
	            }
	            sum /= 10;
	         }
	        return count;
		}
		
	    
	    public static void task20() {
	    	
	    	//  �� ��������� ����� ����� ����� ��� ����. �� ���������� ����� ����� ����� ��� ���� � �.�. ������� ����� �������� ���� ����������, ����� ��������� ����? ��� ������� ������ ������������ ������������.
	    	
	    	int n = 100;
			int count = getCount(n);

			System.out.println("���������� ���������� " + count + " ��������");
		}

		public static int getSum(int n) {
			
			int sum = 0;
	
			while (n > 0) {
				sum = sum + (n % 10);
				n = n / 10;
			}
			return sum;
		}

		public static int getCount(int n) {
		
			int s = getSum(n);
			int k = 0;

			while (n > 0) {
				n = n - s;
				k++;
			}
			return k;
	    	
	    }
}
