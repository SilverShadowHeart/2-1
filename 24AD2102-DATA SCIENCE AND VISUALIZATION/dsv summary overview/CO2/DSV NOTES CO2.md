<p align="center" style="font-size:24px"><b>Types of data</b></p>

### Types of Data Sources

#### **1. Structured Data**

- **Definition**: Organized in predefined formats (tables, rows, columns).
    
- **Storage**: SQL databases, CSV, Excel.
    
- **Examples**:
    
    - Customer info: Name, Age, Email
        
    - Financial data: Sales, Revenue, Profit
	
	| Name  | Age | Email             |
	|-------|-----|-------------------|
	| John  | 28  | john@email.com    |
	| Sarah | 34  | sarah@email.com   |
	| Mike  | 25  | mike@email.com    |

        
- **Processing**: Straightforward, can use SQL queries or Pandas.
    

---

#### **2. Unstructured Data**

- **Definition**: No predefined schema; raw and heterogeneous.
    
- **Storage**: Data lakes, distributed file systems, cloud storage.
    
- **Examples**:
    
    - Text: Social media posts, articles
        
    - Media: Photos, videos, audio
        
    - Sensor data without labels
	
	| Post_ID | Content                                                       |
	| ------- | ------------------------------------------------------------- |
	| 101     | "Just had the best coffee ever at the new café downtown ☕🔥" |
	| 102     | "Vacation pics from Bali 🌴🏖️"                                |
	| 103     | "Can’t believe this movie got 3 hours of my life 😑🎬"        |

	
- **Processing**: Requires NLP, computer vision, or ML techniques.
    
- **Use cases**: Image classification, speech recognition, sentiment analysis.
    

---

#### **3. Semi-structured Data**

- **Definition**: Not fully tabular but has some structure via tags/markers.
    
- **Storage**: NoSQL databases (MongoDB, CouchDB), object storage.
    
- **Examples**:
    
    - XML, JSON
        
    - Emails (headers + body)
        
    - Log files
    
	| Log_ID | Data                                                             |
	| ------ | ---------------------------------------------------------------- |
	| 1      | {"user":"alice","action":"login","time":"2025-08-19T10:30:00Z"}  |
	| 2      | {"user":"bob","action":"purchase","item":"book","price":12.99}   |
	| 3      | {"user":"carol","action":"logout","time":"2025-08-19T12:15:00Z"} |

- **Processing**: Tools like XPath, XQuery, JSON parsers.
    
- **Use case**: Flexible datasets that evolve but need organization.
    

---

<p align="center" style="font-size:24px"><b>Data Collection Strategies</b></p>

Data collection is a fundamental step in the data science and visualization process.  
The quality and relevance of the collected data significantly impact the insights and decisions derived from the analysis.  

Effective data collection and visualization strategies are essential for extracting valuable insights and enabling data-driven decision-making.  
It is a dynamic process that requires continuous refinement based on user feedback and changing business needs.  

---

#### 1) Define Clear Objectives
- Clearly outline the goals and objectives of your data analytics and visualization project.  
- Understand the questions you want to answer and the insights you aim to derive.  
- Knowing what insights you aim to gain will guide your data collection efforts.  

#### 2) Identify Relevant Data Sources
- Determine the sources of data that are relevant to your objectives (databases, spreadsheets, APIs, external datasets, etc.).  
- Identify the **key performance indicators (KPIs)** and metrics relevant to your goals.  
- These metrics will drive the selection of data sources and variables.  

#### 3) Data Quality Assessment
- Assess the quality of available data: completeness, accuracy, consistency, and relevance.  
- Perform cleaning and preprocessing to resolve quality issues.  

#### 4) Consider Structured and Unstructured Data
- Collect both structured data (e.g., databases, spreadsheets) and unstructured data (e.g., text, images) for comprehensive analysis.  

#### 5) Real-time Data Collection
- If real-time insights are required, implement systems for collecting and processing data continuously.  
- This is critical for dynamic datasets.  

