'''
Fred's gross salary is 850 dollars / week. From his salary, 11% is removed for federal deductions
5.5% for state deductions and 6.2% ffor company's pension plan.. 
If each of these deductions is taken as a percent of fred's gross salary ,what is 
his net salary for a four week period. 
'''

'''
11% - federal deductions 
5.5% state 
6.2% company's pension plan 


4 weeks 

per week 

11+5.5+6.2 = 22.7%

.227* 850 = 657.05 * 4 = 2,628.2 dollars for four weeks. 
'''

grossSal = int(input('Enter gross salary for 1 week: '))
noWeeks = int(input('Enter number of weeks: '))
federalDedPercentage = float(input('Enter federal deduction %: '))
stateDedPercentage = float(input('Enter state deduction %: '))
companyPensionPercentage = float(input('Enter company pension %: '))

print('Deductions are carried out on gross Salary:')
print(f'Entered gross salary for 1 week {grossSal}')
netSalPerWeek = grossSal - ((federalDedPercentage+stateDedPercentage+companyPensionPercentage) * 0.01 * grossSal)
print(f'Total Deduction per week: {netSalPerWeek}')
print(f'Net Salary for {noWeeks} weeks is: {netSalPerWeek*noWeeks}') 



