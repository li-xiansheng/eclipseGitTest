package info.wangchen.simplehuddemo;

import info.wangchen.simplehud.SimpleHUD;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity implements OnClickListener {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		Button showInfoMessage = (Button)findViewById(R.id.btn_info_message);
		Button showLoadingMessage = (Button)findViewById(R.id.btn_loading_message);
		Button showErrorMessage = (Button)findViewById(R.id.btn_error_message);
		Button showSuccessMessage = (Button)findViewById(R.id.btn_success_message);
		showInfoMessage.setOnClickListener(this);
		showLoadingMessage.setOnClickListener(this);
		showErrorMessage.setOnClickListener(this);
		showSuccessMessage.setOnClickListener(this);
	}
	
	@Override
	public void onClick(View v) {
		switch( v.getId() ) {
			case R.id.btn_loading_message:
				SimpleHUD.showLoadingMessage(this, "请稍后……", true);
				// when you finish loading your data, call SimpleHUD.dismiss();
				break;
			case R.id.btn_info_message:
				SimpleHUD.showInfoMessage(this, "提示信息");
				break;
			case R.id.btn_error_message:
				SimpleHUD.showErrorMessage(this, "数据请求失败，请重新加载");
				break;
			case R.id.btn_success_message:
				SimpleHUD.showSuccessMessage(this, "成功成功成功成功成功成功成功成功成功成功成功成功成功成功成功成功成功成功成功成功成功成功成功成功成功成功成功成功成功成功成功成功成功成功成功成功成功成功成功成功");
				break;
		}
	}


}
