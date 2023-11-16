package POJO;

//house and pass data between functional classes
//JavaBean is POJO
// aka DTO (Data Transfer Object)
// aka Entity //it mirrors db entities
public class Main {
    public static void main(String[] args){

        for (int i = 1; i <=5; i++){
            Student s = new Student("S9000" + i,
                    switch (i){
                        case 1 -> "Mary";
                        case 2 -> "John";
                        case 3 -> "Stasy";
                        default -> "Anony";
                    },
                    "10/08/1990",
                    "Java"
                    );
            System.out.println(s);

            s.getClassList();
        }

        for (int i = 1; i <=5; i++){
            RStudent s = new RStudent("S9000" + i,
                    switch (i){
                        case 1 -> "Mary";
                        case 2 -> "John";
                        case 3 -> "Stasy";
                        default -> "Anony";
                    },
                    "10/08/1990",
                    "Java"
            );
            System.out.println(s);

            s.classList();
            s.id();
        }
    }
}
