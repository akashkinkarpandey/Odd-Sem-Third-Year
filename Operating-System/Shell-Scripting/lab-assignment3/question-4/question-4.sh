# file is incomplete
# Write a shell program to count number of words, characters, white spaces and special symbols in
# a given text
# https://www.geeksforgeeks.org/shell-script-to-count-number-of-words-characters-white-spaces-and-special-symbols/
echo -e "Enter filename \c"
read file
if [ -e $file]
then
echo -e "Number of words are \c "
wc -w $file
echo -e "Number of characters are \c "
wc -c $file


