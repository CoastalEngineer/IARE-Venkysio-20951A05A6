def reverseRecurse(string:str):
    if(len(string) == 0):
        return ""

    return reverseRecurse(string[1:])+string[0]

string = input('Enter your paragraph: ').split()
newString = ""
for i in string: 
    newString += reverseRecurse(i) + " "

print(newString.strip())
