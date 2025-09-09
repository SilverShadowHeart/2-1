skewness pearson's median skewness 

what is skew ness
skewness quantifies the asymmetry of a probability distribution around its mean it tells us which way the distribution leans and how pronounced that lean is 

when analyzing data skewness help us understand 

if outliers tend to appear in a particular direction
how central tendency measures relate to each other
what transformations might normalize our data 


types of skewness: visual and concept overview


# negative skewness 
tail extends to the left

mean < median < mode

example exam scores in an easy test 

note : a diagram 
# zero skewness
symmetrical distribution in a homogeneous population 

mean = median = mode 

example height distribution in a homogeneous population
note : a diagram 
# positive skew
tail extends to  the right
mean > median > mode 

example income distribution 
note : a diagram 

# why skewness matters in data science 

## model validity

many statistical methods (t tests , anova , linear regression ) for normally distributed data skewed data can invalidate these assumptions 

## feature engineering 
helps identify when and how to transform variables (log, square root box cox) to improve model performance 

## risk assessment
in finance and insurance understanding skewness is crucial for accurate risk modeling and portfolio management 

measuring skewness pearsons mode skewness

when to use 
best for distribution with a strong  identifiable mode wehre  the most frequent value is clearly  visible in data

adantages 
intuitive interpertaion
directly relates to the visual peak of distribution
works well for uni model distribution 

formula  

mean - mode 
----
standard deviation 


example  

data  30 35 40 40 45 50 55 60 65 90
mean 
mode
median

apply formula 


mean > mode right skewed 
mean  < mode left skewed
mean = mode symmetrical 


measuring skewness Pearson's median skewness

formula 


skewness = 3(mean - median)/(standard deviation )

the coefficient 3 scale the results to make it more comparable with other 3 skewness


when to use 
preferred when 
mode is difficult to determine
data is multimodal (multiple peaks)
working with continuous data where exact mode is ambiguous 

advantages
more robust then mode skewness for
small sample sizes
real world messy data
distribution with outliers

practical example interpreting pearsons median skewness

exam score data set 

given information

mean = 70
median score = 65
standard deviation = 10

calculation 


skewness = 3(70-65)/(10) =








estimation and correlation in statistical analysis 

a guide to understanding sample statistical and their relationship to population parameters


introduction to estimation 
estimation in statistics is the process of using sample data to make educated guesses about unknown population parameters

why is it important 

pratically impossible/ costly to measure entire population 
decision making provides crucial information for business research policy 

uncertainity qualificatio -- --



what is estimation 
the process of inferring characterstics of an entire population based on a representative subjedct sample


sample vs population 

population the entire group of individuals or items we want to study 


population

 missed---- 
mean 
median
variance 
standard deviation



sample variance 

formula for variance 

def 


why n-1 Bessel's correction 

when calculating variance form a  -- - -- - -

interpretation 
high variance and low variance meaning 


sample co variance 

co variance formula 

def

sample covariance measures the degree to which two variables change together in a sample indicates the 


interpretation 

positive co relation 
negative co relation 
covariance near zero 

note magnitude depends on the units of the variables making it difficult to compare for a standardized measure we use correlation 


correlation understanding relationships

what is correlation correlation is a stat measure that expresses the extent to which two variables are linearly related 


correlation coefficient r

a number between -1 and 1 tells you the strength and direction and relationship between variables


r = 0 
r = 1  perfect pos 
r = -1 perfect neg

note : a diagrams of all correlations 


types of correlation and common coefficients

direction 
positive 
negative 
zero

relationship form 
linear straight line 
non linear curve line
common coefficients

Pearson's
spearman's
Kendall's





went back to experiment 5

explained about read_csv
df = data frame 
it consists this data
now the df is having the data

df.columns.str.lower().str.strip().str.replace(" ","_")

we are converting all column names to lower case then we are stripping out the white space then we are replaing any white space with underscore


we are dropping the rows from employee id explained about dropna

to_numeric explained errors coerce
explaining data filtering 
explained describe 

to_datetime 
dt.year
dt.date

explained about head()

explained merge command 
talked about left outer join

he talked about shape command 


