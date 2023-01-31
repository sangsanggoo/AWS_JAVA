#!/usr/bin/env python
# coding: utf-8

# In[1]:


import sys
print(sys.version)


# In[7]:


a = 10 #변수를 하용할떼 데이터 타입이 정해져 있지 않다.
print(type(a)) #변수타입을 확인
print(a)

b = 10.5
print(type(b))

c = 'abcd'
print(type(c))

d = True
print(type(d))

del c #c를 없애버림


# In[8]:


print(c)


# In[18]:


#list, tuple, set ,dictinoary
list1 = [1,2,3,4]
print(list1)
print(type(list1))

list2 = [a, 10.5, 'abc' , False, [1,2,3,4]]
print(list2)

tuple1 = (1,2,3,4) #튜플은 한번 만듦면 수정 불가능
print(tuple1)
print(type(tuple1))

set1 = {1,2,3,4,}
print(set1)

list2 = [1,2,3,4,4,5,5,5]
set2 = {1,2,3,4,5,5,6,6,} #set은 중복된 값이 없다 java에 set이랑 빗스한거 같음

print(list2)
print(set2)

d1 = {'a':1, 'b':2,'c':3} #dictonary 라는데 java에 map이랑 같은거 같음
print(d1)
print(type(d1))


# In[23]:


a =5
if a>10:
    print('greater than 10')
elif a >3 :
    print('greater than 3')
elif a==5: 
    print('is five')
else :
    print('not great than 10')


# In[28]:


for _ in range(4) :  #변수가 필요 없을 경우 _(언더바)를 사용 하면 됨
    print('message')


# In[37]:


a = range(0,50,3)  # a=range(0,4) 와 a = range(4)는 같은것임 (start, stop)
                    #(0,50,3) 3씩 올라감 +=3같은거임 
print(a)
print(type(a))

for i in a :
    print(i)
    


# In[43]:


b = range(100,500,5)
list1 = []
for i in b:
    list1.append(i)
    
print(list1)


# In[44]:


list2 = [x for x in range(100,500,5)]
print(list2)


# In[70]:


list_3 = []
list_5 = []
for i in range (0,100,3) :
    list_3.append(i)
for i in range(0,100,5) :
    list_5.append(i)

print(list_3)
print(list_5)

list_3_a = []
for i in list_3 :
    if i%5 >0 :
        list_3_a.append(i)
print(list_3_a)

s=0
for i in list_3_a :
    s = s+i
    
for i in list_5 :
    s = s+i

print(s)


# In[84]:


list_3 = [i for i in range(0, 100 ,3)]
list_5 = [i for i in range(0, 100 ,5)]
print(list_3)
print(list_5)
print(list_3+list_5)
print('=============================================')

list_all = []
for i in list_3 :
    list_all.append(i)
for i in list_5 :
    list_all.append(i)
print(list_all)
print('=============================================')
set1 = set(list_all) #set으로 변환
print(set1)
s = 0
for i in set1 :
    s = s + i
print(s)
print(sum(set1))
print(sum(list_3))
print(sum(list_5))


# In[92]:


list_a = []

for i in range (0 , 100) :
    if i%3 == 0  or i%5 ==0:
        list_a.append(i)
print(list_a)


print(sum(list_a))


# In[97]:


list_a = [i for i in range(0,100) if i%3 ==0 or i%5 ==0]
print(sum(list_a))

