<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="id">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Program 2 - Persamaan Kuadrat</title>
    <style>
        body {
            margin: 0; padding: 24px; background: #f3f4f6;
            font-family: Arial, sans-serif; color: #1f2937;
        }
        .container {
            max-width: 600px; margin: 0 auto; background: #ffffff;
            border-radius: 12px; box-shadow: 0 8px 24px rgba(15,23,42,0.08); padding: 28px;
        }
        form {
            margin: 16px 0; padding: 16px; border: 1px solid #d1d5db;
            border-radius: 8px; background: #f8fafc;
        }
        label { display: block; margin-bottom: 8px; font-weight: 600; }
        input[type="number"] {
            width: 100%; padding: 10px; border: 1px solid #9ca3af;
            border-radius: 6px; margin-bottom: 16px; box-sizing: border-box;
        }
        button {
            background: #2563eb; color: #fff; border: none;
            border-radius: 6px; padding: 10px 14px; cursor: pointer; width: 100%;
            font-weight: bold; font-size: 16px;
        }
        button:hover { background: #1d4ed8; }
        .result {
            margin-top: 16px; padding: 16px; border-radius: 8px;
            background: #eff6ff; border-left: 4px solid #1d4ed8; line-height: 1.6;
        }
        .nav-link {
            display: inline-block; margin-top: 24px; color: #2563eb;
            text-decoration: none; font-weight: bold;
        }
        .nav-link:hover { text-decoration: underline; }
    </style>
</head>
<body>
<main class="container">
    <h1>Persamaan Kuadrat</h1>
    <p>Masukkan nilai a, b, dan c untuk mencari akar-akar persamaan kuadrat ($ax^2 + bx + c = 0$).</p>

    <form action="${pageContext.request.contextPath}/persamaan-kuadrat" method="post">
        <label for="a">Nilai a:</label>
        <input id="a" name="a" type="number" step="any"
               value="${a != null ? a : ''}" required />

        <label for="b">Nilai b:</label>
        <input id="b" name="b" type="number" step="any"
               value="${b != null ? b : ''}" required />

        <label for="c">Nilai c:</label>
        <input id="c" name="c" type="number" step="any"
               value="${c != null ? c : ''}" required />

        <button type="submit">Hitung Akar Kuadrat</button>
    </form>

    <c:if test="${not empty resultMessage}">
        <div class="result">
            <strong>Hasil Perhitungan:</strong><br><br>
                ${resultMessage}
        </div>
    </c:if>

    <!-- Tombol navigasi kembali ke Program 1 -->
    <a href="${pageContext.request.contextPath}/john-volta" class="nav-link">
        &larr; Kembali ke Program 1: Gaji Mr. John
    </a>
</main>
</body>
</html>