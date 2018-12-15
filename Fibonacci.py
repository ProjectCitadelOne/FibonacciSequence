# List the first 100 numbers in the fibonacci sequence.

a = 0
b = 1
count = 0
# Print first two numbers in the sequence.
print(a)
print(b)
# Find and print the next 98 numbers in the sequence.
while count < 98:
    sum = a + b
    print(sum)
    a = b
    b = sum
    count += 1
