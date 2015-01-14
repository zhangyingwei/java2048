package main;

import control.GameControl;
import dto.Dto;
import service.GameService;
import ui.MainFrame;
import ui.MainPanel;

public class start {

	/**
	 * 主函数
	 * @param fengche
	 */
	public static void main(String[] args) {
		//创建dto对象
		Dto dto = new Dto();
		//创建gameservice对象
		GameService gameService = new GameService(dto);
		//创建游戏主窗口
		MainFrame mainFrame = new MainFrame();
		//创建游戏panel
		MainPanel mainPanel = new MainPanel(dto, gameService);
		//创建游戏控制器对象
		GameControl gameControl = new GameControl(mainPanel, gameService);
		//设置窗口可见
		mainFrame.setVisible(true);
		//添加键盘监听器
		mainFrame.addKeyListener(gameControl);
		//设置游戏主panel
		mainFrame.setContentPane(mainPanel);
	}

}
