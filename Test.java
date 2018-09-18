public class Test{


	public static void main(String[] args){
	   String line ="That's Great!";
	   int len= line.length();
	   System.out.println("\"" + line +"\" has " +(len+2)+ " characters.");

	   double num = 9/5;
	   System.out.println(num);

	   String s = "The Simpsons";
	    System.out.println(s.length());

	    int var = (int) Math.random()*1 +10;
	      System.out.println(var);

	      int r = 100;
	      int answer = (int)(Math.PI*Math.pow(r,2));
	       System.out.println(answer);

	       int rand = (int) (Math.random()*5 +3);
	       System.out.println(rand);
	       rand = (int) (Math.pow(rand, 2));
            System.out.println(rand);


            String s1="Hi There!";
            String s2=s1;
            String s3=s2.toLowerCase();
            String s4 = s3.toUpperCase();
            s4=s1;
            s4= null;
            System.out.println("s1 =" +s1);



	}
}