curl --request POST \
  --url https://chat-completion.p.rapidapi.com/chat/completions \
  --header 'Content-Type: application/json' \
  --header 'X-API-Key: YOUR_RAPIDAPI_KEY' \
  --header 'X-RapidAPI-Host: chat-completion.p.rapidapi.com' \
  --data '{
    "model": "DeepSeek-R1-Distill-Qwen-7B",
    "messages": [{"role":"user","content":"Hello"}]
  }'
