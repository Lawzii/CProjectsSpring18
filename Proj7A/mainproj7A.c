#include <stdio.h>
#include <stdlib.h>

typedef struct acars_struct
{

    char flightnum[7] ;
    char origin[5] ;
    char dest[5] ;
    int timestamp ;
}FlightStruct ;


int main()
{
    FILE* fp ;

    FlightStruct flight[3000] ;
    int nItems = 0 ;
    int i = 0;

    fp = fopen ("C:\\Users\\Lawzii\\Pictures\\important\\school\\CProg\\acars.bin", "rb") ;

    if (fp == NULL )
    {
        printf ("File did not open") ;
        return 1;

    }

    nItems = fread (&flight, sizeof(FlightStruct), 1 , fp) ;

    //printf ("%s, %s , %s, %d \n", flight.flightnum, flight.origin, flight.dest, flight.timestamp);

    printf ("nItems = %d\n", nItems);
    while (fread (&flight[nItems], sizeof(FlightStruct), 1 , fp) != 0)
    {
        printf ("%s, %s , %s, %d \n", flight[nItems].flightnum, flight[nItems].origin, flight[nItems].dest, flight[nItems].timestamp);
        nItems++ ;

    }

    //put qsort () here

    for (i = 0 ; i < nItems ; i++)
    {
        printf ("%s, %s , %s, %d \n", flight[i].flightnum, flight[i].origin, flight[i].dest, flight[i].timestamp);
    }

    printf ("Number of records read: %d\n", nItems);


    fclose (fp) ;
    return 0 ;
}
