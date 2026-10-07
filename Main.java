import java.util.Scanner;

public class Main {
    public static void main(String[]args) {
        System.out.println("We will play a game of 20 questions, choose an animal and i will try to guess it.");
        Scanner input = new Scanner(System.in);

        System.out.println("Is it a mammal? (y/n)");
        String ans = input.nextLine();

        if (ans.equals("y")) {
            System.out.println("Can it be kept as a pet? (y/n)");
            ans = input.nextLine();
            if (ans.equals("y")){
                System.out.println("Is it loud? (y/n");
                ans = input.nextLine();
                if (ans.equals("y")){
                    System.out.println("My guess is that your animal is a dog!");
                }
                else {
                    System.out.println("does your animal have a long tail? (y/n)");
                    ans = input.nextLine();
                    if (ans.equals("y")) {
                        System.out.println("My guesss is that you are thinking of a cat!");
                    }
                    else {
                        System.out.println("My guess is that the animal you are thinking of is a bunny!");
                    }
                    
                    
                }
                

            }
            else {
                System.out.println("Is your animal small? (y/n)");
                ans = input.nextLine();
                if (ans.equals("y")) {
                    System.out.println("Is your animal carnivorous? (y/n)");
                    ans = input.nextLine();
                    if (ans.equals("y")) {
                        System.out.println("My guess is that you are thinking of a ferret!");
                    }
                    else {
                        System.out.println("My guess is that you are thinking of a squirrel!");
                    }
                }
                else {
                    System.out.println("Is your animal orange? (y/n)");
                    ans = input.nextLine();
                    if (ans.equals("y")) {
                    System.out.println("My guess is that you are thinking of a tiger!");
                    }
                    else {
                        System.out.println("Is your animal yellow? (y/n)");
                        ans = input.nextLine();
                        if (ans.equals("y")) {
                            System.out.println("My guess is that you are thinking of a lion!");
                        }
                        else {
                            System.out.println("My guess is that your thinking of a zebra!");
                        }
                    }

                }
            }
        }
        else {
            System.out.println("is your animal extinct? (y/n)");
            ans = input.nextLine();
            if (ans.equals("y")) {
                System.out.println("Is your animal a reptile? (y/n)");
                ans = input.nextLine();
                if (ans.equals("y")) {
                    System.out.println("My guess is that your thinking of a dinasour!");
                }
                else {
                    System.out.println("Are you thinking of a winged animal? (y/n)");
                    ans = input.nextLine();
                    if (ans.equals("y")) {
                        System.out.println("My guess is that you are thinking of a bird");
                    }
                    else {
                        System.out.println("My guess is that you are thinking of a wooly mammoth!");
                    }
                }
            }
            else {
                System.out.println("Can your animal breathe underwater? (y/n)");
                ans = input.nextLine();
                if (ans.equals("y")) {
                    System.out.println("Is your animal small? (y/n)");
                    ans = input.nextLine();
                    if (ans.equals("y")) {
                        System.out.println("My guess is you are thinking of a fish!");
                    }
                    else {
                        System.out.println("Is your animal the biggest in the sea? (y/n)");
                        ans = input.nextLine();
                        if (ans.equals("y")) {
                            System.out.println("My guess is that you are thinking of a whale!");
                        }
                        else {
                            System.out.println("does your animal have 2 rows of sharp teeth? (y/n)");
                            ans = input.nextLine();
                            if (ans.equals("y")) {
                                System.out.println("My guess is that you are thinking of a shark!");
                            }
                            else {
                                System.out.println("My guess is that you are thinking of a dolphin!");
                            }
                        }
                    }
                }
                else {
                    System.out.println("Does your animal have four legs? (y/n)");
                    ans = input.nextLine();
                    if (ans.equals("y")) {
                        System.out.println("is your animal slow? (y/n)");
                        ans = input.nextLine();
                        if (ans.equals("y")) {
                            System.out.println("My guess is that your animal is a turtle!");
                        }
                        else {
                            System.out.println("Does your animal jump? (y/n)");
                            ans = input.nextLine();
                            if (ans.equals("y")) {
                                System.out.println("My guess is that your animal is a frog!");
                            }
                            else {
                                System.out.println("is your animal big? (y/n)");
                                ans = input.nextLine();
                                if (ans.equals("y")) {
                                    System.out.println("My guess is that your animal is a croccodile/alligator!");
                                }
                                else {
                                    System.out.println("My guess is that your animal is a lizard!");
                                }
                            }
                        }
                    }
                    else {
                        System.out.println("My guess is that your animal is an ant!");
                    }
                }
            }

        }
    }
}
