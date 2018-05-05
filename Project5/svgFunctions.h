// Wrapper for simple svg c++ classes/methods

#ifndef SVG_FUNCTIONS_INCL
#define SVG_FUNCTIONS_INCL

using namespace std ;

#include "simple_svg_1.0.0.hpp"

typedef enum { COLOR_RED, COLOR_GREEN, COLOR_BLUE, COLOR_BLACK, COLOR_WHITE, COLOR_CYAN, COLOR_MAGENTA } colorType ;

extern "C" void* initialize ( char* fname, int width, int height, char* backgroundColorName ) ;

extern "C" void drawCircle ( void* docPtr, int centerX, int centerY, double diameter,
    colorType fill, colorType line ) ;

extern "C" void drawRectangle ( void* docPtr, int upperLeftX, int upperLeftY,
    int height, int width, colorType fillColor, colorType lineColor ) ;

extern "C" void drawLine ( void* docPtr, int width, int startX, int startY, int endX, int endY,
    colorType line ) ;

extern "C" void drawText ( void* docPtr, int startX, int startY, int pointSize, colorType textColor, char* fontName, char* text ) ;

extern "C" void saveDocument ( void* docPtr ) ;

#endif // SVG_FUNCTIONS_INCL
