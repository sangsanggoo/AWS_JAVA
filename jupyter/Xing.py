#!/usr/bin/env python
# coding: utf-8

# #전국 횡단보도표준데이터
# 
# 1. 횡단보도 연장, 녹색신호시간 : 상관도
# 2. 자전거 횡단도 겸용 비율(전체 대비)
# 3. 차로수별 자전거 횡단도 카운트/ 비율
# 4. 차로수별 보행자 신호등 유무 카운트/ 비율
# 5. 차로수별 음향신호기설치 유무 카운트 /비율
# 
# 화면 출력
# 1.상관도 수치 
# 
# 2.비율 수치 
# 
# 3~5 카운트, 비율 
# 

# In[83]:


import numpy as np
import math

def my_split(s):
    block_start = False
    start_index = 0
    ret_list=[]
    for i, c in enumerate(s):
        if block_start==False:
            if c==',':
                ret_list.append(s[start_index:i])
                start_index=i+1
            elif c=='"':
                block_start=True
                start_index = i
        else:
            if c=='"':
                block_start=False
    if s[-1]!=',':
        ret_list.append(s[start_index:])
    return ret_list



data_list = []
length_list = []
greentime_list=[]
bike_percent_Y = []
bike_percent_N = []
road_count= []
road_count_setlist= []
list_in_list= []
list_in_list2= []
list_in_list3= []
with open('xing.csv') as f:
    for i in f :
        data_list.append(my_split(i))
        
for i in data_list[1:] :
    if i[13] != '' and i[17] != '':
        length_list.append(i[13])
        greentime_list.append(i[17])
        
length_list = np.array(length_list).astype(np.float64)
greentime_list = np.array(greentime_list).astype(np.float64)
print('1. 상관도',np.corrcoef(length_list,greentime_list)[0][1])

for i in data_list[1:] :
    if i[7] == 'Y' :
        bike_percent_Y.append(i[7])
    elif i[7] == 'N' :
        bike_percent_N.append(i[7])
y = len(bike_percent_Y)
n = len(bike_percent_N)
print('2. 자전거 횡단도 겸용 비율 (전체대비) : ', y/(y+n)*100,'%')

print('3. 차로수별 자전거 횡단도 카운트/비율')
for i in data_list[1:] :
    i[11] = int(i[11])
    road_count.append(i[11])
road_count_setlist = list(set(road_count))

for i in range(len(road_count_setlist)) : #리스트 안에 리스트 넣기
    list_in_list.append([])
    list_in_list2.append([])
    list_in_list3.append([])
for i in data_list[1:] : 
    list_in_list[(road_count_setlist.index(i[11]))].append(i[7])
    list_in_list2[(road_count_setlist.index(i[11]))].append(i[14])
    list_in_list3[(road_count_setlist.index(i[11]))].append(i[16])
for i in range(len(road_count_setlist)) :
    print('      ',road_count_setlist[i],'차로 : ', list_in_list[i].count('Y'),'개',end=' ')
    if  list_in_list[i].count('Y') != 0:
        print((list_in_list[i].count('Y')/len(list_in_list[i]))*100,'%')
    else :
        print('0%')
print('4. 차로수별 보행자 신호등 유무 카운트/비율')
for i in range(len(road_count_setlist)) :
    print('      ',road_count_setlist[i],'차로 : ', list_in_list2[i].count('Y'),'개',end=' ')
    if  list_in_list2[i].count('Y') != 0:
        print((list_in_list2[i].count('Y')/len(list_in_list2[i]))*100,'%')
    else :
        print('0%')

print('5. 차로수별 음향신호기설치 유무 카운트/비율')
for i in range(len(road_count_setlist)) :
    print('      ',road_count_setlist[i],'차로 : ', list_in_list3[i].count('Y'),'개',end=' ')
    if  list_in_list3[i].count('Y') != 0:
        print((list_in_list3[i].count('Y')/len(list_in_list3[i]))*100,'%')
    else :
        print('0%')


# In[79]:




