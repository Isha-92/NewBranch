package multiple_inheritance;

public interface B 
{
	abstract void m1();
	default void m2() {
		System.out.println("default m2 of Interface B");
	}
	static void m3() {
		System.out.println("static m3 of Interface B");

	}
}
