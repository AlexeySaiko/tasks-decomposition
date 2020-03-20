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
		
		// Треугольник задан координатами своих вершин. Написать метод для вычисления его площади. 
		
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
		System.out.println("Площадь треугольника = " + s);
	}

	
	public static void task02() {
		
		// Написать метод(методы) для нахождения наибольшего общего делителя и наименьшего общего кратного двух натуральных чисел: 
		
	        int a = 96;
	        int b = 10;

	        System.out.println("НОД: " + calcNod(a, b));
	        System.out.println("НОК: " + calcNok(a, b));
	        
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
	    	
	    	// Написать метод(методы) для нахождения наибольшего общего делителя четырех натуральных чисел.  
	    	
	    	int a = 10;
	    	int b = 12;
	    	int c = 20;
	    	int d = 30;
	    	
	    	System.out.println("НОД: " + calcNod(a, b, c, d));
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
	    	
	    	// Написать метод(методы) для нахождения наименьшего общего кратного трех натуральных чисел. 
	    	
	    	int a = 24;
	    	int b = 32;
	    	int c = 44;
	    	calcNok(a, b, c);
	    	System.out.println("НОК: " + calcNok(a, b ,c));
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
	    	
	    	// Написать метод(методы) для нахождения суммы большего и меньшего из трех чисел.  
	    	
	    	int a = 33;
	    	int b = 10;
	    	int c = -2;
	    	int max = calcMax(a, b, c);
	    	int min = calcMin(a, b, c);
	    	int sum = calcSum(max, min);
			
	    	System.out.println("Сумма большего и меньшего из трех чисел = " + sum);
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
	    	
	    	// Вычислить площадь правильного шестиугольника со стороной а, используя метод вычисления площади треугольника.  
	    	
	    	int a = 7;
	    	double areaTr = calcAreaTr(a);
	    	double areaHex = calcAreaHex(areaTr);
	    	System.out.println("Площадь шестиугольника = " + areaHex);
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
	    	
	    	// На плоскости заданы своими координатами n точек. Написать метод(методы), определяющие, между какими из пар точек самое большое расстояние. Указание. Координаты точек занести в массив
	    
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

			System.out.println("Самое большое расстояние между точками: А(" + coord[in_i] + ", " +  coord[in_i + 1] + ") и B(" + coord[in_j] + "," + coord[in_j + 1] + ")");
		}

		public static double dist (double x1, double y1, double x2, double y2) {
			
			double dist = 0;
			
			dist = Math.sqrt((Math.pow(x2, 2) - Math.pow(x1, 2)) - (Math.pow(y2, 2) - Math.pow(y1, 2)));
			return dist;
		}
	        
	    
	    public static void task08() {
	    	
	    	// Составить программу, которая в массиве A[N] находит второе по величине число (вывести на печать число, которое меньше максимального элемента массива, но больше всех других элементов)
	    	
	    	int[] mas = {23, 45, 2, 0, 38, 12, 43};
			int res;
			
			res = SecondValue(mas);
			
			System.out.println("Второе по величине число массива: " + res);	
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
	    	
	    	// Написать метод(методы), проверяющий, являются ли данные три числа взаимно простыми.  
	    	
	    	int a = 10;
	    	int b = 6;
	    	int c = 2;
	    	calNok(a, b, c);
	    	
	    	if(calNok(a, b, c) == a * b * c) {
	    		System.out.println("Числа являются взаимно простыми");
	    	} else {
	    		System.out.println("Числа не являются взаимно простыми");
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
	    	
	    	// Написать метод(методы) для вычисления суммы факториалов всех нечетных чисел от 1 до 9.
	    	
	    	System.out.println("Сумма факториалов всех нечетных чисел от 1 до 9 = " + sumFact());
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
	    	
	    	// Задан массив D. Определить следующие суммы: D[l] + D[2] + D[3]; D[3] + D[4] + D[5]; D[4] +D[5] +D[6]. Пояснение. Составить метод(методы) для вычисления суммы трех последовательно расположенных элементов массива с номерами от k до m.
	    	
	    	int n = 6;
	    	int[] mas = new int[n];
	    	
	    	System.out.print("Массив: ");
	    	
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
	    		
	    	System.out.print('\n' + "Сумма от  " + k + " до " + m + " = " + sum);
	    		return sum;
	    	}
	    
	    
	    public static void task12() {
	    	
	    	// Даны числа X, Y, Z, Т — длины сторон четырехугольника. Написать метод(методы) вычисления его площади, если угол между сторонами длиной X и Y— прямой.
	    	
	    	int x = 4;
	    	int y = 6;
	    	int z = 5;
	    	int t = 9;
	    	int per = 0;
	     	calcArea(x, y, z, t, per);
	    	
	    	System.out.println('\n' + "Площадь = " + calcArea(x, y, z, t, per));
	    	
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
	    	
	    	// Дано натуральное число N. Написать метод(методы) для формирования массива, элементами которого являются цифры числа N.

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
	    	
	    	// Написать метод(методы), определяющий, в каком из данных двух чисел больше цифр.
	    	
	    	int x = 252223;
			int y = 12343;

			calcNumeral(x, y);
		}

		public static void calcNumeral(int x, int y) {

			while (x > 0 && y > 0) {

				x = x / 10;
				y = y / 10;
				if (x == 0 && y == 0) {
					System.out.println('\n' + "В двух числах одинаковое количество цифр");
					
				}
				else if (y == 0) {
					System.out.println('\n' + "В первом числе больше цифр");
				}

				else if (x == 0) {
					System.out.println('\n' + "Во втором числе больше цифр");
				}

			}
	    	
	    }
	    
		
		public static void task15() {
			
			// Даны натуральные числа К и N. Написать метод(методы) формирования массива А, элементами которого являются числа, сумма цифр которых равна К и которые не большее N
			
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
			
			// Два простых числа называются «близнецами», если они отличаются друг от друга на 2 (например, 41 и 43). Найти и напечатать все пары «близнецов» из отрезка [n,2n], где n - заданное натуральное число больше 2. Для решения задачи использовать декомпозицию
			
			int n = 99;

			findTwinsNumbers(n);
		}

		public static void findTwinsNumbers(int n) {
			System.out.printf("Пары «близнецов» на отрезке [%d,%d]:\n", n, (2 * n));

			for (int i = n; i <= n * 2 - 2; i++) {
			    if (twinsNumber(i) && twinsNumber(i + 2)) {
			    	System.out.printf("%d и %d\n", i, i + 2);
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
			
			// Натуральное число, в записи которого n цифр, называется числом Армстронга, если сумма его цифр, возведенная в степень n, равна самому числу. Найти все числа Армстронга от 1 до k. Для решения задачи использовать декомпозицию.
			
			System.out.print("Введите число: ");
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
			
			// Найти все натуральные n-значные числа, цифры в которых образуют строго возрастающую последовательность (например, 1234, 5789). Для решения задачи использовать декомпозицию.
			
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
	             System.out.println('\n' + "Массив является строго возрастающей последовательностью");
	         } else {
	             System.out.println('\n' + "Массив не является строго возрастающей последовательностью");
	         }
		}
		
		
		public static void task19() {
			
			// Написать программу, определяющую сумму n - значных чисел, содержащих только нечетные цифры. Определить также, сколько четных цифр в найденной сумме. Для решения задачи использовать декомпозицию.
			
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
	        
	        count = chet(sum);

	        System.out.println("Сумма чисел, содержащих только нечетные цифры равна: " + sum);
	        System.out.println("Количество четных цифр в найденной сумме равно: " + count);
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

	    public static int chet (int sum) {
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
	    	
	    	//  Из заданного числа вычли сумму его цифр. Из результата вновь вычли сумму его цифр и т.д. Сколько таких действий надо произвести, чтобы получился нуль? Для решения задачи использовать декомпозицию.
	    	
	    	int n = 100;
			int count = getCount(n);

			System.out.println("Необходимо произвести " + count + " действий");
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
