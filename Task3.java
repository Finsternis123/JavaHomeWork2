package JavaWork.JavaHomeWork.JavaHomeWork2;
public class Task3 {
    public static void main(String[] args) {
        String str1 = "Арахис 100гр, мороженое 200гр. Возьмите арахис и измелчите его. Посыпьте измельчённый арахис на мороженое.".replace("Арахис", "Колбаса");
        String newstr1 =  str1.replace("арахис", "колбаса");
        System.out.println(newstr1);
        String str2 = "Клубника 100гр, сгущенка 3кг. Смешать, есть) Радоваться жизни.".replace("Клубника", "Вишня");
        String newstr2 =  str2.replace("сгущенка", "молоко");
        System.out.println(newstr2);
    }
}
