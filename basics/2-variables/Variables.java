public class Variables {
    public static void main(String[] args) {
        System.out.printf("byte: %d %d%n", Byte.MIN_VALUE, Byte.MAX_VALUE);
        System.out.printf("short: %d %d%n", Short.MIN_VALUE, Short.MAX_VALUE);
        System.out.printf("int: %d %d%n", Integer.MIN_VALUE, Integer.MAX_VALUE);
        System.out.printf("long: %d %d%n", Long.MIN_VALUE, Long.MAX_VALUE);
        System.out.printf("float: %s %s%n", Float.MIN_VALUE, Float.MAX_VALUE);
        System.out.printf("double: %s %s%n", Double.MIN_VALUE, Double.MAX_VALUE);
        System.out.printf("char: %d %d%n",(int) Character.MIN_VALUE, (int) Character.MAX_VALUE);
        System.out.printf("boolean: %b %b%n", Boolean.FALSE, Boolean.TRUE);
        
        // Overflow : ajouter 1 à Integer.MAX_VALUE dépasse la capacité d'un int 32 bits et boucle vers la valeur minimale
        System.out.printf("overflow: %d%n", Integer.MAX_VALUE + 1);

        // Précision : en binaire, 0.1 et 0.2 ne tombent pas juste, ce qui crée une légère imprécision
        System.out.printf("precision: %s%n", 0.1 + 0.2);
    
        // truncation : convertir un float en int tronque la partie décimale
        System.out.printf("truncation: %d%n", (int) 3.99);

        // Promotion : l'addition d'un int et d'un long promeut le int en long, évitant le débordement
        int maxInt = Integer.MAX_VALUE;
        System.out.printf("promotion: %d%n", maxInt + 1L);
    
    }
}
