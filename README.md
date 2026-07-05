# 🤖 AI Interview Question Generator

A full-stack AI-powered web application that generates interview questions based on selected technology, experience level, and number of questions using **React, Spring Boot, and Google AI Studio (Gemini API)** with database support.

---

## 📌 Features

- 🎯 Generate interview questions using AI
- 🧠 Powered by Google Gemini AI 
- ⚛️ React frontend with responsive UI
- ☕ Spring Boot backend REST API
- 💾 Database integration for storing generated questions
- 📊 Filter by:
  - Technology (Java, React, Python, AWS, etc.)
  - Experience level (Fresher to 8+ years)
  - Number of questions
- 📄 Clean and structured question output

---

## 🛠️ Tech Stack

### Frontend
- React JS
- Bootstrap
- Axios

### Backend
- Spring Boot
- Spring Web
- Spring Data JPA
- REST API

### AI Integration
- Google AI Studio (Gemini API)

### Database
- MySQL / PostgreSQL

---

## 🏗️ Architecture

React Frontend  
      ↓  
Spring Boot REST API  
      ↓  
Google Gemini AI API  
      ↓  
Database (MySQL)

---

## 📂 Project Structure

### Frontend (React)
```
src/
 ├── components/
 │    └── InterviewQuestionGenerator.jsx
 ├── App.js
 └── index.js
```

### Backend (Spring Boot)
```
src/main/java/
 ├── controller/
 ├── service/
 ├── repository/
 ├── entity/
 └── config/
```

---


## 🔐 Environment Variables

### Backend
```
GEMINI_API_KEY=your_key
DB_URL=your_db_url
```
