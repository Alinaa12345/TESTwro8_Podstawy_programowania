public class SecondProgram {
    public static void main(String[] args) {
        assert args.length == 2 :
                "Wymagana ilosc argmentow 2";
        String person1 = args[0];
        String person2 = args[1];
        System.out.println(person1.concat(" ").concat(person2));
        
    }
}
