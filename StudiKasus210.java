import java.util.Scanner;

public class StudiKasus210 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nama, typeOfActivity;
        int numberOfDocuments, winnerRank, pkmFundingStatus;

        System.out.print("Student Name: ");
        nama = sc.nextLine().trim().toLowerCase();
        System.out.print("Type of Activity (BELMAWA/BAKORMA/MANDIRI/PKM/LAINNYA): ");
        typeOfActivity = sc.nextLine().trim().toLowerCase();
        System.out.print("Number of Documents: ");
        numberOfDocuments = sc.nextInt();
        System.out.print("Winner Rank: ");
        winnerRank = sc.nextInt();

        if (typeOfActivity.equals("belmawa") || typeOfActivity.equals("bakorma") || typeOfActivity.equals("mandiri")) {
            if (winnerRank == 1 || winnerRank == 2 || winnerRank == 3) {
                if (numberOfDocuments == 4) {
                    System.out.println("Status: Congratulations " + nama + ", You have received the award!");
                } else {
                    System.out.println("Status: Incomplete documents (missing " + (4 - numberOfDocuments) + "). Award cannot be given.");
                }
            }
            } else if (typeOfActivity.equals("pkm")) {
            System.out.print("PKM Funding Status (1 = funded, 0 = not funded): ");
            pkmFundingStatus = sc.nextInt();
            if (pkmFundingStatus == 1) {
                if (numberOfDocuments == 4) {
                    System.out.println("Status: Congratulations " + nama + ", You have received the award!");
                } else {
                    System.out.println("Status: Incomplete documents (missing " + (4 - numberOfDocuments) + "). Award cannot be given.");
                }
            } else {
                System.out.println("Status: PKM is not funded. Award cannot be given.");
            }
        } else {
            System.out.println("Status: Invalid activity type. Award cannot be given.");
        }


        sc.close();
    }
    
}
