import java.util.Arrays;

public class Functional{
	public static void innerIter(){
		int[] arr = {1,2,3,4,5,6};
		Arrays.stream(arr).forEach((value)->System.out.println(value));
	}

	public	static void mapFunc(){
		int[] arr = {1,2,3,4,5,6};
		Arrays.stream(arr).map((x)->x=x+1).forEach((value)->System.out.println(value));
	}

	//public	static void filterFunc(){
//		int[] arr = {1,2,3,4,5,6};
//		Arrays.stream(arr).filter(new IntPredicate(){
//			public boolean test(int value){
//				return false;
//			}
//		}).forEach((value)->System.out.println(value));
//	}

	public	static void filterFunc(){
		int[] arr = {1,2,3,4,5,6};
		Arrays.stream(arr).filter((x)->x%2==0).forEach((value)->System.out.println(value));
	}

	public static void reduceFunc(){
		int[] arr={1,2,3,4,5,6};
		int y = Arrays.stream(arr).filter((x)->x%2==0).reduce(0,Integer::sum);
		System.out.println(y);
	}

	public static void main(String[] args) {
		//mapFunc();
		//innerIter();
		//filterFunc();
		reduceFunc();
	}
}