package study;

public class Task extends Calculator{
	// ① TaskクラスにCalculatorクラスを継承させなさい。

    /**
     * タスクの実行
     */
    public void doTask(int a) {
        // ② Calculator.javaのすべてのオーバーロードメソッド「plus」に適当な引数を与え、下記画像のよう出力されるようコーディングしなさい。
        // 尚、「どのクラスから呼び出しているか」を明確にするため、plus()には呼び出し元のキーワードを付与すること。
    	System.out.println("plusメソッドの引数が一つの場合:"+ plus(a));
    }
    
    public void doTask(int a,int b) {
    	System.out.println("plusメソッドの引数が二つの場合:"+ plus(a, b));
    }
    
    public void doTask(int a,int b,int c) {
    	System.out.println("plusメソッドの引数が三つの場合:"+ plus(a, b, c));
    }
}
