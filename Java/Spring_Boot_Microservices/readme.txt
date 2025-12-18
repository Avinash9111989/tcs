🔐 Security Flow (JWT at Gateway)

Generate Token

GET http://localhost:8080/auth/token?user=avinash


Call services via Gateway (JWT REQUIRED)

Account

GET http://localhost:8080/account-service/account
Authorization: Bearer <TOKEN>


Transaction

GET http://localhost:8080/transaction-service/transaction
Authorization: Bearer <TOKEN>


❌ Without token → 401 Unauthorized
✅ With valid token → Service response