#!/usr/bin/env python
# coding: utf-8

# In[7]:


# 솟수 : 1과 자기자신으로만 나누어 떨어지는 수 ex)2, 3, 5, 7, 11
n = 29
count = 0;
for i in range(2,n) :
    if n%i == 0 :
        count = count + 1;

if count>0 :
    print(n,'은 소수가아닙니다.')
else :
    print(n,'은 소수입니다.')

