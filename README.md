# RestUP 🌙 - Sleep Quality Monitoring App

<p align="left">
  <img src="https://cdn.jsdelivr.net/gh/devicons/devicon@latest/icons/android/android-original.svg" height="40" alt="Android" />&nbsp;
  <img src="https://cdn.jsdelivr.net/gh/devicons/devicon@latest/icons/kotlin/kotlin-original.svg" height="40" alt="Kotlin" />&nbsp;
  <img src="https://cdn.jsdelivr.net/gh/devicons/devicon@latest/icons/scikitlearn/scikitlearn-original.svg" height="40" alt="Machine Learning (Scikit-Learn)" />
</p>

Welcome to the official repository for **RestUP**, an Android application designed to track and analyze your sleep habits. This project was developed as part of an undergraduate thesis (*Skripsi*) at Universitas Pembangunan Nasional (UPN) Veteran Jakarta: **"Sleep Quality Classification using Random Forest"**.

## 📖 About The Project

RestUP is a sleep monitoring application that leverages Machine Learning to help users understand their sleep patterns. By combining daily sleep tracking with a morning survey, the app utilizes a trained Random Forest algorithm to accurately classify sleep quality. It also features educational content on sleep hygiene, a calculator to monitor sleep debt, and provides a quick access gateway to consult with medical experts via telemedicine platforms like Halodoc.

## ✨ Key Features

*   📊 **Sleep Quality Classification**: Uses a custom-trained Random Forest model (`SleepQualityClassifier.java`) to analyze tracking data and survey responses to predict your sleep quality.
*   ⏰ **Sleep Tracker & Morning Survey**: Log your sleep schedules and capture subjective waking conditions for accurate ML predictions.
*   🧮 **Sleep Debt Calculator**: Automatically calculates your accumulated sleep debt to help you catch up on missed rest.
*   📚 **Sleep Education**: A library of curated articles to help you learn better sleep practices and understand your sleep health.
*   👨‍⚕️ **Expert Consultation**: Built-in integration to seamlessly connect with healthcare professionals via telemedicine apps (e.g., Halodoc) for further medical advice.
*   📈 **History & Results**: View detailed logs and analytics of your past sleep records.

## 🛠️ Tech Stack & Architecture

**Mobile Development (Android)**
*   **Language**: Kotlin
*   **Architecture**: MVVM (Model-View-ViewModel)
*   **UI/UX**: XML Layouts & Material Design Components
*   **Libraries**: Glide (Image loading), Retrofit (Network requests), Room/Preferences (Local storage)

**Machine Learning**
*   **Algorithm**: Random Forest Classifier
*   **Model Training**: Python, Scikit-Learn (`Machine_Learning_Code.ipynb`)
*   **On-Device ML**: Model ported/exported to a custom Java classifier for fast, offline inference on the Android device.

## 📂 Project Structure

```text
├── app/src/main/java/com/dicoding/restupskripsirafierojagatbachri/
│   ├── data/           # Repositories and Data Models (SleepRecord, etc.)
│   ├── di/             # Dependency Injection modules
│   ├── ui/             # UI Components (Activities, Fragments, ViewModels)
│   │   ├── auth/       # Login & Register
│   │   ├── calculator/ # Sleep Debt Calculator
│   │   ├── consultation/ # Telemedicine Consultation feature
│   │   ├── education/  # Article lists and details
│   │   ├── history/    # Sleep history logs
│   │   ├── home/       # Main Dashboard
│   │   ├── result/     # ML Classification Results
│   │   └── tracker/    # Sleep Tracking & Morning Survey
│   └── utils/          # Helpers and the SleepQualityClassifier.java
├── Machine_Learning_Code.ipynb  # Jupyter Notebook containing model training and evaluation
└── build.gradle.kts             # Gradle build configurations
```

## 🚀 Getting Started

To build and run this project locally on your machine, follow these steps:

### Prerequisites
*   [Android Studio](https://developer.android.com/studio) (Latest version recommended)
*   Android SDK (API Level 24+)
*   Git

### Installation
1.  Clone this repository:
    ```bash
    git clone https://github.com/your-username/Sleep-Quality-Monitoring-App-using-Random-Forest.git
    ```
2.  Open the project in **Android Studio**.
3.  Allow Gradle to sync and download the necessary dependencies.
4.  Connect an Android emulator or a physical device via USB debugging.
5.  Click the **Run** button (▶️) in Android Studio to build and install the app.

## 🧑‍💻 Author

**Rafie Rojagat Bachri**
*   Informatics Student at Universitas Pembangunan Nasional (UPN) Veteran Jakarta
*   Bangkit Academy 2024 Alumnus (Mobile Development Path)

---
*Developed for Undergraduate Thesis (Skripsi) Purposes.*
