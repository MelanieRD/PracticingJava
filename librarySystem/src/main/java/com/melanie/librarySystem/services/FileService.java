package com.melanie.librarySystem.services;

import com.melanie.librarySystem.books.Book;
import com.melanie.librarySystem.books.History;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileService {



   public File createFile(String fileName){
        File fileToReturn = null;
       try{
           File myFile = new File(fileName);
           if(myFile.createNewFile()){
               System.out.println("File created"+ myFile.getName());
               fileToReturn = myFile;
           } else {System.out.println("File already exists");
                fileToReturn = myFile;
           }
       } catch (Exception e) {
           System.out.println("An error ocurred");
           e.printStackTrace();

       }
        return  fileToReturn;
   }


   public void writeListToFile(List<Book> list, File myFile){

       try{
           if(myFile.exists()){

               FileWriter writer = new FileWriter(myFile);

               for( Book book : list ){
                  writer.write(book.getBookInfo()+"\n");
               }
               writer.close();
               System.out.println("Info was wrote successfully");
           }

       }catch( Exception e){
           System.out.println("An error ocurred");
       }

   }

 public  void writeToFile(File myfile, String data){
       try{
           if(myfile.exists()){
               FileWriter writer = new FileWriter(myfile, true);
               writer.write(data+"\n");
               writer.close();
               System.out.println("Info was wrote successfully");
           } else {
               System.out.println("The file does not exists");
           }
       } catch (Exception e) {
           System.out.println("An error ocurred");
           e.printStackTrace();
       }
  }


 public void readFile(File myFile){
      try{
            if(myFile.exists()){
                Scanner reader = new Scanner(myFile);
                while (reader.hasNextLine()){
                    String data = reader.nextLine();
                    System.out.println(data);
                }
                reader.close();
            }

      } catch (Exception e) {
          System.out.println("An error ocurred");
          e.printStackTrace();
      }
  }

    public void modifyLineFile(){

    }

    public void deleteLineFile(File myFile,int num){

        List<String> bookInfo = new ArrayList<String>();

        try{
            // Leer el archivo
                  if(myFile.exists()){
                Scanner reader = new Scanner(myFile);
                while (reader.hasNextLine()){
                    bookInfo.add(reader.nextLine());
                }
                reader.close();
            }
            // Dividir en lineas
            // Filtrar la linea



            // Escribir el resultado

        }catch (Exception e){
            System.out.println("An error ocurred");
            e.printStackTrace();
        }
    }




}
