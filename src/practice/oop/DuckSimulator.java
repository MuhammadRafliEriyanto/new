package practice.oop;


import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USER
 */
public class DuckSimulator {
    
    public static void main(String[] args) {
        int pilih;
        Scanner bebas = new Scanner (System.in);
        
        System.out.println("Pilih Duck");
        System.out.println(" 1. MallarDuck");
        System.out.println(" 2. ModelDuck");
        System.out.println(" 3. RubberDuck");
        System.out.println(" 4. DecoyDuck");
        System.out.println(" 5. RedHeadDuck");
        System.out.println("Memilih Duck");
        pilih = bebas.nextInt();
        switch (pilih){
            case 1 -> {
                Duck bocil = new MallardDuck();
                bocil.performFly();
                bocil.performQuack();
                bocil.setFlyBehavior(new FlyWithWings());
                bocil.setQuackBehavior(new Quack());
                bocil.display();
                break;
                }
            case 2 -> {
                Duck dewasa = new ModelDuck();
                dewasa.performFly();
                dewasa.performQuack();
                dewasa.setFlyBehavior (new FlyNoWay());
                dewasa.setQuackBehavior(new Quack());
                dewasa.display();
                break;
                }
             case 3 -> {
                 Duck baru = new RubberDuck();
                 baru.performFly();
                 baru.performQuack();
                 baru.setFlyBehavior (new FlyNoWay());
                 baru.setQuackBehavior(new Quack());
                 baru.display();
                 break;
                }
             case 4 -> {
                 Duck kelas = new DecoyDuck();
                 kelas.performFly();
                 kelas.performQuack();
                 kelas.setFlyBehavior(new FlyNoWay());
                 kelas.setQuackBehavior(new MuteQuack());
                 kelas.display();
                 break;
                }
             case 5 -> {
                 Duck raf = new RedHeadDuck();
                 raf.performFly();
                 raf.performQuack();
                 raf.setFlyBehavior(new FlyWithWings());
                 raf.setQuackBehavior(new Quack());
                 raf.display();
                 break;
                }
             default -> {
                 System.out.println("Input salah");
             }
        }
    }
}
    
        
