/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicio;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.util.Scanner;

/**
 *
 * @author Tobias
 */
public class BasicIO
{

    public static void main(String[] args) throws IOException
    {
        String input = "C:/Users/Tobias/EFIF/OneDrive - EFIF/CBA/E2018/1. Sem/CheatSheet.txt";
        String output = "C:\\Users\\Tobias\\EFIF\\OneDrive - EFIF\\CBA\\E2018\\1. Sem\\CheatSheetLN.txt";
        addLineNumbers(input, output);
    }
    
    public static void addLineNumbers(String inputFileName, String outputFileName) throws IOException
    {
        Reader in = null;
        BufferedWriter out = null;
        try
        {
            in = new BufferedReader(new FileReader(inputFileName));
            out = new BufferedWriter(new FileWriter(outputFileName));
            Scanner scanner = new Scanner(in);
            int lineNumber = 0;
            while(scanner.hasNextLine())
            {
                String line = scanner.nextLine();
                String numberedLine = "" + (++lineNumber) + ": " + line;
                out.write(numberedLine);
                out.newLine();
            }
        }
        finally
        {
            if(in != null)
            {
                in.close();
            }
            if(out != null)
            {
                out.close();
            }
        }
        
     /*   
        try(    Reader in = new BufferedReader(new FileReader(new File(inputFileName)));
                Writer out = new BufferedWriter(new FileWriter(new File(outputFileName))))
        {
            Scanner scanner = new Scanner(in);
            int lineNumber = 0;
            while(scanner.hasNextLine())
            {
                String line = scanner.nextLine();
                String numberedLine = "" + (++lineNumber) + ": " + line;
                out.write(numberedLine);
                out.write(System.lineSeparator());
            }
        }
*/
    }
    
}
