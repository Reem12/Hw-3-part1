/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threading1;
/**
 *
 * @author reem
 */
public class Threading1  {
public static void main(String[] args) {

Thread t1=new Thread(new Runnable() { 
public void run() {

int count=0;

try {

while (true) { //infinite loop

count++;

// count every 1 sec

System.out.println("How many times 1 second has passed : "+count);

Thread.sleep(1000); //thread sleeping for 1000 milliseconed

    
}}catch (Exception e) {}

}});

Thread t2 = new Thread(new Runnable(){
  
public void run() {

int count=0;

try{
while(true) {

count++;

System.out.println("    How many times 3 second has passed : "+ count);

Thread.sleep(3000);

}} catch (Exception e) {}

}});
t1.start();
t2.start();
 
}}




   



    
 
   

    

