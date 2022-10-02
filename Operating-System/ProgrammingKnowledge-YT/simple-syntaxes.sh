#! /bin/bash
echo "hello world"
#this is a comment

echo $BASH
echo $BASH_VERSION

# name=Mark
# echo "the name is $name"

# read -sp 'hey: ' a 
# echo hey :$a 

# read -a names
# echo "Names: ${names[1]}"

# echo $1 $2 $3 'hi'
# echo $0

# args=("$@")
# echo ${args[0]} ${args[1]} ${args[2]}
# echo $@
# echo $#

# count=10
# if (( $count > 9 ))
# then
# echo "condition is true"
# fi

# word=c

# if [[ $word < "b" ]]
# then
# echo "hi"
# else
# echo "hello"
# fi

# word=a

# if [[ $word == "c" ]]
# then
# echo "b is true"
# elif [[ $word == "a" ]]
# then
# echo "a is true"
# else
# echo "hello"
# fi

# echo -e "enter name of file \c"
# read filename

# if [ -s $filename ]
# then
# echo "file not empty"
# else
# echo "file empty"
# fi

# echo -e "enter name of file \c"
# read filename
# if [ -e $filename ]
# then
#     if [ -w $filename ]
#     then
#     echo "type some text data.press ctrl+d to exit"
#     cat >> $filename
#     else 
#     echo "file do not have write permissions"
#     fi
# else
# echo "$filename file does not exist"
# fi

# age=15
# if (( $age > 14 &&  $age < 16))
# then
# echo "hi"
# else 
# echo "hello"
# fi

# echo $age

# a=1
# b=3

# echo $(( a + b ))
# echo $(( a * b ))
# echo $(expr $a + $b )
# echo $(expr $a \* $b )

# a=1
# b=3.2

# echo "5+20.2" | bc
# echo "5*20.2" | bc
# echo "5-20.2" | bc
# echo "24/5" | bc
# echo "scale=3;24/5" | bc
# echo "scale=2;24/5" | bc
# echo "scale=2;$a+$b" | bc


# c=27
# echo "scale=2;sqrt(27)" |bc -l
# echo "scale=2;4^2" |bc -l

# vehicle=$1

# case $vehicle in
#     "car" )
#     echo "carrr";;
#     "van" )
#     echo "vannn";;
#     "bicycle" )
#     echo "bicycleeee";;
#     "truck" )
#     echo "truccckkk";;
#     * )
#     echo "unknown vehicle ";;
# esac

# echo -e "enter something: \c"
# read value

# case $value in
#     [a-z] )
#         echo "small..";;
#     [A-Z] )
#         echo "large..";;
#     [0-9] )
#         echo "digits..";;
#     ? )
#         echo "special character..";;
#     * )
#         echo "unknown character $value..";;
# esac

# os=('ubunut' 'windows' 'kali')
# os[3]='mac'
# unset os[2]
# echo "${os[@]}"
# echo "${os[1]}"
# echo "${os[3]}"
# echo "${#os[@]}"

# string=abcdefghijklmnnopqrstuvwxyz
# echo "${string[0]}"
# echo "${string[1]}"
# echo "${#string[@]}"


n=1
# while (($n<=10))
# do
#     echo $n
#     # n=$((n+1))
#     ((n++))
#     sleep 1
# done

# while (($n<=3))
# do
#     echo $n
#     # n=$((n+1))
#     ((n++))
#     xterm &
# done

# cat simple-syntaxes.sh | while read p
# do
#     echo $p
# done

# for i in 1 2  4 5
# do 
# echo $i
# done

# for i in {2..10..2}
# do 
# echo $i
# done

# for cmd in ls pwd date
# do
#     $cmd
# done

# select name in mark john tom
# do
# echo "$name selected"
# done
