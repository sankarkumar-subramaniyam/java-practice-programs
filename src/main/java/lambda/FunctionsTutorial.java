/**
 * 
 */
package lambda;


import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

/**
 * @author Sankar
 *
 */
public class FunctionsTutorial {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		UnaryOperator<String> unaryOperator = x -> x+"****";
		Predicate<String> predicate = x -> x.contains("q");
		Function<String,String> function = x -> x+"---";
		Supplier<String> supplier = () -> "+++";
		Consumer<String> consumer = System.out::println;
		
		Function<String,String> function2 = x -> { return x+"---";};
		Consumer<String> consumer2 = x -> System.out.println(x);
		Consumer<String> consumer3 = FunctionsTutorial::print;

		System.out.println("UnaryOperator := "+unaryOperator.apply("San"));
		System.out.println("Predicate := "+predicate.test("Sankar-q"));
		System.out.println("Function := "+function.apply("San"));
		System.out.println("Function 2 := "+function2.apply("San"));
		System.out.println("Supplier := "+supplier.get());
		System.out.println("Consumer := ");consumer.accept("San");
		System.out.println("Consumer 2 := ");consumer2.accept("San");
		System.out.println("Consumer 3 := ");consumer3.accept("San");
		
	}

	private static void print(String x) {
		System.out.println(x);
	}
}
