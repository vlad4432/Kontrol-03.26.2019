/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zadanie1;

import java.util.Scanner;

/**
 *
 * @author pupil
 */
public class Zadanie1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      //Написать программу которая определяет слова из введенного текста и выводит их в случайном пораядке
      System.out.println("Введите ваш текст сюда: ");
      Scanner scanner = new Scanner(System.in); //Scanner(Ввод и вывод данных)
      String myString = scanner.nextLine();//nextLine(Читает строку до нажатия на Enter)
      String[] myStringArray=myString.split(" ");
      
      char[] myChar =  myString.toCharArray();//char[](массив символов);
      //char[] newChar = new char[myChar.length];
      //начало цикла for
       for(int i=0;i<myChar.length;i++)//
       {
           int a = 1;
           int b = myChar.length;
           int random_number1= a+(int)
                   (Math.random()*b);
                   if(random_number1==myChar){
                   random_number1 = a+(int)
                           (Math.random()*b);
                   }
                   System.out.printin(myWordsArray[random_number1]);
        }//Конец цикла for
      }

    }