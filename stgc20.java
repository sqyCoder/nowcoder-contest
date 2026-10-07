import java.util.*;

public class stgc20 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            // 题目保证两行字符串非空，用 hasNextLine 循环处理可能的多组输入
            while (sc.hasNextLine()) {
                String expected = sc.nextLine(); // 本该输入的
                String actual = sc.nextLine();   // 实际输入的

                // 1. 统一转大写
                expected = expected.toUpperCase();
                actual = actual.toUpperCase();

                // 2. 把实际出现的字符放进 Set
                Set<Character> actualSet = new HashSet<>();
                for (int i = 0; i < actual.length(); i++) {
                    actualSet.add(actual.charAt(i));
                }

                // 3. 按顺序扫描 expected，找出坏键
                Set<Character> brokenSet = new HashSet<>();
                for (int i = 0; i < expected.length(); i++) {
                    char c = expected.charAt(i);
                    // 没在实际输出中出现过，且还没被打印过
                    if (!actualSet.contains(c) && !brokenSet.contains(c)) {
                        System.out.print(c); // 直接输出字符，不换行
                        brokenSet.add(c);
                    }
                }
            }
            sc.close();
        }
    }

