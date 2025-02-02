# Selenium Test Automation - User Registration

## 📌 Project Overview
This project is a Selenium automation script for testing the user registration process on the **Automation Practice** website. It automates filling in the registration form and submitting user details using **Java** and **Selenium WebDriver**.

## 🚀 Features
- Automates the process of creating a new user account.
- Uses **XPath** and **ID locators** for element selection.
- Implements **Thread.sleep()** for synchronization.
- Registers a user with predefined details.

## 🛠️ Technologies Used
- Java  
- Selenium WebDriver  
- ChromeDriver  

## 📥 Installation and Setup

### 1️⃣ Clone the Repository  
```bash
git clone https://github.com/hosenfoqra/Selenium-Test-Automation---User-Registration.git
cd Selenium-Test-Automation---User-Registration
2. Install the required dependencies (if using Maven or Gradle):
    - **Maven**: Add the following dependency to your `pom.xml`:
      ```xml
      <dependency>
          <groupId>org.seleniumhq.selenium</groupId>
          <artifactId>selenium-java</artifactId>
          <version>3.141.59</version>
      </dependency>
      ```
      
3. Make sure that `chromedriver.exe` is located at the specified path in your code:
   ```java
   System.setProperty("webdriver.chrome.driver", "C:\\Users\\myPc\\Desktop\\chromedriver.exe");
```

### 2️⃣ Download & Set Up ChromeDriver
Download ChromeDriver from ChromeDriver Downloads
Place the chromedriver.exe in the specified path in your code.
### 3️⃣ Run the Test
Open the project in an IDE like Eclipse or IntelliJ IDEA.
Run the selenium.java file.
## 🖥️ How It Works
Opens the website: Automation Practice
Clicks on the Sign In button.
Enters an email for new account creation.
Fills in the registration form with predefined details.
Submits the form and creates a new user.
## 🔧 Possible Improvements
Replace Thread.sleep() with Explicit Waits for better performance.
Add Assertions to verify successful registration.
Use TestNG or JUnit for structured testing.
## 📜 License
This project is open-source and available for use.

🤝 Contributing
Feel free to fork this repository and submit pull requests for improvements!


