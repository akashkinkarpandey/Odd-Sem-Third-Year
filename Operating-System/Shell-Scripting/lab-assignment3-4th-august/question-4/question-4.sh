# file is incomplete
# Write a shell program to count number of words, characters, white spaces and special symbols in
# a given text

# input-output
# Enter filename use-it.txt
# Number of words are 20 use-it.txt
# Number of characters are 108 use-it.txt
# Number of white spaces are 14
# Number of special characters are 30
echo -e "Enter filename \c"
read file
if [ -e $file ]
then
echo -e "Number of words are \c "
wc -w $file
echo -e "Number of characters are \c "
wc -c $file
echo -e "Number of white spaces are \c "
grep -o " " $file | wc -l
# -o, --only-matching
# Print  only the matched parts of a matching line, with each such part on a separate output line.
echo -e "Number of special characters are \c "
grep -o '\\\|\^\|\~\|\!\|\@\|\#\|\$\|\&\|\*\|(\|)\|\]\|\/\|\}\|\[' $file | wc -l

# syntax for searching multiple patterns using the grep
# grep 'pattern1\|pattern2' file
# if pattern1 is special character 
# write it as \^ ^ is special character here
# dont write ( as \( or ) as \) otherwise error
fi


