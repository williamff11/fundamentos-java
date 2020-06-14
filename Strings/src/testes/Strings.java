package testes;

public class Strings {
    public static void main(String[] args) {
        String[] strings = new String[4];
        strings[0] = new String();
        strings[1] = new String("Bloco Java no Infnet");
        char[] caracteres = {'I', 'n', 'f', 'n', 'e', 't'};
        strings[2] = new String(caracteres);
        strings[3] = new String(caracteres, 3, 3);
        for (int i = 0; i < strings.length; i++) {
            System.out.println(strings[i]);
        }

        String s1 = new String("OI");
        String s2 = new String("OI");

        System.out.println(s1.equals(s2));

        String string = new String("William Felicio Freire");
        int space = string.indexOf(' ');
        String name = string.substring(0, space);
        System.out.println(name);

        int space2 = string.lastIndexOf(' ');
        String name2 = string.substring(space+1, space2);
        System.out.println(name2);

        int space3 = string.lastIndexOf(' ');
        String name3 = string.substring(space3+1);
        System.out.println(name3);
//
//        System.out.println("aqui");
//        System.out.println(string.indexOf(' '));
//        System.out.println(string.lastIndexOf('n'));

        String string1 = new String("Infnet é foda");
        System.out.println(string1.substring(2, 4));

        String string01 = "Bloco ";
        string01 += "de Java";
        string01 += " no Infnet!";
        System.out.println(string01);

        String string001 = "Bloco de Java";
        String string002 = "no Infnet!";
        System.out.println(string001 + " " + string002);

//        --------
        StringBuilder sb = new StringBuilder();
        sb.append("Bloco ");
        sb.append("de ");
        sb.append("Java ");
        sb.append("no ");
        char[] caracteres01 = {'I', 'n', 'f', 'n', 'e', 't'};
        sb.append(caracteres01);
        System.out.println(sb.toString());
    }
}
