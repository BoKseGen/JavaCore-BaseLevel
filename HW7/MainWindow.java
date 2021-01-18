import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainWindow extends JFrame {

    private static final int WIN_WIDTH = 500;
    private static final int WIN_HEIGHT = 555;
    private static final int WIN_POSX = 650;
    private static final int WIN_POSY = 250;

    private Settings settingsWindow;
    private GameMap gameMap;

    MainWindow(){
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); //чтоб программа завершалась, когда окно закрываем
        setSize(WIN_WIDTH, WIN_HEIGHT);
        setLocation(WIN_POSX, WIN_POSY);
        setTitle("Игра в крестики-нолики");
        //запретить менять размер окна
        setResizable(false);

        //передаём "сами себя"
        settingsWindow = new Settings(this);
        gameMap = new GameMap();

        JButton btnStartGame = new JButton("Новая игра");
        btnStartGame.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                settingsWindow.setVisible(true);
            }
        });

        JButton btnExitGame = new JButton("Выход из игры");
        btnExitGame.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        //BorderLayout, GridLayout, FlowLayout и др. Прочитать про это на oracle
//        setLayout(new GridLayout(1, 2));
//
//        add(btnStartGame);//, BorderLayout.EAST);
//        add(btnExitGame);//, BorderLayout.SOUTH);

        JPanel panelBottom = new JPanel();
        panelBottom.setLayout(new GridLayout(1, 2));
        panelBottom.add(btnStartGame);
        panelBottom.add(btnExitGame);
        add(panelBottom, BorderLayout.SOUTH);

        add(gameMap);
//        add(btnStartGame, BorderLayout.EAST);
//        add(btnExitGame, BorderLayout.SOUTH);

        setVisible(true);
    }

    void startNewGame(int mode, int fieldSizeX, int fieldSizeY, int winLength){
        gameMap.startNewGame(mode, fieldSizeX, fieldSizeY, winLength);
    }
}
