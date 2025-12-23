
- **Base** – WebDriver setup and common test configuration
- **Pages** – Page Object classes (HomePage, ProductPage, CartPage, etc.)
- **Tests** – Test classes with TestNG annotations

---

##  Automated Test Scenarios
## 💻 Environment

- **Operating System:** Windows 10
- **IDE:** IntelliJ IDEA 2023.2.2
- **Browser:** Google Chrome
- **WebDriver:** ChromeDriver (compatible with installed Chrome version)
### 🛒 Add Product to Cart
- Opens product details
- Adds product to cart
- Verifies quantity field and checkout button visibility

### ✉ Contact Us Form
- Fills and submits the Contact Us form
- Handles JavaScript alert
- Verifies successful submission

### ⬆ Scroll Up Button
- Scrolls down to page bottom
- Uses scroll-up button
- Verifies navigation bar visibility

### 📩 Subscription
- Scrolls to footer
- Enters email for subscription
- Verifies subscription confirmation message

### 🎥 Video Tutorials Navigation
- Clicks on "Video Tutorials"
- Verifies redirection to YouTube channel

---

## ▶ How to Run Tests

1. Clone the repository
2. Open the project in IntelliJ IDEA
3. Make sure **ChromeDriver** is configured
4. Run tests using:
   ```bash
   mvn test

---

📌 Notes

Tests are written using TestNG

JavaScriptExecutor is used for scrolling

Page Object Model improves test maintainability

Assertions validate UI elements and navigation

👤 Author

Nikola Lakić