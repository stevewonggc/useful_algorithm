#include "stdafx.h"

quickSort::quickSort()
{
    //sstd::cout << "This is constructor" << std::endl;
    initialize();
}

void quickSort::initialize()
{
    seq = NULL;
    length = 0;
}

void quickSort::printSeq()
{
    if (seq != NULL)
    {
        for(int i = 0; i < length; i ++)
        {
            std::cout << seq[i] << " ";
        }
        std::cout << std::endl;
    }
    else
    {
        std::cout << "There's no data in the sequence!" << std::endl;
    }
}

void quickSort::setSeq(int A[], int length)
{
    seq = A;
    this->length = length;
}

int quickSort::participate(int h, int t)
{
    if(h > t)
    {
        std::cout << "Error here" << std::endl;
    }
    int x = seq[h];
    int index = h;
    swap(h, t);
    for(int i = h; i < t; i ++)
    {
        if (seq[i] > x)
        {
            swap(i, index++);
        }
    }
    swap(index, t);
    return index;
}

void quickSort::sort(int h, int t)
{
    if ( h < t )
    {
        int q = participate(h, t);
        sort(h, q - 1);
        sort(q + 1, t);
    }
    
}

void quickSort::sortSeq()
{
    sort(0, length - 1);
}

void quickSort::swap(int a, int b)
{
    if( a != b)
    {
        seq[a] += seq[b];
        seq[b] = seq[a]- seq[b];
        seq[a] -= seq[b];
    }
}