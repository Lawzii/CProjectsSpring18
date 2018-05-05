#include <stdio.h>
#include <stdlib.h>
int main()

{
    char testComing[1];
    int lastClass;
    int lowGrade;
    int studyMeter = 0;
    int relaxMeter = 0;

    printf ("You've got some free time and you're not sure if you should study instead of something more relaxing. Let's find out!\n");

    printf ("Is there a test coming up? Y / N:\n");
    scanf  ("%c", testComing);

    printf ("How many days since you last attended class?\n");
    scanf ("%i", &lastClass);

    printf ("Do you have a low grade in the class? 1 for (Yes) or 0 for (No).\n");
    scanf ("%i", &lowGrade);

    if (strcmp(testComing,"Y")== 0){
        studyMeter = studyMeter + 1;}
        else {relaxMeter = relaxMeter + 1;}

    if (lastClass > 7){
        studyMeter = studyMeter + 1;}
        else {relaxMeter = relaxMeter + 1;}

    if (lowGrade == 1){
        studyMeter = studyMeter + 1;}
        else {relaxMeter = relaxMeter + 1;}


    if (studyMeter >= 2){
        printf ("You should take some time to study.\n");}
        else {printf ("Seems like you can relax today.\n");}




    return 0;}