#### 6) Data Privacy and Ethics
- Ensure compliance with data privacy regulations.  
- Obtain permissions when dealing with personal or sensitive information.  

#### 7) Sampling Techniques
- Use sampling when working with very large datasets.  
- Select a representative subset to reduce time and resource costs while maintaining reliability.  

#### 8) Surveys and Questionnaires
- Design and deploy surveys or questionnaires to gather targeted information from users or stakeholders.  
- Ensure questions are aligned with project objectives.  

#### 9) Collaboration with Stakeholders
- Work with domain experts and stakeholders to understand data context.  
- Their input helps refine data collection strategies.  

#### 10) Data Integration
- Integrate data from multiple sources into a unified dataset.  
- Ensure compatibility and consistency across platforms.  

---

<p align="center" style="font-size:24px"><b> Data Security in Data Analysis and Visualization</b></p>


Data security is a critical concern in the field of data analysis and visualization.  
As organizations collect and analyze large volumes of data to gain insights and make informed decisions, they also face significant challenges related to the security and privacy of this data.  



#### 1) Data Breaches
- One of the most significant concerns is the potential for unauthorized access.  
- Breaches can cause **financial losses, reputational damage, and legal consequences**.  

#### 2) Data Privacy
- Protecting the privacy of individuals is crucial, especially with **personally identifiable information (PII)**.  
- Techniques such as **anonymization** and **differential privacy** mitigate risks when analyzing or visualizing sensitive data.  

#### 3) Data Access Control
- Strict access controls are necessary to limit access to sensitive datasets.  
- **Role-Based Access Control (RBAC)** and other protocols regulate who can view, edit, or analyze data.  

#### 4) Data Encryption
- Data must be encrypted both **in transit** and **at rest**.  
- Encryption ensures intercepted or stolen data remains unreadable without decryption keys.  

#### 5) Data Integrity
- Data should remain unaltered during storage, analysis, and visualization.  
- **Checksums** and **digital signatures** detect unauthorized changes.  

#### 6) Secure Data Sharing
- Organizations often need to share data with external partners or vendors.  
- Secure methods include **SFTP**, **secure APIs**, or even **blockchain** for ensuring safe transfers.  

#### 7) Data Masking and Redaction
- When sharing sensitive data, masking or redacting replaces, encrypts, or removes critical information.  
- This allows analysis without exposing private details.  

#### 8) Compliance with Regulations
- Organizations must comply with laws such as **GDPR (EU)** or **HIPAA (US)**.  
- Non-compliance can result in heavy fines and legal action.  

#### 9) Awareness and Training
- Human error is a major cause of breaches.  
- Regular **training and awareness programs** help employees understand and uphold security responsibilities.  

#### 10) Data Lifecycle Management
- Data must be managed securely throughout its lifecycle: **storage, archival, and deletion**.  
- Outdated or unused data, if not securely removed, becomes a potential security risk.  

---
<p align="center" style="font-size:24px"><b>Data Pre-Processing Overview in Data Science & Visualization (DSV)</b></p> 

Effective data collection is the foundation of meaningful analytics and visualization.  
**Data pre-processing** is a crucial step that involves cleaning, transforming, and organizing raw data into a usable format for analysis and visualization.  

The main steps are:  
- Data Cleaning  
- Data Integration  
- Data Transformation  
- Data Reduction  
- Data Discretization  

```mermaid
flowchart TD
    A[Data Preprocessing] --> B[Data Cleaning]
    B --> C[Data Integration]
    C --> D[Data Transformation]
    D --> E[Data Reduction]
    E --> F[Data Discretization]
```


---

#### 1) Data Cleaning


- Process of detecting and correcting **incomplete, inaccurate, inconsistent, or irrelevant data**.
    
- Techniques: modify or remove corrupt/unusable records.
    
- **Goal:** Ensure high-quality data before further processing.
    

