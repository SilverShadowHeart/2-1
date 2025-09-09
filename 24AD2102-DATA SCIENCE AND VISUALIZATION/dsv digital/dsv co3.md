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

note maginitude depends on the units of the