// 자바 레벨 3 테스트 시험

import java.util.Scanner;

public class Code76 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) { 
            System.out.println("==== 계산기 ====");
            System.out.println("1. 더하기");
            System.out.println("2. 빼기");
            System.out.println("3. 곱하기");
            System.out.println("4. 나누기");
            System.out.println("0. 종료");
            System.out.print("메뉴 선택: ");

            if(sc.hasNextInt()){
                int menu = sc.nextInt();

                if(menu == 0){
                    System.out.println("계산기를 종료합니다");
                    break;
                }else{
                
                    switch(menu){
                        case 1:
                            System.out.print("첫 번째 숫자: ");
                            int one_num = sc.nextInt();

                            System.out.print("두 번째 숫자: ");
                            int two_num = sc.nextInt();

                            System.out.println("결과: " + (one_num + two_num));
                            break;
                    
                        case 2:
                            System.out.print("첫 번째 숫자: ");
                            one_num = sc.nextInt();

                            System.out.print("두 번째 숫자: ");
                            two_num = sc.nextInt();

                            System.out.println("결과: " + (one_num - two_num));
                            break;

                        case 3:
                            System.out.print("첫 번째 숫자: ");
                            one_num = sc.nextInt();

                            System.out.print("두 번째 숫자: ");
                            two_num = sc.nextInt();

                            System.out.println("결과: " + (one_num * two_num));
                            break;

                        case 4:
                            System.out.print("첫 번째 숫자: ");
                            one_num = sc.nextInt();

                            System.out.print("두 번째 숫자: ");
                            two_num = sc.nextInt();

                            if(one_num == 0 || two_num == 0){
                                System.out.println("0으로는 나눌 수 없습니다");
                            }else{
                                System.out.println("결과: " + ((double)one_num / (double)two_num));   
                                break;
                            }
                    
                        default:    
                            System.out.println("메뉴의 있는 숫자들 중에서 골라주세요 (0~4)");
                    }

                }
            }else{
                System.out.println("숫자를 입력해주세요");
                sc.next();
            }
        }
        sc.close();
    }
}
