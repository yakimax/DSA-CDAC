

Radix Sort is a linear sorting algorithm that sorts elements by processing them digit by digit.
# Application
- It is an efficient sorting algorithm for integers or strings with fixed-size keys.



Radix Sort distributes the elements into buckets based on each digit’s value.
# From the least significant to the most significant,
 


- Step 1: Find the largest element in the array, which is 802.
It has three digits, so we will iterate three times,
once for each significant place.



- Step 2: Sort the elements based on the unit place digits (X=0) .


- Step 3: Sort the elements based on the tens place digits .
-
-
-
-
- Step 4: Till n th position



# Space complexity - O(b*(N+b))
# Time complexity - O(N+b)


# counting Sort


step 1 - Store the frequency of RSB's at index (base)array .
step 2 - Add all previous frequencies to the next array element .
step 3 - Create an Output array of size similar to Original array .
step 4 - Decrement the count array element and update the value of output array .



# applicaiton of radix sort :
- where range of the data is know in advance .