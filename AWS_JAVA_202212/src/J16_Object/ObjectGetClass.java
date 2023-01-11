package J16_Object;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ObjectGetClass {
	public static void main(String[] args) {
		Student student = new Student("김재영", 29);
		
		System.out.println(student.getClass());
		System.out.println(Student.class);
		System.out.println(student.getClass().getName());
		
		Class studentClass = student.getClass();
		
		studentClass.getName(); // = student.getClass.getName();
		
		String classname = studentClass.getName();
		System.out.println("클래스 이름 : " + classname);
		
		String simpleName = studentClass.getSimpleName();
		System.out.println("클래스 이름만 : " + simpleName);
		
		Field[] fields =  studentClass.getDeclaredFields();
		for(Field field : fields) {
			System.out.println(field);
		}
		
		Method[] methods = studentClass.getDeclaredMethods();
		for(Method method : methods) {
			System.out.println(method);
		}
	}
}
