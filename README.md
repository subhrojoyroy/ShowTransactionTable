Output

API : http://localhost:8080/transactions/getChildTransactions?parentId=1

[
    {
        "id": 1,
        "sender": "ABC",
        "receiver": "XYZ",
        "totalAmount": 200,
        "paidAmount": 10
    },
    {
        "id": 2,
        "sender": "ABC",
        "receiver": "XYZ",
        "totalAmount": 200,
        "paidAmount": 50
    },
    {
        "id": 3,
        "sender": "ABC",
        "receiver": "XYZ",
        "totalAmount": 200,
        "paidAmount": 40
    }
]

API : http://localhost:8080/transactions/allParentTransactions

[
    {
        "id": 1,
        "sender": "ABC",
        "receiver": "XYZ",
        "totalAmount": 200,
        "paidAmount": 100
    },
    {
        "id": 2,
        "sender": "XYZ",
        "receiver": "MNP",
        "totalAmount": 100,
        "paidAmount": 100
    },
    {
        "id": 3,
        "sender": "XYZ",
        "receiver": "MNP",
        "totalAmount": 300,
        "paidAmount": 260
    },
    {
        "id": 4,
        "sender": "ABC",
        "receiver": "MNP",
        "totalAmount": 1000,
        "paidAmount": 900
    },
    {
        "id": 5,
        "sender": "XYZ",
        "receiver": "ABC",
        "totalAmount": 50,
        "paidAmount": 50
    },
    {
        "id": 6,
        "sender": "MNP",
        "receiver": "PQRS",
        "totalAmount": 200,
        "paidAmount": 125
    },
    {
        "id": 7,
        "sender": "ABC",
        "receiver": "PQRS",
        "totalAmount": 200,
        "paidAmount": 0
    }
]
