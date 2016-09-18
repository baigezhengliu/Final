package cn.zol.exam1;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class ExamTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("请输入任意字符(a-z,长度不得小于20):");
		String str = sc.nextLine();

		String s1 = str.substring(3, 6);
		String s2 = str.substring(6, 11);
		String s3 = str.substring(12, 19);

		StringBuilder sb = new StringBuilder();
		sb.append(s1).append(s2).append(s3);

		String s4 = sb.toString();
		System.out.println("截取后的字符串:" + s4);

		TreeMap<Character, Integer> tm = new TreeMap<Character, Integer>();
		char[] charArray = s4.toCharArray();
		for (char c : charArray) {
			char upperCase = Character.toUpperCase(c);
			Integer i = tm.get(upperCase);
			if (!tm.containsKey(upperCase)) {
				tm.put(upperCase, 1);
			} else {
				i += 1;
				tm.put(upperCase, i);
			}
		}

		StringBuilder sbb = new StringBuilder();
		Set<Character> keySet = tm.keySet();
		for (Character ch : keySet) {
			sbb.append(ch).append("(").append(tm.get(ch)).append(")");
		}

		String s5 = sbb.toString();
		System.out.println("最终结果:" + s5);
	}

}
