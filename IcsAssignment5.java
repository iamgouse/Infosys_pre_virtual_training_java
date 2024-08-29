//Find a number wheather it is Armstrong or not
class Tester {
	public static void main(String[] args) {
    int n = 153;//input
    int r, c;
    int arm = 0;
    c = n;
    while(n>0){
    r = n % 10;
    arm = (r * r * r) + arm;
    n = n / 10;
    }
    if(c == arm){
        System.out.println(c+ "is an Armstrong number");
    }
    else{ 
          System.out.println(c+ "is not an Armstrong number");
    }
	}
}
