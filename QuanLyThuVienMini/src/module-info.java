module QuanLyThuVienMini {
	requires javafx.controls;
	requires javafx.graphics;
	
	opens tanvu.app to javafx.graphics, javafx.fxml;
}
