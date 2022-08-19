# Qs-> Write a shell script to print all possible combinations of 3 numbers.
echo "Enter first number"
read n1
echo "Enter second number"
read n2
echo "Enter third number"
read n3
for i in $n1 $n2 $n3
do
	for j in $n1 $n2 $n3
	do
		for k in $n1 $n2 $n3
		do
			echo "$i $j $k"
		done
	done
done

# Enter first number
# 1
# Enter second number
# 2
# Enter third number
# 3
# 1 1 1
# 1 1 2
# 1 1 3
# 1 2 1
# 1 2 2
# 1 2 3
# 1 3 1
# 1 3 2
# 1 3 3
# 2 1 1
# 2 1 2
# 2 1 3
# 2 2 1
# 2 2 2
# 2 2 3
# 2 3 1
# 2 3 2
# 2 3 3
# 3 1 1
# 3 1 2
# 3 1 3
# 3 2 1
# 3 2 2
# 3 2 3
# 3 3 1
# 3 3 2
# 3 3 3