# chat-completion-api-demo
Free Chat Completion API Demo | OpenAI Compatible | DeepSeek AI
import requests

url = "https://chat-completion.p.rapidapi.com/chat/completions"

payload = {
    "model": "DeepSeek-R1-Distill-Qwen-7B",
    "messages": [{"role": "user", "content": "hello"}]
}

headers = {
    "X-API-Key": "YOUR_RAPIDAPI_KEY",
    "X-RapidAPI-Host": "chat-completion.p.rapidapi.com",
    "Content-Type": "application/json"
}

response = requests.post(url, json=payload)
print(response.json())
