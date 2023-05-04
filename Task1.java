package JavaWork.JavaHomeWork.JavaHomeWork2;
//Посчитайте сколько драгоценных камней в куче обычных камней
public class Task1 {
    public static void main(String[] args) {
        String str = "aaaAbbbB";
        int counta = 0, countB = 0;
        for (char element : str.toCharArray()){
            if (element == 'a'){
                counta++;
            }
            if (element == 'B'){
                countB++;
            }
        }
        System.out.println("a" + counta);
        System.out.println("B" + countB); 
    }      
}


