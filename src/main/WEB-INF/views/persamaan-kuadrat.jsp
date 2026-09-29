<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Kalkulator Persamaan Kuadrat</title>
    <style>
        body { font-family: Arial, sans-serif; margin: 40px; }
        .form-group { margin-bottom: 15px; }
        .result-box { margin-top: 20px; padding: 15px; border: 1px solid #4CAF50; background-color: #e8f5e9; }
    </style>
</head>
<body>
    <h2>Kalkulator Persamaan Kuadrat</h2>
    <p>Bentuk umum: ax² + bx + c = 0</p>

    <form action="/persamaan-kuadrat" method="post">
        <div class="form-group">
            <label for="a">Nilai a:</label>
            <input type="number" step="any" id="a" name="a" value="${a != null ? a : ''}" required>
        </div>
        <div class="form-group">
            <label for="b">Nilai b:</label>
            <input type="number" step="any" id="b" name="b" value="${b != null ? b : ''}" required>
        </div>
        <div class="form-group">
            <label for="c">Nilai c:</label>
            <input type="number" step="any" id="c" name="c" value="${c != null ? c : ''}" required>
        </div>
        <button type="submit">Hitung Akar</button>
    </form>

    <%-- Menampilkan hasil jika ada --%>
    <% if (request.getAttribute("hasil") != null) { %>
        <div class="result-box">
            <strong>Hasil:</strong> <br/>
            ${hasil}
        </div>
    <% } %>
    
    <br>
    <a href="/">Kembali ke Beranda</a>
</body>
</html>