# Print greater between 2 numbers.

# input-output
# Enter 1st number 2.2
# Enter 2nd number 2.1
# 2.2 is greater than 2.1

# Enter 1st number -4.2
# Enter 2nd number -4.1
# -4.1 is greater than -4.2

# Enter 1st number 2
# Enter 2nd number 3
# 3 is greater than 2

echo -e "Enter 1st number \c"
read a
echo -e "Enter 2nd number \c"
read b
#  if (( a > b )) #this does not work for floating point
#  then 
#  echo "$a is greater than $b"
#  else
#  echo "$b is greater than $a"
#  fi

if (( $(bc -l<<<"$a>$b") )) # this works for floating point
then
echo "$a is greater than $b"
else
echo "$b is greater than $a"
fi
