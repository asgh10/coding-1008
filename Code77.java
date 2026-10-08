// 자바 레벨 3 테스트 시험

public class Code77 {
    public static void main(String[] args){

        for(int num = 1; num <= 9; num++){
            for(int dan = 2; dan <= 9; dan++){
                System.out.print(dan + "*" + num + "=" + dan*num + "\t");
            }
            System.out.println();
        }
    }
}