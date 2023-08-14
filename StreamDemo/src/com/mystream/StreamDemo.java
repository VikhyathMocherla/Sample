package com.mystream;
import java.util.Arrays;
import java.util.List;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.Random;
public class StreamDemo {

	public static void main(String[] args) 
	{
		/*Stream.Builder<String> builder=Stream.builder();
		builder.add("BaudeRate");
		builder.add("Ohm");
		builder.add("Kilowatt");
		builder.add("Bits");
		builder.add("Analog");
		builder.add("Digital");
		
		Stream<String> stream=builder.build();
		stream.forEach(System.out::println);
		*/
		
		/*Stream<Integer> stream=Stream.iterate(new int[] {0,1}, f->new int[] {f[1],f[0]+f[1]}).limit(10).map(n->n[0]);
		stream.forEach(System.out::println);
		 */
		
	}

}