**Importance:**

- "Data cleaning is one of the three biggest problems in data processing." — _Ralph Kimball_
    
- "Data cleaning is the number one problem in data processing." — _DCI Survey_
    

**Typical Tasks:**

- Fill in **missing values** (e.g., mean, median, interpolation).
    
- Identify **outliers** and smooth noisy data (e.g., binning, regression).
    
- Correct **inconsistent data** (e.g., conflicting codes, formats).
    
- Resolve **redundancy** from data integration (e.g., duplicates).


# 1. Data Acquisition
- Data can be in DBMS
- ODBC, JDBC protocols
- Data in a flat file
  - Fixed-column format
  - Delimited format: tab, comma, other
- Example: C4.5 and Weka `arff` use comma-delimited data
- Attention: Convert field delimiters inside strings
- Verify the number of fields before and after

# 2. Metadata
- **Field types:**
  - binary, nominal (categorical), ordinal, numeric
- **For nominal fields:** tables translating codes to full descriptions
- **Field role:**
  - input: inputs for modelling
  - target: output
  - id/auxiliary: keep, but not use for modelling
  - ignore: don't use for modelling
  - weight: instance weight
- Field descriptions

# 3. Reformatting
- Convert data to a standard format (e.g. arff or csv)
- Handle missing values
- Unified date format
- Binning of numeric data
- Fix errors and outliers
- Convert nominal fields whose values have order to numeric

# 4. Fill in Missing Values
- Data is not always available  
  Example: many tuples have no recorded value for several attributes (e.g. customer income in sales data)
- **Reasons for missing data:**
  - Equipment malfunction
  - Inconsistent data deleted
  - Data not entered due to misunderstanding
  - Certain data not considered important at entry
  - No history or changes recorded
- Missing data may need to be inferred

## Handling Missing Data
- Ignore the tuple (common if class label is missing, but not effective with uneven missingness)
- Fill in manually (tedious, infeasible)
- Use a global constant (e.g. "unknown")
- Imputation:
  - Use attribute mean for all data
  - Use attribute mean within the same class (smarter)
- Use the most probable value (e.g. Bayesian formula, decision tree)

# 5. Unified Date Format
- Transform all dates to the same internal format
- Examples of input: "Sep 24, 2003", `9/24/03`, `24.09.03`
- Internal transformation standardizes dates
- Often only year (YYYY) is sufficient; sometimes need month, day, hour
- Representing as YYYYMM or YYYYMMDD works but has issues

## Unified Date Format Options
- Unix system date: seconds since 1970
- SAS format: days since Jan 1, 1960

**Problem:**  
- Values are non-obvious  
- Poor for intuition and knowledge discovery  
- Harder to verify, easier to make mistakes

# 6. Conversion: Nominal to Numeric
- Some tools handle nominal internally
- Others (neural nets, regression, nearest neighbor) require numeric inputs
- Thus, nominal fields must be converted

**Why not ignore nominal fields?**  
- They may contain valuable information

**Strategies:**
- Binary fields: map to {0,1}
- Ordered nominal: map to integers preserving order
- Multi-valued nominal: one-hot encoding or similar


# 7. Conversion: Binary to Numeric
- **Binary fields:** e.g. Gender = M, F
- Convert to {0,1} values
  - Example: Gender = M → 0, Gender = F → 1

# 8. Conversion: Ordered to Numeric
- Ordered attributes (e.g. Grade) converted while preserving order:
  - A → 4.0
  - A- → 3.7
  - B+ → 3.3
  - B → 3.0
- **Why preserve order?**
  - To allow meaningful comparisons (e.g. Grade > 3.5)

# 9. Identify Outliers and Smooth Noisy Data
- **Noise:** random error or variance in measured variables
- Incorrect values may be due to:
  - Faulty instruments
  - Data entry problems
  - Transmission errors
  - Technology limitations
  - Naming inconsistencies
  - Other issues (duplicates, incomplete/inconsistent data)

