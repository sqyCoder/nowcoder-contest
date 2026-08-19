import java.util.Scanner;

import java.util.Scanner;

// 定义二叉树节点类，每一个TreeNode代表树上的一个节点
class TreeNode{
    char val;         // 节点存储的字符数据，比如a、b、c
    TreeNode left;    // 指向左孩子节点的引用，如果没有左孩子就是null
    TreeNode right;   // 指向右孩子节点的引用，如果没有右孩子就是null
    // 构造方法：创建节点的时候传入字符，给成员变量赋值，左右孩子默认赋值为null
    TreeNode(char c){
        val = c;
        left = null;
        right = null;
    }
}

public class TSINGK110{
    //全局静态书签，所有递归共用同一个index
    // static静态变量：属于BuildTree这个类，整个程序只有这一份index，所有buildTreeHelper递归函数全部读写这同一个index
    // 作用：记录我们现在读到字符串的第几个位置
    public static int index;

    //对外入口方法，main方法调用这个方法开始建树，每一组新字符串进来，必须把书签重置回0
    public static TreeNode buildTree(String line){
        index = 0;          // 非常关键！处理一组新的输入字符串，书签强制拨回到下标0的位置
        return buildTreeHelper(line); // 调用真正干活的递归辅助函数，返回建好的树的根节点
    }

    //递归辅助方法：根据先序字符串，递归构建一棵子树，返回这棵子树的根节点
    public static TreeNode buildTreeHelper(String line){
        //进来第一件事：读取当前index指向位置的字符，读完立刻把书签往后移动一格
        // 无论读到普通字符还是#空标记，这个字符已经被消费掉，index必须+1，不能等到创建节点之后再++
        char ch = line.charAt(index);
        index++;

        // 如果读到字符是#，代表此处是空树，没有节点，直接返回null
        // 注意：走到这里的时候index已经完成+1，就算是空节点，书签已经向后走了，不会卡住不动
        if(ch == '#'){
            return null;
        }

        // 走到这里说明读到普通字符，不是空节点，新建一个树节点
        TreeNode root = new TreeNode(ch);

        //先序遍历规则：根 →左子树 →右子树。根节点已经建好，接下来构建左子树
        //递归调用buildTreeHelper，去构建当前root的左子树，返回的节点赋值给root.left
        //递归内部会自动修改全局的index，左子树全部构建完成之后，index自动停在右子树开始的位置
        root.left = buildTreeHelper(line);

        //左子树全部处理完毕，index已经自动前进到对应位置，现在构建右子树
        root.right = buildTreeHelper(line);

        //当前这颗子树全部构建完毕，把当前子树根节点返回给上一层调用
        return root;
    }

    //中序遍历函数：左子树 →打印当前节点 →右子树。输出遍历结果，每个字符后面带空格
    public static void inOrder(TreeNode root){
        //递归终止条件，如果当前节点为null，没有东西可以遍历，直接return，结束这一层递归
        if(root == null){
            return;
        }
        inOrder(root.left);         //第一步递归遍历左子树
        System.out.print(root.val + " "); //第二步打印当前节点的值，后面拼接一个空格
        inOrder(root.right);        //第三步递归遍历右子树
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //创建Scanner对象，读取控制台输入
        // while(sc.hasNext()：处理多组测试用例，只要还有输入内容，循环就继续执行
        while(sc.hasNext()){
            String s = sc.nextLine();        //读取一整行输入字符串，例如abc##de#g##f###
            TreeNode root = buildTree(s);    //调用buildTree入口方法，根据字符串构建完整二叉树，拿到树根
            inOrder(root);                   //对建好的二叉树执行中序遍历，打印结果
            System.out.println();            //一组输出完成之后，换行，准备下一组数据
        }
        sc.close(); //关闭扫描器
    }
}