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

	 | Post_ID | Content                                                                 |
|---------|-------------------------------------------------------------------------|
| 101     | "Just had the best coffee ever at the new café downtown ☕🔥"            |
| 102     | "Vacation pics from Bali 🌴🏖️"                                          |
| 103     | "Can’t believe this movie got 3 hours of my life 😑🎬"                   |
	
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
        
- **Processing**: Tools like XPath, XQuery, JSON parsers.
    
- **Use case**: Flexible datasets that evolve but need organization.
    

---

