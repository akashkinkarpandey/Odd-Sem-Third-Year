# qs-> Write a shell program to find factorial of given number.
# input-output
# question-6.sh 
# Enter a number 0
# Factorial of 0 is 1

# question-6.sh
# Enter a number 5
# Factorial of 5 is 120
echo -e "Enter a number \c"
read n
f=1
for((i=1;i<=n;i++))
do
f=$((f*i))
done
echo "Factorial of $n is $f "