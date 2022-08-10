# Write a shell script to find the number of characters in a given string
# input-output
# enter a string
# hi world
# Number of characters are 8
echo "enter a string"
read string
count=$(echo -n "$string" | wc -c)
echo "Number of characters are $count" 