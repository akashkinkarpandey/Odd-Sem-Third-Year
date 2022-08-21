# calculate simple interest by taking input from command line arguments
# If number of command lines are not sufficient enough, raise error
# input-output
# ./question-1b.sh 2 3 666
# Simple Interest is 39.96
array=("$@")
len=$#
if [ $len -eq 3 ];
then
    echo -e "Simple Interest is \c"
    echo "scale=2;${array[0]}*${array[1]}*${array[2]}/100.0" | bc -l
else
    echo "Invalid number of arguments..3 required"
fi
