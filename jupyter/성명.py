def score_check():
   score = 0
   if my_sq_prod([1,2,3])==36:
       score += 30
   print(score)

def my_sq_prod(number_list):
   return_value = 1;
   for number in number_list:
        return_value = return_value * number**2
   return return_value

score_check()