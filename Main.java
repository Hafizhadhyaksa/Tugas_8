package Exception;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Nama    :Muhammad Hafizh Adhyaksa");
        System.out.println("NIM     :215150707111019");
        System.out.println();

        System.out.println("Selamat datang di game Defend FILKOM !");
        System.out.print("Silahkan masukkan nama player : ");
        String nama = in.nextLine();


        int pilih = 0;
        boolean b = true;
        do while (b) {
            System.out.println("Silahkan pilih karakter yang anda inginkan : ");
            System.out.println("1. Magician\n2. Healer\n3. Warrior");
            try {
                pilih = in.nextInt();
                System.out.println("Selamat datang, " + nama);
                b = false;

            } catch (InputMismatchException e) {
                System.out.println("Masukkan pilihan yang sesuai");
                in.nextLine();
                pilih = in.nextInt();
            }


        } while (b);


        Titan titan = new Titan();
        titan.setHP(200);
        titan.setAttack(45);
        titan.setDefense(0);

        switch (pilih) {
            case 1 : {
                Magician magician = new Magician();
                magician.setHP(100);
                magician.setAttack(60);
                magician.setDefense(10);
                System.out.println("---------- STATUS ----------");
                System.out.println("Role\t: Magician");
                magician.info();


                for (int i = 0; i < 1000; i++) {

                    if (magician.attack() == true){
                        titan.receiveDamage(magician.getAttack());
                    }else {

                    }

                    if (titan.attack() == true){
                        magician.receiveDamage(titan.getAttack());
                    }else {

                    }


                    System.out.println("========== Turn " + (i+1) + " ==========");
                    System.out.println("Enemy's HP : " + titan.getHP());
                    System.out.println(nama+"'s HP : " + magician.getHP());

                    if (titan.getHP() == 0){
                        System.out.println(nama+" menang");
                    }else if (magician.getHP() == 0){
                        System.out.println(nama+" kalah");
                    }

                    if (magician.getHP() == 0 || titan.getHP() == 0){
                        break;
                    }
                }

                System.out.println();
                System.out.println("========== PLAYER ==========");
                System.out.println("---------- STATUS ----------");
                System.out.println("Role\t: Magician" );
                magician.info();

                System.out.println();
                System.out.println("========== MUSUH ==========");
                System.out.println("---------- STATUS ----------");
                System.out.println("Role\t: Titan" );
                titan.info();

                break;
            }
            case 2 : {
                Healer healer = new Healer();
                healer.setHP(70);
                healer.setAttack(10);
                healer.setDefense(10);
                System.out.println("---------- STATUS ----------");
                System.out.println("Role\t: Healer");
                healer.info();

                for (int i = 1; i < 1000; i++) {
                    int turn = i;
                    if (healer.attack() == true){
                        titan.receiveDamage(healer.getAttack());
                    }else {

                    }

                    if (titan.attack() == true){
                        healer.receiveDamage(titan.getAttack());
                    }else {

                    }

                    if (turn % 2 == 0){
                        healer.heal();
                        System.out.println("========== Turn " + i + " ==========");
                        System.out.println("Meggunakan skill Heal.");
                        System.out.println("Enemy's HP : " + titan.getHP());
                        System.out.println(nama+"'s HP : " + healer.getHP());

                    }else {
                        System.out.println("========== Turn " + i + " ==========");
                        System.out.println("Enemy's HP : " + titan.getHP());
                        System.out.println(nama+"'s HP : " + healer.getHP());
                    }


                    if (titan.getHP() == 0){
                        System.out.println(nama+" menang");
                    }else if (healer.getHP() == 0){
                        System.out.println(nama+" kalah");
                    }

                    if (healer.getHP() == 0 || titan.getHP() == 0){
                        break;
                    }

                }

                System.out.println();
                System.out.println("========== PLAYER ==========");
                System.out.println("---------- STATUS ----------");
                System.out.println("Role\t: Healer" );
                healer.info();

                System.out.println();
                System.out.println("========== MUSUH ==========");
                System.out.println("---------- STATUS ----------");
                System.out.println("Role\t: Titan" );
                titan.info();

                break;
            }
            case 3 :{
                Warrior warrior = new Warrior();
                warrior.setHP(80);
                warrior.setAttack(25);
                warrior.setDefense(30);
                System.out.println("---------- STATUS ----------");
                System.out.println("Role\t: Magician");
                warrior.info();

                for (int i = 0; i < 1000; i++) {

                    if (warrior.attack() == true){
                        titan.receiveDamage(warrior.getAttack());
                    }else {

                    }

                    if (titan.attack() == true){
                        warrior.receiveDamage(titan.getAttack());
                    }else {

                    }


                    System.out.println("========== Turn " + (i+1) + " ==========");
                    System.out.println("Enemy's HP : " + titan.getHP());
                    System.out.println(nama+"'s HP : " + warrior.getHP());

                    if (titan.getHP() == 0){
                        System.out.println(nama+" menang");
                    }else if (warrior.getHP() == 0){
                        System.out.println(nama+" kalah");
                    }

                    if (warrior.getHP() == 0 || titan.getHP() == 0){
                        break;
                    }

                }

                System.out.println();
                System.out.println("========== PLAYER ==========");
                System.out.println("---------- STATUS ----------");
                System.out.println("Role\t: Warrior" );
                warrior.info();

                System.out.println();
                System.out.println("========== MUSUH ==========");
                System.out.println("---------- STATUS ----------");
                System.out.println("Role\t: Titan" );
                titan.info();
                break;
            }

        }
    }
}
