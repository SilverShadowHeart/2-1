

#  Pandas DataFrame and Indexing

## From One Dimension to Two: Introducing the DataFrame

While the Pandas Series is the perfect tool for handling one-dimensional, labeled data (like a single column in a spreadsheet), most real-world datasets are two-dimensional, containing multiple columns of information for each observation. The primary data structure in Pandas for handling this tabular data is the **DataFrame**.

### Recap: The Pandas Series
A **Pandas Series** is a one-dimensional labeled array capable of holding any data type. It has two main components: the **data values** and the **index**. Think of it as a single column in a spreadsheet.
```python
import pandas as pd
# A Series with a custom index
s = pd.Series([10, 20, 30], index=['a', 'b', 'c'])
```

### The Pandas DataFrame
A **Pandas DataFrame** is a **two-dimensional, labeled data structure with columns and rows**. It is the most commonly used object in Pandas and is conceptually similar to:
-   An Excel spreadsheet.
-   An SQL table.
-   A dictionary of Series objects (where each Series is a column).

#### Key Characteristics:
-   **Heterogeneous Columns**: While each column must contain data of a single type, different columns can have different types (e.g., one column of integers, another of strings, and a third of dates).
-   **Labeled Axes**: Both the rows and columns have labels, known as the `index` and `columns` respectively.
-   **Mutable Size**: You can add or remove columns and rows from a DataFrame.

---

## The Structure of a DataFrame

A DataFrame is more than just a grid of data; it is an object with three distinct structural components that make it a powerful tool for analysis.

***
[Image: A diagram of a simple DataFrame with columns "Name", "Age", "Marks" and a default index 0, 1, 2. Arrows point to and label the three main components: The vertical labels on the left are "Index (Rows)", the horizontal labels on top are "Columns", and the grid of data in the middle is "Data Values (Cells)".]
***

1.  **The Index (Rows)**
    -   This component identifies each **observation** or row. It acts as the primary label for the horizontal axis.
    -   By default, the index is a range of integers starting from `0` (like row numbers in a spreadsheet).
    -   However, the index can be customized to use more meaningful labels, such as names, product IDs, or timestamps. A well-chosen index can significantly speed up data retrieval.

2.  **The Columns**
    -   Each column represents a **feature**, **variable**, or **attribute** of the observations.
    -   Columns have labels, often referred to as column names or headers. These labels are used to select, add, and manipulate entire columns of data.

3.  **The Data Values (Cells)**
    -   These are the actual values stored in the table at the intersection of each row and column. The data can be of various types, including numbers, strings, dates, and booleans.

### Why Use DataFrames?

-   **Intuitive Data Representation**: The tabular structure is a natural and easy way to represent and understand most datasets.
-   **Flexible Data Types**: The ability to handle mixed data types across columns is essential for real-world data.
-   **Powerful Built-in Functionality**: Pandas provides a vast library of functions for data manipulation, including:
    -   Sorting, filtering, and aggregation.
    -   Grouping data with `groupby`.
    -   Merging and joining multiple datasets.

---

## Creating a DataFrame

Pandas offers several convenient ways to create a DataFrame from various Python objects.

### From a Dictionary of Lists

This is one of the most common and intuitive methods. Each dictionary key becomes a **column name**, and the corresponding list contains the **values for that column**.

```python
import pandas as pd

# Data organized as a dictionary of lists
data = {
    'Name': ['Alice', 'Bob', 'Charlie'],
    'Age': [21, 22, 20],
    'Marks': [85, 78, 90]
}

# Create the DataFrame
df = pd.DataFrame(data)

print(df)
# Output:
#       Name  Age  Marks
# 0    Alice   21     85
# 1      Bob   22     78
# 2  Charlie   20     90
```

### From a List of Lists

In this method, each inner list represents a **row** in the DataFrame. You must explicitly provide the column names via the `columns` parameter.

```python
# Data organized as a list of lists
data = [[1, 'Alice'], [2, 'Bob'], [3, 'Charlie']]

# Create the DataFrame with specified column names
df = pd.DataFrame(data, columns=['ID', 'Name'])

print(df)
# Output:
#    ID     Name
# 0   1    Alice
# 1   2      Bob
# 2   3  Charlie
```

### From a List of Dictionaries

Here, each dictionary in the list represents a **row**. The dictionary keys are automatically used as the column names. Pandas will align the data, inserting `NaN` for any missing values.

