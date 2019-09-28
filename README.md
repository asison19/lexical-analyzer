If there is a weird character on the top of the produced java file from the jflex spec, such as ï»¿  
save endcoding as UTF-8.

Function yylex() returns null at  
if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {  
        zzAtEOF = true;  
        return (Integer) null;  
      }  
which is line 678 at the moment 9/27/19. Must typecast to Integer, change return type to Integer, and use Java Compiler Compliance level 10 or higher,  
