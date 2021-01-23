package stingManupulations;

public class StingMutability {
	public static void main(String args[]) {

		StringBuilder sb = new StringBuilder();
		long currentTime = System.currentTimeMillis();
		System.out.println("before running string builder" + currentTime);
		for (int i = 0; i < 10000; i++) {
			sb.append("hello");
		}
		System.out.println("timeTaken for builder to execute"
				+ (System.currentTimeMillis() - currentTime));

		StringBuffer buff = new StringBuffer();
		currentTime = System.currentTimeMillis();
		System.out.println("before running string buffer" + currentTime);
		for (int i = 0; i < 10000; i++) {
			buff.append("hello");
		}
		System.out.println("time taken for buff to execute"
				+ (System.currentTimeMillis() - currentTime));

		// time complexity
		StringBuilder builder = new StringBuilder("builderNew");
		// 16
		System.out.println("builder.capacity();" + builder.capacity());
		builder.append("sljkdrkh luivhuigh reuidsgjhdf");
		// more(c*2)+2 34
		System.out.println("after increasing capacity" + builder.capacity());

	}

}
