#include <stdio.h>
#include <stdlib.h>
#include <string.h>

double catAgeInYrs (int catMonthAge)
{
    float catYearAge = catMonthAge / 12.0 ;
    return catYearAge ;
}

int main()
{
    FILE*fp ;



    fp = fopen("C:\\Users\\student\\Desktop\\cats_2018.txt", "r");
    if (fp == NULL)
    {
        printf ("The file did not open\n");
        return 1 ;
    }
    else
    {
        printf ("The file opened.\n"); // double check file opening

    }

    char catName[50];
    char catColor[50];
    int catMonthAge;

    while (fscanf (fp, "%s %s %d", catName, catColor, &catMonthAge) != -1)
    {
        //printf ("Name: %s \t", catName);
       // printf ("Color: %s \t", catColor);
        //printf ("Age: %lf\n ", catAgeInYrs(catMonthAge));

        if ((strcmp (catColor,"striped")== 0) && catAgeInYrs(catMonthAge) < 2)
        {
            printf ("This cat is striped and under two years old.\n");
            printf ("Name: %s \t Color: %s \t Age: %lf\n", catName, catColor, catAgeInYrs(catMonthAge));
        }
    }



    fclose(fp);

    return 0;
}
