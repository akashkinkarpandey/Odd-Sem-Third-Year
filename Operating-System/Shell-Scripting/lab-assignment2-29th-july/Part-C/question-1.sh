# Qs-> Write a shell script to find the maximum and minimum of some given numbers.
# command line arguments
# ./question-1.sh 10 9 7 11 1 5 2 2 3
# Maxi is 11
args=("$@") #puts all command line arguments in args array
a=$# #counts number of command line arguments i.e. gives size of args array
maxi=${args[0]}
i=1
while (( $i < a ))
do
    if (( ${args[$i]} >maxi ))
    then
        maxi=${args[$i]}
    fi
    i=$(( $i+1 ))
done
echo "Maxi is $maxi"