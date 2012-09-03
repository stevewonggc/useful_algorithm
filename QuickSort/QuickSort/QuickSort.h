#ifndef QUICKSORT_H
#define QUICKSORT_H

class quickSort
{
public:
    quickSort();
    void printSeq();
    void setSeq(int[], int);
    void sortSeq();
private:
    void initialize();
    int participate(int h, int t);
    void sort(int h, int t);
    void swap(int a, int b);
    int * seq;
    int length;
};
#endif