# Level-1-Android-Studio-Setup

This project demonstrates the **basic setup of Android Studio**, understanding project structure, using Logcat for debugging, and building a simple **Hello World app with a button click response** using Kotlin and Jetpack Compose.

---

## 📌 Problem Statement
Beginner developers often struggle with:
- Installing and configuring Android Studio & SDK
- Understanding the difference between emulator and real device testing
- Navigating Android project structure
- Using Logcat for debugging
- Building their first interactive app

This project addresses these challenges step by step.

---

## 🛠️ Solution Workflow
1. **Install Android Studio & SDK**  
   - Download and install Android Studio.  
   - Configure SDK paths and Gradle settings.  

2. **Emulator vs Real Device**  
   - Setup Android Emulator for quick testing.  
   - Connect and run on a physical device for real-world validation.  

3. **Project Structure**  
   - Explore `app`, `src`, `main`, `java`, `res`, and Gradle scripts.  
   - Understand separation of UI, logic, and resources.  

4. **Logcat Basics**  
   - Learn how to filter logs by tag, level, and process.  
   - Debug common issues like skipped frames or runtime errors.  

5. **Hello World App (with Button Click Response)**  
   - Create a simple UI with text and button.  
   - Implement state handling to update text when button is clicked.
   <img width="250" height="600" alt="Screenshot 2025-11-27 123503" src="https://github.com/user-attachments/assets/d55c5aea-05f6-4e82-a252-f2f5e4231afe" />
   <img width="250" height="600" alt="Screenshot 2025-11-27 123519" src="https://github.com/user-attachments/assets/7a318df7-e51a-4685-aa1d-852dbbf6bcae" />



---

## ⚙️ Tech Stack
- **Language**: Kotlin  
- **UI Framework**: Jetpack Compose  
- **IDE**: Android Studio  
- **Build System**: Gradle (KTS DSL)  
- **Testing**: Emulator & Physical Device  

---

## 🏗️ Architecture
- **UI Layer**: Composables (`Greeting`, `HomeScreen`)  
- **Activity Layer**: `MainActivity` hosting the Compose UI  
- **State Management**: `remember` for handling dynamic text updates  
- **Resources**: Organized under `res` (layouts, strings, drawables)  
- **Gradle Scripts**: For dependency management and build configuration  

---

## 📖 Relevance and Learning
By completing this project, learners will:
- Gain confidence in setting up Android Studio and SDK.  
- Understand the difference between emulator and real device testing.  
- Navigate and comprehend Android project structure.  
- Use Logcat effectively for debugging.  
- Build their first interactive app with 
