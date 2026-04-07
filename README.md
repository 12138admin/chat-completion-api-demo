# chat-completion-api-demo
Free Chat Completion API Demo | OpenAI Compatible | DeepSeek AI
import requests

url = "https://chat-completion.p.rapidapi.com/chat/completions"

payload = {
    "model": "DeepSeek-R1-Distill-Qwen-7B",
    "messages": [{"role": "user", "content": "hello"}]
}

headers = {
    "X-API-Key": "839084ba78msh70d21f2a9311d81p1b0e1djsnf26425f9ea3d",
    "X-RapidAPI-Host": "chat-completion.p.rapidapi.com",
    "Content-Type": "application/json"
}

response = requests.post(url, json=payload)
print(response.json())
