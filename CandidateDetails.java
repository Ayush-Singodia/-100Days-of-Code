import java.util.Scanner;

public class CandidateDetails {

    // Function to take input for candidate's information
    public static Candidate takeCandidateInput() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter candidate details:");
        System.out.print("Name: ");
        String name = scanner.nextLine();
        
        System.out.print("Age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // Consume newline character
        
        System.out.print("Party: ");
        String party = scanner.nextLine();
        
        System.out.print("Constituency: ");
        String constituency = scanner.nextLine();
        
        // Create a Candidate object with the input information
        Candidate candidate = new Candidate(name, age, party, constituency);
        
        return candidate;
    }

    // Function to print candidate's details
    public static void printCandidateDetails(Candidate candidate) {
        System.out.println("\nCandidate Details:");
        System.out.println("Name: " + candidate.getName());
        System.out.println("Age: " + candidate.getAge());
        System.out.println("Party: " + candidate.getParty());
        System.out.println("Constituency: " + candidate.getConstituency());
    }

    public static void main(String[] args) {
        // Take input for a candidate
        Candidate candidate = takeCandidateInput();
        
        // Print the candidate's details
        printCandidateDetails(candidate);
    }
}

// Candidate class to hold candidate information
class Candidate {
    private String name;
    private int age;
    private String party;
    private String constituency;

    public Candidate(String name, int age, String party, String constituency) {
        this.name = name;
        this.age = age;
        this.party = party;
        this.constituency = constituency;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getParty() {
        return party;
    }

    public String getConstituency() {
        return constituency;
    }
}
