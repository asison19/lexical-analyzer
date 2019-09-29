If there is a weird character on the top of the produced java file from the jflex spec, such as ï»¿ save endcoding as UTF-8.  
Input (.in) files of the Toy "code" that needs to be compiled needs to be converted and encoded in UTF-8. The following endcodings won't work:  
ANSI, UTF-8-BOM, UCS-2-BE-BOM, UCS-2-LE-BOM  
Both ANSI, and UTF-8 can work with text(.txt) files.
  
To install, run the compile.bat file. Open a terminal and go to the src directory. Type  
"java main/Main"  
to run the default test file, or  
"java main/Main *fileName*"  
to test another input file.
