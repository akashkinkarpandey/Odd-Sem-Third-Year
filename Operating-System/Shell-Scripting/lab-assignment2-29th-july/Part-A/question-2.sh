# Qs->perform arithmetic operations on floating point numbes
# input-output
# Enter 1st floating point number
# 2.3
# Enter 2nd floating point number
# 4.5
# 2.3 + 4.5 is 6.8
# 2.3 - 4.5 is -2.2
# 2.3 * 4.5 is 10.35
# 2.3 / 4.5 is .51
# 2.3 % 4.5 is 2.3

# Enter 1st floating point number
# 24.2
# Enter 2nd floating point number
# 12.1
# 24.2 + 12.1 is 36.3
# 24.2 - 12.1 is 12.1
# 24.2 * 12.1 is 292.82
# 24.2 / 12.1 is 2.00
# 24.2 % 12.1 is 0
echo "Enter 1st floating point number"
read a
echo "Enter 2nd floating point number"
read b

echo -e "$a + $b is \c" # -e is a flag used for \c->cursor stays in same line
echo "scale=2;$a + $b" | bc #for 2 decimal places
# -------------------------
# Below works too
# echo $(expr $a + $b)
# echo `expr $a + $b`
# -------------------------

echo -e "$a - $b is \c"
echo "$a-$b" | bc

# ---------------------------
echo -e "$a * $b is \c"
echo "scale=2;$a * $b" | bc #for 2 decimal places
# --------------------------
echo -e "$a / $b is \c"
echo "scale=2;$a/$b" | bc
# -----------------------------
echo -e "$a % $b is \c"
echo "$a%$b" | bc 
#writing scale =2 will give wrong asnwer in modulus as zero.
#Due to decimal division,there wont be any remainder
# ---------------------------

