print("enter two numbers")
line = input()
line = line.split()
num1 = int(line[0])
num2 = int(line[1])

# print(line)

ave = num1 / num2

print(round(ave,2))