const axios = require('axios');

const url = "https://chat-completion.p.rapidapi.com/chat/completions";
const payload = {
    model: "DeepSeek-R1-Distill-Qwen-7B",
    messages: [{ role: "user", content: "Hello" }]
};
const headers = {
    "X-API-Key": "YOUR_RAPIDAPI_KEY",
    "X-RapidAPI-Host": "chat-completion.p.rapidapi.com",
    "Content-Type": "application/json"
};

axios.post(url, payload, { headers })
    .then(res => console.log(res.data))
    .catch(err => console.error(err));
