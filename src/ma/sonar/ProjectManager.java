package ma.sonar;

public class ProjectManager {
    public static void main(String[] args) {
        System.out.println("Welcome to Project Manager!");
// Exemple de code dupliqu


        String projectName = "Sample Project";
        System.out.println("Project Name: " + projectName);
        String duplicateProjectName = "Sample Project";
        System.out.println("Duplicate Project Name: " + duplicateProjectName);
// Exemple de violation de règle de codage (noms de variables non significatifs)
        int a = 10;
        int b = 20;
        int sum = a + b;
// Exemple de complexité cyclomatique élevée
        int complexCalculationResult = performComplexCalculation(5);
// Exemple de code manquant de commentaires
        String projectDescription = getProjectDescription();
        System.out.println("Project Description: " + projectDescription);
    }
    // Méthode avec une complexité cyclomatique élevée
    private static int performComplexCalculation(int input) {
        int result = 0;
        for (int i = 1; i <= input; i++) {
            if (i % 2 == 0) {
                result += i;
            } else {
                result -= i;
            }
        }
        return result;
    }
    // Méthode sans commentaire
    private static String getProjectDescription() {
// Imaginez que cette méthode effectue une requête à la base de données
// pour récupérer la description du projet.
        return "A sample project for demonstration purposes.";
    }

}