## Handling Noisy Data
- **Binning method:**
  - Sort data, partition into bins
  - Smooth by bin means, medians, or boundaries
- **Clustering:** detect/remove outliers
- **Computer + human inspection:** flag suspicious values
- **Regression:** smooth by fitting regression functions

# 10. Simple Discretization: Binning
- **Equal-width (distance) partitioning:**
  - Divide range into N equal intervals
  - Interval width = (B-A)/N
  - Simple but sensitive to outliers and skewed data
- **Equal-depth (frequency) partitioning:**
  - Divide range into N intervals with ~same number of samples
  - Better scaling, but categorical attributes tricky

## Binning Example
Sorted values: 4, 8, 9, 15, 21, 21, 24, 25, 26, 28, 29, 34

- **Bins (equi-depth):**
  - Bin 1: 4, 8, 9, 15
  - Bin 2: 21, 21, 24, 25
  - Bin 3: 26, 28, 29, 34
- **Smoothing by means:**
  - Bin 1 → 9, 9, 9, 9
  - Bin 2 → 23, 23, 23, 23
  - Bin 3 → 29, 29, 29, 29
- **Smoothing by boundaries:**
  - Bin 1 → 4, 4, 4, 15
  - Bin 2 → 21, 21, 25, 25
  - Bin 3 → 26, 26, 26, 34

# 11. Data Smoothing: Regression
- **Linear regression:** fit best line to two variables → predict one from the other
- **Multiple regression:** extension with >2 variables, fit to multidimensional surface

# 12. Data Smoothing: Outlier Analysis
- Outliers detected via clustering
- Values outside clusters considered outliers

# 13. Correct Inconsistent Data
- Inconsistencies caused by:
  - Entry errors
  - Different conventions between sources
  - Format changes over time
- Leads to inaccurate analysis/modelling
- **Techniques:**
  - Data cleaning
  - Standardization
  - Validation
- Tasks: correct spelling errors, reconcile conflicts, convert units to consistent scale

---

#### 2) Data Integration
- Focuses on **combining data from different sources** into a unified view.  
- Resolves conflicts arising from different data representations.  
- Critical in large-scale scientific and commercial applications where **data volume grows exponentially**.  

# Data Integration

Process of combining multiple sources into a single dataset. Challenges include:

1. **Entity Identification Problem**  
    Identify real-world entities across databases (e.g., student ID vs. student name).
    
2. **Schema Integration**  
    Combine metadata from different sources while resolving conflicts.
    
3. **Data Value Conflicts**  
    For the same entity, attribute values may differ due to different representations or scales (e.g., metric vs. British units).
    

**Handling Redundant Data**

- Redundancy occurs when attributes have different names or are derived differently across sources.
    
- Can be detected via correlation analysis.
    
- Careful integration reduces redundancy, inconsistency, and improves mining efficiency.
    

---



# Data Reduction

Reduce data volume while preserving analytical results. Techniques:

1. **Dimensionality Reduction**
    
    - Remove irrelevant or redundant attributes.
        
    - Methods: PCA, Discrete Wavelet Transform (DWT), attribute subset selection.
        
2. **Data Compression**
    
    - Lossless (string/text) or lossy (audio/video).
        
    - Reduces storage and improves processing speed.
        
3. **Numerosity Reduction**
    
    - **Parametric:** model-based, store parameters.
        
    - **Non-parametric:** histograms, clustering, aggregation, sampling, data cubes.
        
4. **Discretization and Concept Hierarchy Generation**
    
    - Convert continuous attributes into discrete intervals or hierarchies.
        



## Dimensionality Reduction Methods

- **Wavelet Transform (DWT):** transform data vector to wavelet coefficients.
    
- **Principal Component Analysis (PCA):** project k-dimensional data to c < k principal components.
    
- Remove attributes with low variability or mostly constant values (e.g., < 0.5–5% variation).

