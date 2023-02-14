// C program to illustrate differences
// between structure and Union

#include <stdio.h>
#include <string.h>

// declaring structure
struct struct_example
{
	int integer;
	float decimal;
	char name[20];
};

// declaring union

union union_example
{
	int integer;
	float decimal;
	char name[20];
};

void main()
{
	// creating variable for structure
	// and initializing values difference
	// six
	struct struct_example s={18,38,"geeksforgeeks"};

	// creating variable for union
	// and initializing values
	union union_example u={18,38,"geeksforgeeks"};

		
	printf("structure data:\n integer: %d\n"
				"decimal: %.2f\n name: %s\n",
				s.integer, s.decimal, s.name);
	printf("\nunion data:\n integer: %d\n"
				"decimal: %.2f\n name: %s\n",
				u.integer, u.decimal, u.name);


	// difference two and three
	printf("\nsizeof structure : %d\n", sizeof(s));
	printf("sizeof union : %d\n", sizeof(u));
	
}
