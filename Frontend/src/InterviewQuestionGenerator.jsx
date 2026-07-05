import axios from 'axios';
import React, { useState } from 'react';

export default function InterviewQuestionGenerator() {

    let [technology, settechnology] = useState("")
    let [experiencelevel, setexperiencelevel] = useState("")
    let [questioncount, setquestioncount] = useState(0)
    let [questions, setquestions] = useState("")

    let generatequestions = (event) => {
        event.preventDefault();
        let input = { technology, experiencelevel, questioncount }
        axios.post("http://localhost:8080/save", input)
            .then((response) => {
                setquestions(response.data)
            })
            .catch((error) => {
                alert("Error in post operation")
            })

    }

    return (
        <div className="container py-5">

            <div className="row justify-content-center">
                <div className="col-lg-8">

                    <div className="card shadow-lg border-0 rounded-4">

                        <div
                            className="card-header text-white text-center py-4"
                            style={{ background: "#4B49AC" }}
                        >
                            <h2 className="mb-0">🤖 AI Interview Question Generator</h2>
                        </div>

                        <div className="card-body p-4">

                            <form onSubmit={generatequestions}>

                                <div className="mb-3">
                                    <label className="form-label fw-bold">
                                        Select Technology
                                    </label>

                                    <select
                                        className="form-select"
                                        onChange={(e) => settechnology(e.target.value)}
                                    >
                                        <option>Select Technology</option>
                                        <option value="Java">Java</option>
                                        <option value="Spring boot">Spring Boot</option>
                                        <option value="React JS">React JS</option>
                                        <option value="Python">Python</option>
                                        <option value="HTML">HTML</option>
                                        <option value="CSS">CSS</option>
                                        <option value="Angular">Angular</option>
                                        <option value="SQL">SQL</option>
                                        <option value="AWS">AWS</option>
                                        <option value="Microservices">Microservices</option>
                                    </select>
                                </div>

                                <div className="mb-3">
                                    <label className="form-label fw-bold">
                                        Experience Level
                                    </label>

                                    <select
                                        className="form-select"
                                        onChange={(e) => setexperiencelevel(e.target.value)}
                                    >
                                        <option>Select Experience</option>
                                        <option value="Freshers">Freshers</option>
                                        <option value="1-2 years">1-2 Years</option>
                                        <option value="3-5 years">3-5 Years</option>
                                        <option value="5-8 years">5-8 Years</option>
                                        <option value="8+ years">8+ Years</option>
                                    </select>
                                </div>

                                <div className="mb-4">
                                    <label className="form-label fw-bold">
                                        Number of Questions
                                    </label>

                                    <select
                                        className="form-select"
                                        onChange={(e) => setquestioncount(e.target.value)}
                                    >
                                        <option>Select Number</option>
                                        <option value="5">5</option>
                                        <option value="10">10</option>
                                        <option value="15">15</option>
                                        <option value="20">20</option>
                                        <option value="25">25</option>
                                        <option value="30">30</option>
                                        <option value="35">35</option>
                                    </select>
                                </div>

                                <div className="d-grid">
                                    <button
                                        type="submit"
                                        className="btn btn-warning btn-lg fw-bold"
                                    >
                                        🚀 Generate Questions
                                    </button>
                                </div>

                            </form>

                        </div>

                    </div>

                    {questions && (
                        <div className="mt-5">

                            <h3 className="text-center mb-4">
                                Generated Interview Questions
                            </h3>

                            {questions.split("\n").map((q, index) => (
                                q.trim() && (
                                    <div
                                        key={index}
                                        className="card shadow-sm border-0 mb-3"
                                    >
                                        <div className="card-body">
                                            <h6 className="text-primary">
                                                Question {index + 1}
                                            </h6>

                                            <p className="mb-0">
                                                {q}
                                            </p>
                                        </div>
                                    </div>
                                )
                            ))}

                        </div>
                    )}

                </div>
            </div>

        </div>
    );

}
