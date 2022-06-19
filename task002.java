// На вход некоторому исполнителю подаётся два числа (a, b). 
// У исполнителя есть две команды
// - команда 1 (к1): увеличить в с раза, а умножается на c
// - команда 2 (к2): увеличить на d ( +2 ), к a прибавляется d
// написать программу, которая выдаёт набор команд, 
// позволяющий число a превратить в число b или сообщить, что это невозможно
// Пример 1: а = 1, b = 7, c = 2, d = 1
// ответ: к1, к1, к1, к1, к1, к1 или к1, к2, к1, к1, к1 или к1, к1, к2, к1. 
// Пример 2: а = 11, b = 7, c = 2, d = 1
// ответ: нет решения. 
// *Подумать над тем, как сделать минимальное количество команд


package seminars;

public class task002 {
    public static void main(String[] args) {
        String path = name(1, 7, 2, 1);
        System.out.println(path);
    }

    public static String name(int start, int end, int mult_number, int plus_number) {
        String path = "";
        if (start > end) {
            path = "Нет решения!";
        } else {
            int res = start;
            do {
                
                int n = (int)(Math.random());
                switch (n) {
                    case 0 :
                    res += mult_number;
                    path = String.format(path + "*%d", mult_number);
                }
            } while (res == end);
        }
        if (path == "")
            path = String.format("Числами %d и %d превратить число %d в %d невозможно!", mult_number, plus_number, start, end);
        return path;
    }
}
