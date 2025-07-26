## 🔹 `np.select()` — Multiple Conditions, Multiple Choices

---

### ✅ Purpose

When you have **more than one condition** to check and want to apply different results per condition (like chained `if-elif-else`).

---

### 🔹 Syntax


`np.select(condlist, choicelist, default=default_value)`

- `condlist`: list of boolean arrays
    
- `choicelist`: list of values to assign if the corresponding condition is true
    
- `default`: value to use if none of the conditions match
    

---

### 🔹 Example 1: Grade classification



`marks = np.array([95, 82, 67, 58, 40])  conditions = [     marks >= 90,     marks >= 75,     marks >= 60,     marks >= 50 ]  choices = ['A', 'B', 'C', 'D']  result = np.select(conditions, choices, default='F') print(result) # Output: ['A' 'B' 'C' 'D' 'F']`

---

### 🔹 Example 2: Numerical choices


`arr = np.array([5, 10, 15, 20])  conditions = [arr < 10, arr < 20] choices = [100, 200]  out = np.select(conditions, choices, default=300) print(out) # Output: [100 200 200 300]`

---

### ✅ When to use

- Prefer `np.select()` when:
    
    - You have **more than one condition**
        
    - You want to avoid **nested `np.where`** statements