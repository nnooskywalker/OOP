package Testing;
import java.util.ArrayList;
import java.util.Scanner;

public class Main2{
    public static void main(String[] args) {
        ArrayList<String> song = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);
        String inputSong, searchSong;
        char yayOrNay;
        int choose = 0;

        while(choose != 4){
            System.out.println("AC24DIA SONG");
            System.out.println("======================");
            System.out.println("1. Add a Music");
            System.out.println("2. Delete a Music");
            System.out.println("3. View All Music");
            System.out.println("4. Exit");
            System.out.print(">> ");
            choose = sc.nextInt();
            sc.nextLine();

            switch(choose){
                case 1:
                    System.out.println("Add a Music");
                    
                    do{
                        System.out.print("Enter Music Name [5 - 25 chars] : ");
                        inputSong = sc.nextLine();
                    }while(inputSong.length() < 5 || inputSong.length() > 25);

                    System.out.print("Do you really want to create this data (Y/N)? : ");
                    yayOrNay = sc.next().charAt(0);

                    if (yayOrNay == 'Y'){
                        song.add(inputSong);
                        System.out.println("Success to create");
                    }
                    else{
                        System.out.println("Failed to create");
                    }

                    System.out.println("Press enter to continue.....");
                    break;
                case 2:
                    System.out.println("Delete a Music");
                    if (song.size() == 0){
                        System.out.println("There is no music");
                    }
                    else{
                        System.out.print("Input Song : ");
                        searchSong = sc.nextLine();
    
                        if(song.contains(searchSong)){
                            song.remove(searchSong);
                            System.out.println("Success to Delete !");
                        }
                        else{
                            System.out.println("Failed To Delete");
                        }
                    }
                    System.out.println("Press enter to continue.....");

                    break;
                case 3:
                    if(song.size() == 0){
                        System.out.println("There is no music");
                    }
                    else{
                     for(int i = 0; i < song.size(); i++){
                        System.out.println(i + 1 + ". " + song.get(i));
                     }
                    }

                    System.out.println("Press enter to continue.....");
                    break;
                case 4:
                    System.out.println("Exiting....");
                    break;
                default:
                    System.out.println("Input Invalid");
                    break;
            }
        }
    }
}
