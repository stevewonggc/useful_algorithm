// QuickSort.cpp : 定义控制台应用程序的入口点。
//

#include "stdafx.h"
using namespace std;

int _tmain(int argc, _TCHAR* argv[])
{
    quickSort a;
    int A[] = {823, 2, 35, 23,5 ,57,234, 345,243, 52, 435, 34,5722,7,79, 689};
    //cout << "sizeof A " << sizeof(A)/sizeof(A[0]) << endl;
    a.setSeq(A, sizeof(A)/sizeof(A[0]));
    a.sortSeq();
    a.printSeq();
	return 0;
}