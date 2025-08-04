public class SistemaMedida{
    public static void main(String[] args) {
        String sulga = "M";

        switch (sulga) {
            case "P":{
                System.out.println("PEQUENO");
                break;
            }
            case "M":{
                System.out.println("MEDIO");
                break;
            }
            case "G":{
                System.out.println("GRANDE");
            }
        
            default:
                System.out.println("INDEFINIDO");;
        }
    }
}