```python
# Data organized as a list of dictionaries
data = [
    {'Name': 'Alice', 'Age': 21},
    {'Name': 'Bob', 'Age': 22},
    {'Name': 'Charlie', 'Age': 20}
]

df = pd.DataFrame(data)

print(df)
# Output:
#       Name  Age
# 0    Alice   21
# 1      Bob   22
# 2  Charlie   20
```

---

## Exploring a DataFrame

Once a DataFrame is loaded, the first step is always to explore its structure and content. Pandas provides several essential methods for this initial inspection.

Let's use the following DataFrame for exploration:
```python
data = {'Name': ['Alice', 'Bob', 'Charlie', 'David', 'Eva', 'Frank'],
        'Age': [21, 22, 20, 23, 22, 24],
        'Marks': [85, 78, 90, 95, 88, 76]}
df = pd.DataFrame(data)
```

-   **`df.head()`**: Returns the **first 5 rows** of the DataFrame. Useful for getting a quick glimpse of the data.
-   **`df.tail()`**: Returns the **last 5 rows**.
-   **`df.shape`**: Returns a tuple representing the dimensions of the DataFrame: `(number_of_rows, number_of_columns)`.
    -   `df.shape` would return `(6, 3)`.
-   **`df.columns`**: Returns the list of column names.
    -   `df.columns` would return `Index(['Name', 'Age', 'Marks'], dtype='object')`.
-   **`df.dtypes`**: Shows the data type of each column. This is crucial for verifying that data has been read correctly.
    -   `df.dtypes` would return:
        ```
        Name     object
        Age       int64
        Marks     int64
        dtype: object
        ```

---

## Indexing and Selecting Data with `.loc` and `.iloc`

Pandas provides two primary methods for selecting data, which are essential for nearly every data analysis task. It is critical to understand their distinction:

-   **`.loc[]`**: **Label-based** Indexing. Selects data based on the index labels and column names.
-   **`.iloc[]`**: **Integer-position-based** Indexing. Selects data based on its 0-indexed integer position.

Let's use a DataFrame with a custom index to highlight the difference:
```python
data = {'Name': ['Riya', 'John', 'Sara', 'Alex'],
        'Marks': [85, 91, 77, 89]}
df = pd.DataFrame(data, index=['a', 'b', 'c', 'd'])
print(df)
# Output:
#     Name  Marks
# a   Riya     85
# b   John     91
# c   Sara     77
# d   Alex     89
```

### Accessing Rows

#### 1. Single Row Selection
-   **Using `.loc` (by label)**:
    ```python
    # Select the row with index label 'c'
    print(df.loc['c'])
    ```
-   **Using `.iloc` (by position)**:
    ```python
    # Select the row at the third position (index 2)
    print(df.iloc[2])
    ```
Both commands would return the Series for 'Sara'.

#### 2. Multiple Row Selection (Slicing)
-   **Using `.loc` (slice by labels)**: The slice is **inclusive** of both the start and end labels.
    ```python
    # Select rows from label 'a' up to and including 'c'
    print(df.loc['a':'c'])
    ```
-   **Using `.iloc` (slice by positions)**: The slice is **exclusive** of the end position, just like in Python lists.
    ```python
    # Select rows from position 0 up to (but not including) position 3
    print(df.iloc[0:3])
    ```
Both commands would return the rows for 'Riya', 'John', and 'Sara'.

### Accessing Specific Cells (Row & Column)

You can select a single value by providing both the row and column specifiers.

-   **Using `.loc[row_label, column_label]`**:
    ```python
    # Get the 'Name' for the row with label 'a'
    print(df.loc['a', 'Name'])
    # Output: Riya
    ```
-   **Using `.iloc[row_index, column_index]`**:
    ```python
    # Get the value at the first row (pos 0) and second column (pos 1)
    print(df.iloc[0, 1])
    # Output: 85
    ```

### Real-World Examples of Indexing

-   **Student Records**: `df.loc['RollNumber123', 'Math_Score']` to get the math score for a specific student.
-   **Bank Transactions**: `transactions.loc['2023-10-01':'2023-10-31']` to select all transactions for October, assuming a `DatetimeIndex`.
-   **Healthcare**: `patients.loc[patient_id_456]` to retrieve the entire record for a specific patient.
-   **Sales Analysis**: `sales_df.loc[sales_df['Region'] == 'North']` to filter all sales records from the 'North' region.

