- Trên môi trường Dev, lập trình viên cần thấy log ngay lập tức trên console để debug nhanh,
cần cấp độ DEBUG để thấy được toàn bộ luồng chạy của ứng dụng.

- Trên môi trường Prod, không có ai ngồi nhìn console,
log cần được lưu ra file để truy vết sau này,
chỉ cần cấp độ INFO trở lên để tránh ghi quá nhiều thứ không cần thiết.

- Nếu không cắt file log định kỳ thì chỉ sau vài tuần chạy liên tục,
file log có thể chiếm hàng chục GB làm đầy ổ cứng server và khiến ứng dụng bị crash.