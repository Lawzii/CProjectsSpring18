// Test C wrapper for simple svg classes

// Thjs example works, but need to check how the screen coordinates
// are figured....

// For a refernece on SVG capabilities, see: http://www.svgbasics.com/using_fonts.html

// Include prototypes for our functions.
// The functions in turn call on the methods of classes and
// objects written in C++.

#include "svgFunctions.h"

int main ( int argc, char* argv[] )
{

    void* docPtr = NULL ;

    printf ( "Starting...") ;

    // This is needed to open the XML file to contain the SVG information
    // The pointer returned must be passed as the first argument to all s
    // subsequent functions.  You can change the svg file name to whatever
    // you like.  Remember that if you start using a Windows-style path in
    // the filename, you will have to write two successive backslashes for
    // each folder, like this:
    // "c:\\users\\greed9\\documents\\new.svg"
    //
    docPtr = initialize ( "demo_svg.svg", 400, 400, "white" ) ;

    // ****
    // **** Add nested loops here and use one or more of the draw... functions
    // **** shown below to show the result.  Try changing the starting point, x
    // **** and/or y for each, or try using a random x and y, and so on.
    // **** Whatever output you choose to create is Ok, as long as it demonstrates
    // **** the results of nested looping
    // ****

    // Draw a circle, at x=100, y=150, in Rec, with a black outline




    // Draw a rectangle with an upper left corner (I think) at x=200, y=200,
    // with a height of 50 and a width of 75.  The rectangle should be filled

    // with Blue, and outlined in Black.

    int col ;
    int row ;
    int grid = 10000;

    for (col = 0 ; col < grid ; col += 120)
    {

        for (row = 0 ; row < col; row += 60)
            {
                drawRectangle ( docPtr, row + col, row + 60 ,60, 60, COLOR_BLACK, COLOR_WHITE ) ;

            }
            drawRectangle(docPtr, col + row, row + 60, 60 ,60, COLOR_GREEN, COLOR_GREEN);
    }

    int i ;
    int j ;

    for (i = 0; i < 300; i+= 30)
    {
        for (j = 0 ; j < i ; j++)
        {
            drawCircle(docPtr, j + 40, 400, 300, COLOR_BLUE, COLOR_WHITE);
        }
        drawCircle(docPtr, i + j, i + 30, 30, COLOR_WHITE,COLOR_RED);
    }



    // Draw a line 3 pixels wide, from x=300, y=200 to x=350, y=250, and color
    // it Green

    /*for (row = 0 ; row < 500; row += 5)
        {
             drawLine ( docPtr, 3, row, row + 25, row + 50, row, COLOR_GREEN ) ;
        }*/

    // Write Hello World! in BLUE text, default font of Verdana, beginning
    // at x=50, y=50, and in 24 point font.
    //drawText ( docPtr, 50, 50, 24, COLOR_BLUE, "Verdana", "Hello World!") ;

    // Close and flush the XML file with the SVG commands
    saveDocument ( docPtr ) ;

    printf ( "Done\n") ;

    return 0 ;
}

