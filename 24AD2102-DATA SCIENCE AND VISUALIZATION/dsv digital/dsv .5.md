types of data sources (first 2 preferred )
- structured eg rdbms particular about some thing  only one part (only a specific organizations)
- unstructured eg social media emails (for analysis what will happen or happened , patterns trends)
- semi structured eg xml files generally help full for storing data 

--- skipped 3 slides about the above

data collection strategies (slide 4 or 5)

 data is a fundamental step in the data science and visualization process
- the quality and relevance of the data collected data significantly impact the insights and decisions derived from analysis
- effective data collection and visualization strategies are essential extracting valuable insights and empowering data driven decision making
- it is  a dynamic process that requires continuous refinement based on user feed back and changing business needs


Data collection strategies in the context of data science and visualization
1. define clear objective
 def for all (skipped by sir)
2. identify relevant data sources
3. data quality assessment
4. consider structured and unstructured data
5. real time data collection
6. data privacy and ethics
7. sampling techniques
8. surveys and questionnaires
9. collaboration with stake holders
10. data integration


data security issues

data security is a critical concern in the field of data analysis and visualization as organization collect the .......
1. data breaches
2. data privacy
3. data access control
4. data encryption
5. data masking and redaction
6. data integrity
7. secure data sharing
8. compliance with regulation
9. awareness and training
10. data life cycle management

data pre processing overview (short or long) (1.1)

- data cleaning
		|
- data integration
		|
- data transformations
		|
- data reductions
		|
- data discretization

co2 session 2
dirty data (skipped)

forms of data preprocessing  (above 1.1)

data integrity example used amazon sales for iphones
file formats ? source systems and operating systems?? locations ?? dbms ? data cubes? aggregated/summarized information text files extracting and loading data
pre fetched data by storing what might be fetched ? repos and data ware houses

data transformations
 -1 32 100 59 48 -> -0.02 0.32 1.0 0.59 0.48
	
	data reduction   attributes 
         xx a1 a2 a3.....................    transations 
        t1
        t2
        t3
		.
		.
		.
		.
		
data reduction techniques 
importance of removal of non used attributes
no matter what both give same results( non reduced ds , reduced ds)
dirty data mentioned (revisited )
incomplete only aggregate data lack attributes value lacking certain attributes of interest
noisy containing error or outliers
 - collection
 - entry 
inconsistent containing discrepancies in code or names


Multi dimensional measure of data quality (may get a question on this)

accuracy
completeness
consistency
timeliness
believability 
value added
interpretability
accessibility

data cleaning tasks
- data acquisition and meta data
- fill in missing values
- unified date format
(more are there)

field types
- binary - two possible values 0 and 1
- nominal (categorical) - named categories without order
- ordinal - category with a specific order (eg low mid high)
- numeric - quantitative data
- nominal field handling - often includes a tables that map codes to full description (eg 1= male 2 = female)
field roles
- input  -
- target
- id/auxiliary - identifier or helpers
- ignore - fields excluded from modeling

reformatting
convert data to standard format
handle missing values
unified date format
binning of numeric data
fix errors


filling missing values and other slides skipped 

unified date format
conversion ordered to numeric etc

handling noisy data
binning method 
clustering 
combined computer and human inspection
regression 

binning methods for data smoothing (vvi)

sorted values 4 8 9 15 21 21 24 25 26 28 29 34
partitions into (equi-depth) depth bins:
 bin 1 4 8 9 15
 bin2  21 21 24 25
 bin3 26 28 29 34
smoothing by bin means:
bin 1  9 9 9 9 
bin2 23 23 23 23
bin3 29 29 29 29

smoothing bin by bin boundaries:
bin1 1 4 4 4 15
bin2 21 21 25 25
bin3 26 26 26 34

data smoothing regression
linear regression involves finding the best line to fit two attributes or variables so that attributes can be used

multiple regression

outlier analysis
outliers maybe detected by clustering for example where similar values are organized into groups or clusters

intuitively values that are outside of the    set of all ..................

correct inconsistent data


why how and what abstract
