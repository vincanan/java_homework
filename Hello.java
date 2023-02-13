//2-8. 아래는 변수 x, y, z의 값을 서로 바꾸는 예제이다. 결과와 같이 출력되도록 코드를 넣으세요.
class Report_1{
    public static void main(String[] args){
        //2-4. 다음 중 변수를 잘못 초기화 한 것은?
        //byte b = 256; -128~127 범위 초과
        char c = '';
        //char answer = 'no'; 단 하나의 문자만 저장가능
        //float f = 3.14 f가 없음
        double d = 1.4e3f;

//2-7. 다음 문장들의 출력 결과를 적으세요. 오류가 있는 문장의 경우, '오류' 라고 적으세요.
        System.out.println("1" + "2"); // 12 정수가 아닌 문자의 배열
        System.out.println(true+"");  // ture 문자열과 +하게 되면 문자열로 나옴
        System.out.println('A' + 'B'); //131 char+char 이 int + int 과정으로 바뀌며 A=65 B+66
        System.out.println('1' + 2); //51
        System.out.println('1' + '2'); //99
        System.out.println('J' +"ava"); // java
        //System.out.println(true + null); 오류



//2-8. 아래는 변수 x, y, z의 값을 서로 바꾸는 예제이다. 결과와 같이 출력되도록 코드를 넣으세요.
                int x = 1;
                int y = 2;
                int z = 3;

                int tmp, cal;
                tmp = x;
                x = y;
                cal = y;
                y = z;
                z = tmp;

                System.out.println("x="+x);
                System.out.println("y="+y);
                System.out.println("z="+z);
            }
        }
//예상 결과 : x=2, y=3, z=1