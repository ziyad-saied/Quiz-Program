package QuizProg;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class quiz {

	public static void main(String[] args) {
		String[] questions = {
				"What's The Capital Of France ?","What's The Smallest Prime Number ?"
				,"Who's The President Of Russia ?","What's The Language Use With .net Framework ?"
		};
		String[] choices = {
				"1-Paris 2-Cairo 3-Milan 4-Munich",
				"1-'2' 2-'5' 3-'7' 4-'9'",
				"1-Byden 2-Obama 3-Potein 4-Georg",
				"1-Java 2-Python 3-C++ 4-C#"
		};
		
		int[] answers= {1,1,3,4};
		List<Integer> ls = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<questions.length;i++) {
			System.out.println("Question "+(i+1)+"- "+questions[i]);
			System.out.println(choices[i]);
			int ans=sc.nextInt();
			ls.add(ans);
		}
		
		int score=0;
		for(int i=0 ;i<answers.length;i++) {
			if(answers[i]==ls.get(i)) {
				score++;
		}}
		System.out.println("Your Score Is : "+ score);
	}

}
