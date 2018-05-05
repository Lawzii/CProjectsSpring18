// Wrapper for simple svg c++ classes/methods

#include "svgFunctions.h"

using namespace svg;

Color::Defaults setColor ( colorType colorNum )
{
    Color::Defaults theColor = Color::Black ;

    switch ( colorNum )
    {
        case COLOR_RED:
            theColor = Color::Red ;
        break ;

        case COLOR_GREEN:
            theColor = Color::Green ;
        break ;

        case COLOR_BLUE:
            theColor = Color::Blue ;
        break ;

        case COLOR_BLACK:
            theColor = Color::Black ;
        break ;

        case COLOR_WHITE:
            theColor = Color::White ;
        break ;

        default:
        break ;
    }
    return theColor ;
}

void* initialize ( char* fname, int width, int height, char* backgroundColorName )
{
    Dimensions dimensions(width, height);
    Document* gDocPtr = new Document ( std::string ( fname ), Layout(dimensions, Layout::BottomLeft),
                                      std::string ( backgroundColorName ) ) ;
    return ( void* ) gDocPtr ;
}

void drawCircle ( void* docPtr, int centerX, int centerY, double diameter,
    colorType fillColor, colorType lineColor )
{
    // Coerce back to Document* from C's void*
    Document* dp = ( Document* ) docPtr ;
    Circle c ( Point ( centerX, centerY ), diameter, setColor ( fillColor ), Stroke ( 1, setColor ( lineColor ) ) ) ;
    *dp << c ;
}

void drawRectangle ( void* docPtr, int upperLeftX, int upperLeftY,
    int height, int width, colorType fillColor, colorType lineColor )
{
    // Coerce back to Document* from C's void*
    Document* dp = ( Document* ) docPtr ;
    Rectangle r ( Point ( upperLeftX, upperLeftY ), ( double ) width, ( double ) height,
                 Fill ( setColor ( fillColor ) ), Stroke ( 1, setColor ( lineColor ) ) )  ;
    *dp << r ;
}

void drawLine ( void* docPtr, int width, int startX, int startY, int endX, int endY,
    colorType line )
{
    // Coerce back to Document* from C's void*
    Document* dp = ( Document* ) docPtr ;
    Line l ( Point ( ( double ) startX, ( double ) startY ), Point ( ( double ) endX, ( double ) endY),
            Stroke ( ( double ) width, setColor ( line ))) ;
    *dp << l ;
}

void drawText ( void* docPtr, int startX, int startY, int pointSize, colorType textColor, char* fontName, char* text )
{
    // Coerce back to Document* from C's void*
    Document* dp = ( Document* ) docPtr ;
    Text t ( Point ( startX, startY ), std::string ( text ), Fill (setColor (textColor) ), Font ( pointSize, string ( fontName ) ) ) ;
    *dp << t ;
}

void saveDocument ( void* docPtr )
{
    Document* dp = ( Document* ) docPtr ;
    dp->save ( ) ;
}

