import hashlib


key = "picoCTF{1n_7h3_|<3y_of_xxxxxxxx}"


username_trial = b"FREEMAN"

hash = hashlib.sha256(username_trial).hexdigest()


dynamic=hash[4]+hash[5]+hash[3]+hash[6]+hash[2]+hash[7]+hash[1]+hash[8]

flag = key.replace("xxxxxxxx",dynamic)

print(flag)