# Parametric Methods: Regression and Log-Linear Models

- **Linear Regression**  
    Models data with a straight line; typically uses the least-squares method.  
    Formula: Y=μ+βXY = \mu + \beta XY=μ+βX
    
    - Parameters μ\muμ and β\betaβ are estimated from the data.
        
- **Multiple Regression**  
    Models a response variable YYY as a linear function of multiple features:  
    Y=b0+b1X1+b2X2+…Y = b_0 + b_1 X_1 + b_2 X_2 + \dotsY=b0​+b1​X1​+b2​X2​+…  
    Many nonlinear functions can be transformed into this form.
    
- **Log-Linear Models**  
    Approximate discrete multidimensional probability distributions.  
    Joint probabilities are modeled as a product of lower-order tables:  
    P(a,b,c,d)≈uabPacuadBbcdP(a,b,c,d) \approx u_{ab} P_{ac} u_{ad} B_{bcd}P(a,b,c,d)≈uab​Pac​uad​Bbcd​
    



# Non-Parametric Methods

## Histograms

- Data is divided into buckets, storing averages or sums for each.
    
- Optimal construction in 1D can use dynamic programming.
    
- Related to quantization.
    

## Clustering

- Partition data into clusters; store cluster representation.
    
- Effective when data is naturally clustered.
    
- Can use hierarchical clustering and multi-dimensional index trees.
    
- Multiple clustering definitions and algorithms exist.
    

## Sampling

- Select representative subsets to reduce computational complexity.
    
- **Simple random sampling:** may perform poorly with skewed data.
    
- **Stratified sampling:** maintains class proportions in skewed datasets.
    
- Does not necessarily reduce I/O costs.
    



# Data Cube Aggregation

- Multidimensional aggregation to reduce data volume.
    
- Example: Quarterly electronics sales from 2018–2022 can be aggregated annually by summing quarters:
    

|Year|Annual Sales|
|---|---|
|2018|$1,568,000|
|2019|$3,594,000|
|2020|$2,568,000|

- Aggregated views reduce complexity while preserving information.
---

#### 3) Data Transformation
- Converts raw data into an **understandable and structured form**.  
- Key techniques:  
  - **Normalization**: minimize redundancy in tables/columns → improves efficiency.  
  - **Aggregation**: create summaries for faster insights.  
  - **Generalization (Rolling-up)**: form higher-level abstractions and layered summaries.  


# Data Transformation

Convert or consolidate data into forms suitable for mining. Key strategies:

1. **Smoothing**  
    Remove noise from data using statistical methods or algorithms.
    
2. **Aggregation**  
    Summarize data, construct data cubes, or combine multiple records into metrics.
    
3. **Generalization**  
    Transform low-level attributes into high-level concepts using hierarchies (e.g., street < city < state < country).
    
4. **Normalization**  
    Scale values within a small range:
    
    - Min-Max normalization
        
    - Z-score normalization
        
    - Decimal scaling
        
5. **Attribute/Feature Construction**  
    Create new features from existing ones (e.g., area = height × width).
    



## Data Smoothing

- Eliminates outliers to highlight patterns.
    
- Methods: random smoothing, moving averages, regression.
    
- Helps forecast trends but may reduce detail in the dataset.
    

## Data Aggregation

Steps:

1. Identify sources (databases, spreadsheets, APIs).
    
2. Extract data (ETL or API).
    
3. Cleanse (remove errors, duplicates).
    
4. Combine into a warehouse or data lake.
    
5. Summarize metrics (sum, average, count).
    
6. Analyze for insights.
    

## Data Generalization

- Used for categorical data with many values.
    
- Example hierarchy: street < city < state < country.
    

## Normalization

- **Min-Max:** v′=(v−min⁡A)(max⁡A−min⁡A)×(new_max−new_min)+new_minv' = \frac{(v - \min A)}{(\max A - \min A)} \times (new\_max - new\_min) + new\_minv′=(maxA−minA)(v−minA)​×(new_max−new_min)+new_min
    
