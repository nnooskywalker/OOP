package Testing;

import java.util.ArrayList;
import java.util.Scanner;

class music{
    String musicName;
    String musicAuthor;
    int musicLength;

    music(String name, String author, int length){
        this.musicName = name;
        this.musicLength = length;
        this.musicAuthor = author;
    }

}




public class Main{
    public static void main(String[] args) {
        ArrayList<music> song = new ArrayList<music>();
        Scanner sc = new Scanner(System.in);
        int choose = 0, num = 0;
        int musicLength = 0, musicOrder = 0;
        String musicName, musicAuthor, delMusic;
        char confirm;

        while(choose != 5){
            System.out.println("AC24DIA MUSIC");
            System.out.println("===================");
            System.out.println("1. Add a Music");
            System.out.println("2. Delete a Music");
            System.out.println("3. Update a music");
            System.out.println("4. View All");
            System.out.println("5. Exit");
            System.out.print(">> ");
            num = sc.nextInt();
            sc.nextLine();

            switch(num){
                case 1:
                    System.out.println("Add a music");
                    do{
                        System.out.print("Enter music name [5 - 25 chars] : ");
                        musicName = sc.nextLine();
                    }while(musicName.length() < 5 || musicName.length() > 25);

                    do{
                        System.out.print("Enter music author [5 - 25 chars] : ");
                        musicAuthor = sc.nextLine();
                    }while(musicAuthor.length() < 5 || musicAuthor.length() > 25);


                    do{
                        System.out.print("Enter music length [1 - 59 mins] : ");
                        musicLength = sc.nextInt();
                    }while(musicLength < 1 || musicLength > 59);

                    System.out.print("Do you really want to create this data (Y/N)? : ");
                    confirm = sc.next().charAt(0);

                    if (confirm == 'Y'){
                        music newMusic = new music(musicName, musicAuthor, musicLength);
                        song.add(newMusic);

                        System.out.println("Success to create");
                    }
                    else{
                        System.out.println("Failed to create");
                    }
                    break;
                case 2:
                    System.out.println("Delete a music");
                    System.out.println("===============================");

                    if (song.size() == 0){
                        System.out.println("There is no music");
                    }
                    else{
                        for(int i = 0; i < song.size(); i++){
                            music m = song.get(i);
                            System.out.println(i + ". " + m.musicName + "(by " + m.musicAuthor + ")" + " - " + m.musicLength + "mins");
                        }

                        

                        System.out.print("Enter music name : ");
                        sc.nextLine();
                        delMusic = sc.nextLine();

                    }




                    break;
                case 3:
                    break;
                case 4:
                   // song.sort(musicOrder);
                   System.out.println("View All Music");
                   System.out.println("============================");
                   int count = 1;
                   for(music m : song){
                    System.out.println(count + ". " + m.musicName + "(by " + m.musicAuthor + ")" + " - " + m.musicLength + "mins");
                   }
                    
                    break;
                case 5:
                    System.out.println("Exiting....");
                    break;
                default:
                    System.out.println("Input Not Valid");
                    break;
            }
        }







    }
}
