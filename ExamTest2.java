package cn.zol.exam2;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class ExamTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		HashMap<String, TreeSet<Student>> hm = new HashMap<String, TreeSet<Student>>();

		TreeSet<Student> tm1 = new TreeSet<Student>(new Comparator<Student>() {
			@Override
			public int compare(Student s1, Student s2) {
				// TODO Auto-generated method stub
				int num = s1.getAge() - s2.getAge();
				int num2 = num == 0 ? s1.getName().compareTo(s2.getName())
						: num;
				return num2;
			}
		});
		TreeSet<Student> tm2 = new TreeSet<Student>(new Comparator<Student>() {
			@Override
			public int compare(Student s1, Student s2) {
				// TODO Auto-generated method stub
				int num = s1.getAge() - s2.getAge();
				int num2 = num == 0 ? s1.getName().compareTo(s2.getName())
						: num;
				return num2;
			}
		});
		System.out.println("请输入小组名称:");
		String group = sc.nextLine();
		for (int y = 0; y < 3; y++) {
			Student s = new Student();
			System.out.println("请输入学生姓名:");
			String name = sc.nextLine();
			s.setName(name);
			System.out.println("请输入学生年龄:");
			String age = sc.nextLine();
			s.setAge(Integer.parseInt(age));
			tm1.add(s);
		}
		hm.put(group, tm1);

		System.out.println("请输入小组名称:");
		String group2 = sc.nextLine();
		for (int y = 0; y < 3; y++) {
			Student s = new Student();
			System.out.println("请输入学生姓名:");
			String name = sc.nextLine();
			s.setName(name);
			System.out.println("请输入学生年龄:");
			String age = sc.nextLine();
			s.setAge(Integer.parseInt(age));
			tm2.add(s);
		}
		hm.put(group2, tm2);

		Set<String> groupName = hm.keySet();

		// 第一种方式：通过迭代器方式遍历集合元素
		for (String s : groupName) {
			System.out.println("组名:" + s);
			TreeSet<Student> ts = hm.get(s);
			Iterator<Student> iter = ts.iterator();
			while (iter.hasNext()) {
				System.out.println("\t" + iter.next());
			}
		}

		System.out.println("----------------------");

		// 第二种方式：通过增强for循环的方式遍历集合元素
		for (String s : groupName) {
			System.out.println("组名:" + s);
			TreeSet<Student> ts = hm.get(s);
			for (Student ss : ts) {
				System.out.println("\t" + ss.getName() + "---" + ss.getAge());
			}
		}

	}

}
