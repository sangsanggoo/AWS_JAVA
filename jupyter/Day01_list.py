#!/usr/bin/env python
# coding: utf-8

# In[8]:


list_a = [i for i in range(10)]
list_b = [i for i in range(100,110)]
print(list_a)

# in : 리스트에 값이 있는지 없는지 확인하는것 있으면 true 없으면 false
# not in : in과 반대 의미
print(5 in list_a)

if 100 in list_a :
    print('True')
else :
    print('False')

# list+list : 두개 이어 붙이기
print(list_a+list_b)

#* 리스트 원하는 횟수 만큼 곱하기
list_a *2    # 2*list_a 와 같음





# In[33]:


list_d = list('abcdefghicjklmn')
print(list_d)
print(list_d[3]) #인덱스가 3인값
print(list_d[3:6]) #인덱스가 3에서 5까지 값
print(list_d[3:6:2]) #인덱스 3에서 5까지 값인데 2칸씩 증가
print(len(list_d)) #길이
print(min(list_d)) #최소값
print(max(list_d)) #최대값
c_index = list_d.index('c',3,10) #c가 몇번째 있는지 찾기  (찾을거 , 찾을 시작 위치 ,끝나는 위치(포함 x))
list_d[c_index] = 'c' #c찾아서 c로 바꾸기
print(list_d)
print('count:',list_d.count('c')) #a의 갯수 찾기


# In[51]:


s = 'While The Python Language Reference describes the exact syntax and semantics of the Python language, this library reference manual describes the standard library that is distributed with Python. It also describes some of the optional components that are commonly included in Python distributions.'
#print(s)
list_s = list(s)
set_s = set(list_s)
#print(set_s)
exclude_list = [',','.',' '] # , . (띄어쓰기) 없애기
for i in set_s :
    if i not in exclude_list :
        print(i,list_s.count(i))


# In[71]:


list_a = [1,2,3,]
list_b = list('abc')
d1 = {'a' : 1 , 'b': 2 ,'c':3}
print(list_a)
print(list_b)
print(d1)

d2 = dict(zip(list_b,list_a)) # b:a로 만들어 준다
print(d2)
print(d2.items())

d3 = dict([('a', 1), ('b', 2), ('c', 3)])
print(d3)

print(d3['c']) #value값을 찾기
print(d3.get('c'))
print(d3.get('x'))
d3['y'] = 15 #새로운 키값과 밸류값을 만들어주기
print(d3)


# In[75]:


for i in d3:
    print(i,d3[i])

print(d3.keys()) #key값들만 가져오기
print(d3.values()) #value값들만 가져오기

for i in d3.values(): #value값 순환시켜서 가져오기
    print(i)


# In[76]:


help(dict)