- **Z-score:** v′=(v−mean)std_devv' = \frac{(v - \text{mean})}{\text{std\_dev}}v′=std_dev(v−mean)​
    
- **Decimal scaling:** scale by powers of 10 to bring values into range.
    

## Attribute/Feature Construction

- Generate new attributes from existing ones (e.g., calculate area from height and width).
    



---

#### 4) Data Reduction
- Transforms large datasets into **smaller, meaningful fragments** without major information loss.  
- Simplifies processing and reduces storage/analysis complexity.  
- Often derived through **empirical and experimental methods**.  

---

#### 5) Data Discretization
- Converts **continuous numeric data** into **discrete categories/intervals**.  
- Helps when classification is needed based on nominal values.  
- Aim: achieve simplification with **minimal loss of information**.  


# Data Preprocessing

## Why?
Data in the real world is **dirty**:
- **Incomplete**: Missing values, missing attributes of interest, or only aggregate data.  
  *Example: `occupation =` (empty)*  
- **Noisy**: Contains errors or outliers.  
  *Example: `Salary = "- I O"`*  
- **Inconsistent**: Discrepancies in codes or names.  

---

## Sources of Dirty Data

### Incomplete Data
- **n/a values during collection** → Customer survey with `age = n/a`.  
- **Time mismatch between collection and analysis** → Sales data collected daily, but product prices updated monthly → mismatch.  
- **Human, hardware, or software errors** → Sensor stops recording halfway; missing half of temperature readings.  



### Noisy Data
- **Errors in collection** → Microphone picks up static noise instead of clear speech.  
- **Data entry mistakes** → Typing `50000O` instead of `500000` for salary.  
- **Transmission issues** → GPS location gets scrambled during satellite signal loss.  



### Inconsistent Data
- **Conflicts between multiple data sources** → One database has `DOB = 1999-05-10`, another has `DOB = 1998-10-05`.  
- **Functional dependency violations** → `ZIP code = 560001` but `City = Hyderabad` (mismatch; 560001 belongs to Bangalore).  
---

## Importance of Data Preprocessing
- **No quality data → No quality mining results**  
- Quality decisions demand quality data  
  - Duplicate/missing values → Incorrect or misleading statistics  
- Data warehouse requires consistent integration of quality data 
- Data Extraction, cleaning, and transformation = **majority of the work** in building a data warehouse  


---

## Multi-Dimensional Measure of Data Quality

### Core Dimensions
- **Accuracy** → Value correctly represents the real-world fact.  
  *Ex: Recorded temperature = 25°C, actual = 25°C.*  

- **Completeness** → All required data is present.  
  *Ex: Customer record missing phone number → incomplete.*  

- **Consistency** → No contradictions across datasets.  
  *Ex: `DOB = 2000-01-01` in one table, `DOB = 1999-12-31` in another → inconsistent.*  

- **Timeliness** → Data is up-to-date.  
  *Ex: Stock price updated hourly vs real-time feed.*  

- **Believability** → Data is credible and trustworthy.  
  *Ex: Sales data from official ERP vs. an unverified Excel sheet.*  

- **Value Added** → Data contributes to decision-making.  
  *Ex: Adding “Customer Lifetime Value” helps marketing strategy.*  

- **Interpretability** → Data is easy to understand.  
  *Ex: Column named `salary_in_usd` vs. `sal1`.*  

- **Accessibility** → Data is available when needed.  
  *Ex: Secure API access vs. locked in a local machine file.*  

---

### Broad Categories
- **Intrinsic** → Accuracy, Believability, Objectivity.  
- **Contextual** → Completeness, Timeliness, Value Added, Relevance.  
- **Representational** → Interpretability, Consistency, Ease of understanding.  
- **Accessibility** → Accessibility, Security. 