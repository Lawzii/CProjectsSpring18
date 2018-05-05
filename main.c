#include <stdio.h>
#include <stdlib.h>
#include <string.h>
/* void myFunc ( char a )
    { a = 'x' ;
    return 1 ;
    }
    char b = 'y' ;
    int z = ( b ) ;
*/

//double check tech meetups
//projects 6/7
//zybooks
// phil HW and slides
typedef struct astronomer_struct
{

    char name[50] ;
    int dead ;
    struct astronomer_struct* next ; //* next to type name to indicate next is a pointer for 'astronomer_struct'



} Astronomer ;

int main()
{
    Astronomer* head = NULL ;
    Astronomer*tail = NULL ;
    Astronomer*tmp = NULL ;



//allocate first element of list and then initialize
//first node
    head = malloc (sizeof (Astronomer) ) ; // malloc doesn't initialize memory, it will post what was already there.
    if (head == NULL)
    {
        printf ("Out of memory. \n");
        return 1;
    }

    strcpy ( head -> name , "Galileo\n") ;
    head -> dead = 1;
    head -> next = NULL ;

    //printf ( "%s\n", head -> name) ; // head points to name
//second node
    tmp = malloc (sizeof (Astronomer) ) ; // tmp
        if (tmp == NULL)
        {
            printf ("Out of memory. \n");
            return 1;
    }
    strcpy ( tmp -> name , "Nicholas Capernicus\n") ;
    tmp -> dead = 1;
    tmp -> next = NULL ;

    //printf ( "%s\n", tmp -> name) ;

    //link nodes together and move tail

    head -> next = tmp ;
    tail = tmp ;
// third node
    tmp = malloc (sizeof (Astronomer) ) ;
        if (tmp == NULL)
        {
            printf ("Out of memory. \n");
            return 1;
        }

    strcpy ( tmp -> name , "Carolyn Porco") ;
    tmp -> dead = 0;
    tmp -> next = NULL ;

    //printf ( "%s\n", head -> name) ;
    // link third node
    tail -> next = tmp ;
    tail = tmp ;

    //traverse list
    tmp = head ;
    printf ("%s", tmp -> name ); // print one out of loop since the while loop will exit early
    while (tmp -> next != NULL)
    {
        tmp = tmp -> next ;
        printf ("%s\n", tmp -> name );

    }


    return 0;
}
