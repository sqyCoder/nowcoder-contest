import java.util.*;

public class JZ31 {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     *
     * @param pushV int整型一维数组 
     * @param popV int整型一维数组 
     * @return bool布尔型
     */
    public boolean IsPopOrder (int[] pushV, int[] popV) {
        // 如果长度不相等（题目已保证相等，但防御处理）
        if (pushV == null || popV == null || pushV.length != popV.length) {
            return false;
        }
        // 空数组情况
        if (pushV.length == 0) {
            return true;
        }

        Stack<Integer> stack = new Stack<>();
        int j = 0; // popV 的索引

        for (int i = 0; i < pushV.length; i++) {
            stack.push(pushV[i]); // 压入一个元素
            // 循环检查栈顶是否匹配当前待弹出的元素
            while (!stack.isEmpty() && j < popV.length && stack.peek() == popV[j]) {
                stack.pop();
                j++;
            }
        }

        // 全部弹出则栈为空，合法
        return stack.isEmpty();
    }
}