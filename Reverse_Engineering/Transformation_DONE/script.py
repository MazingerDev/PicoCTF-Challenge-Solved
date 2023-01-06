
flag = '灩捯䍔䙻ㄶ形楴獟楮獴㌴摟潦弸彥ㄴㅡて㝽'

# origin encrypt code flag  >> japanese

#''.join(
#    [chr(
#        (ord(flag[i]) << 8) shifting number of unicode 8 digint for exmaple if we have "1110000" >> "111000000000000"
#        + 
#        ord(flag[i + 1]) add unicode number second char in flag with shiftring one ex "111000000000000" +"1101001" >> "111000001101001"
#        ) for i in range(0, len(flag), 2)  regular for loop 
#    ]
#)





print(flag) # print encrypted flag


# decrypt section 


decrypted = []
for i in range(0,len(flag)):
    first_char_value = ord(flag[i] ) >> 8 # shiftring first unicode with 8 digit ex. "111000001101001" >>"1110000"
    first_char = chr(first_char_value) # cast it to char
    second_char_value = ord(flag[i]) - (first_char_value << 8) # second char "111000001101001" -"111000000000000" >>"1101001"
    second_char = chr(second_char_value)

    # append to cahr list
    decrypted.append(first_char)
    decrypted.append(second_char)


decrypted_flag = ''.join(decrypted)

print(decrypted_flag)

    
