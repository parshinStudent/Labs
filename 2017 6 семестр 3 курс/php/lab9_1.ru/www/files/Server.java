package ticketOffice;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Point;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import static java.lang.System.exit;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.text.DefaultCaret;
import ticketOffice.classes.ProfileFlight;
import ticketOffice.classes.XML;
import ticketOffice.util.Patterns;

/**
 *
 * @author parsh
 */
public class Server extends javax.swing.JFrame
{

    static private ServerSocket server;
    private Point position;

    private static int PORT = 5678;
    static private Socket connection;

    static private int count = 0;
    static private boolean connect = false;

    static public Font titleFont;

    public static void main(String args[]) throws InterruptedException
    {
        Server serv = new Server();
        Image icon = null;
        try
        {
            icon = ImageIO.read(Server.class.getResourceAsStream("resources/images/logo.png"));
        }
        catch (IOException ex)
        {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
        }

        serv.setIconImage(icon);
        serv.getContentPane().setBackground(Color.white);

        serv.start();
        while (!connect)
        {
            PORT = 0;
            serv.setVisible(false);
            serv.tryConnect();
            serv.setVisible(true);
            serv.start();
        }

    }

    /**
     * Запускаю новое соединение
     */
    public void start()
    {
        this.setVisible(true);
        try
        {
            server = new ServerSocket(PORT);
            pLog.append("Сервер запущен на порте:" + Integer.toString(PORT) + "\n");
            /*
            try{
            URL whatismyip = new URL("http://checkip.amazonaws.com");
            BufferedReader in = new BufferedReader(new InputStreamReader(whatismyip.openStream()));
            String ip = in.readLine(); //you get the IP as a String
            pLog.append("IP для подключения к серверу: " + ip);
            }catch(Exception ex)
            {
                
            }
            */
            
            connect = true;
            while (true)
            {
                Socket socket = server.accept();

                Connection con = new Connection(socket);
                con.start();
            }
        }
        catch (IOException e)
        {
            connect = false;

            pLog.append("Ошибка: Порт " + PORT + " занят\n");
        }
    }

    public void tryConnect()
    {
        reconect rec = new reconect();
        rec.setVisible(true);
        rec.getContentPane().setBackground(Color.white);

        while (rec.isVisible())
        {
            rec.returnPort1();
        }

        PORT = rec.PORT;
        rec.dispose();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {
        java.awt.GridBagConstraints gridBagConstraints;

        pMain = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        pLog = new javax.swing.JTextArea();
        lExit = new javax.swing.JLabel();
        lMinimize = new javax.swing.JLabel();
        lIcon = new javax.swing.JLabel();
        lName = new javax.swing.JLabel();
        lCity = new javax.swing.JLabel();
        jDesignation = new javax.swing.JLabel();
        pInput = new javax.swing.JPanel();
        input = new javax.swing.JTextField();
        lConsol = new javax.swing.JLabel();
        pOk = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lConsol1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Сервер");
        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter()
        {
            public void mouseDragged(java.awt.event.MouseEvent evt)
            {
                formMouseDragged(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mousePressed(java.awt.event.MouseEvent evt)
            {
                formMousePressed(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter()
        {
            public void windowClosing(java.awt.event.WindowEvent evt)
            {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pMain.setBackground(new java.awt.Color(255, 255, 255));
        pMain.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pMain.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pLog.setColumns(20);
        pLog.setRows(5);
        pLog.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(66, 66, 66)));
        pLog.setFocusable(false);
        jScrollPane1.setViewportView(pLog);

        pMain.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 340, 250));

        lExit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ticketOffice/resources/images/exit_icon.png"))); // NOI18N
        lExit.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
        lExit.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                lExitMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt)
            {
                lExitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt)
            {
                lExitMouseExited(evt);
            }
        });
        pMain.add(lExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, 30, 30));

        lMinimize.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lMinimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ticketOffice/resources/images/minimize_icon.png"))); // NOI18N
        lMinimize.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                lMinimizeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt)
            {
                lMinimizeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt)
            {
                lMinimizeMouseExited(evt);
            }
        });
        pMain.add(lMinimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, 30, 30));

        lIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ticketOffice/resources/images/logo.png"))); // NOI18N
        pMain.add(lIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, 35));

        lName.setFont(new java.awt.Font("Microsoft YaHei", 1, 16)); // NOI18N
        lName.setForeground(new java.awt.Color(121, 121, 121));
        lName.setText("RED SHARP");
        pMain.add(lName, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, 35));

        lCity.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        lCity.setForeground(new java.awt.Color(121, 121, 121));
        lCity.setText("Mykolaiv");
        pMain.add(lCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, -1, 35));

        jDesignation.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jDesignation.setForeground(new java.awt.Color(121, 121, 121));
        jDesignation.setText("airport cash boxes server");
        pMain.add(jDesignation, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));

        pInput.setBackground(new java.awt.Color(255, 255, 255));
        pInput.setLayout(new java.awt.GridBagLayout());

        input.setFont(new java.awt.Font("Open Sans Semibold", 0, 11)); // NOI18N
        input.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(240, 27, 57)));
        input.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                inputKeyPressed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 276;
        gridBagConstraints.ipady = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 8, 0, 0);
        pInput.add(input, gridBagConstraints);

        lConsol.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        lConsol.setForeground(new java.awt.Color(121, 121, 121));
        lConsol.setText("КОНСОЛЬ СЕРВЕРУ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(4, 10, 4, 0);
        pInput.add(lConsol, gridBagConstraints);

        pOk.setBackground(new java.awt.Color(240, 27, 57));
        pOk.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(240, 27, 57)));
        pOk.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                pOkMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt)
            {
                pOkMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt)
            {
                pOkMouseExited(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Open Sans Semibold", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("OK");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout pOkLayout = new javax.swing.GroupLayout(pOk);
        pOk.setLayout(pOkLayout);
        pOkLayout.setHorizontalGroup(
            pOkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pOkLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(24, 24, 24))
        );
        pOkLayout.setVerticalGroup(
            pOkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipady = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.FIRST_LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(11, 0, 13, 0);
        pInput.add(pOk, gridBagConstraints);

        pMain.add(pInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 350, 60));

        lConsol1.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        lConsol1.setForeground(new java.awt.Color(121, 121, 121));
        lConsol1.setText("ЛОГ СЕРВЕРУ");
        pMain.add(lConsol1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        pMain.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 450, 50, 10));

        getContentPane().add(pMain, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 380, 460));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt)//GEN-FIRST:event_formWindowClosing
    {
//GEN-HEADEREND:event_formWindowClosing
        XML.createXMLFlights();
    }//GEN-LAST:event_formWindowClosing

    private void lExitMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lExitMouseClicked
    {//GEN-HEADEREND:event_lExitMouseClicked
        this.dispose();
        exit(0);
    }//GEN-LAST:event_lExitMouseClicked

    private void lMinimizeMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lMinimizeMouseClicked
    {//GEN-HEADEREND:event_lMinimizeMouseClicked
        this.setExtendedState(JFrame.ICONIFIED);
    }//GEN-LAST:event_lMinimizeMouseClicked

    private void formMousePressed(java.awt.event.MouseEvent evt)//GEN-FIRST:event_formMousePressed
    {//GEN-HEADEREND:event_formMousePressed
        position = evt.getPoint();
        getComponentAt(position);
    }//GEN-LAST:event_formMousePressed

    private void formMouseDragged(java.awt.event.MouseEvent evt)//GEN-FIRST:event_formMouseDragged
    {//GEN-HEADEREND:event_formMouseDragged
        int thisX = this.getLocation().x;
        int thisY = this.getLocation().y;

        int xMoved = (thisX + evt.getX()) - (thisX + position.x);
        int yMoved = (thisY + evt.getY()) - (thisY + position.y);

        int X = thisX + xMoved;
        int Y = thisY + yMoved;
        this.setLocation(X, Y);
    }//GEN-LAST:event_formMouseDragged

    private void lExitMouseEntered(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lExitMouseEntered
    {//GEN-HEADEREND:event_lExitMouseEntered
        lExit.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
    }//GEN-LAST:event_lExitMouseEntered

    private void lExitMouseExited(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lExitMouseExited
    {//GEN-HEADEREND:event_lExitMouseExited
        lExit.setBorder(BorderFactory.createLineBorder(Color.BLACK, 0));
    }//GEN-LAST:event_lExitMouseExited

    private void lMinimizeMouseEntered(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lMinimizeMouseEntered
    {//GEN-HEADEREND:event_lMinimizeMouseEntered
        lMinimize.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
    }//GEN-LAST:event_lMinimizeMouseEntered

    private void lMinimizeMouseExited(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lMinimizeMouseExited
    {//GEN-HEADEREND:event_lMinimizeMouseExited
        lMinimize.setBorder(BorderFactory.createLineBorder(Color.BLACK, 0));
    }//GEN-LAST:event_lMinimizeMouseExited

    private void pOkMouseEntered(java.awt.event.MouseEvent evt)//GEN-FIRST:event_pOkMouseEntered
    {//GEN-HEADEREND:event_pOkMouseEntered
        pOk.setBorder(BorderFactory.createLineBorder(new Color(164, 2, 2), 1));
        pOk.setBackground(new Color(164, 2, 2));
    }//GEN-LAST:event_pOkMouseEntered

    private void pOkMouseExited(java.awt.event.MouseEvent evt)//GEN-FIRST:event_pOkMouseExited
    {//GEN-HEADEREND:event_pOkMouseExited
        pOk.setBorder(BorderFactory.createLineBorder(new Color(240, 27, 57), 1));
        pOk.setBackground(new Color(240, 27, 57));
    }//GEN-LAST:event_pOkMouseExited

    private void pOkMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_pOkMouseClicked
    {//GEN-HEADEREND:event_pOkMouseClicked
        if (input.getText().length() > 0)
        {
            checkInput(input.getText());
        }
    }//GEN-LAST:event_pOkMouseClicked

    private void inputKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_inputKeyPressed
    {//GEN-HEADEREND:event_inputKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
            if (input.getText().length() > 0)
            {
                checkInput(input.getText());
            }
        }
    }//GEN-LAST:event_inputKeyPressed

    private void checkInput(String str)
    {
        if (str.equals("info"))
        {
            pLog.append("MNU_ASTRUM:" + "\n");
            pLog.append("                               Паршин Олександр" + "\n");
            pLog.append("                               Кудрявцев Андрій" + "\n");
            pLog.append("                               Курченко Ігорь" + "\n");
        }
        else
        {
            pLog.append(input.getText() + "\n");
        }
        input.setText("");
    }

    public Server()
    {
        initComponents();

        input.setBorder(BorderFactory.createCompoundBorder(this.input.getBorder(), BorderFactory.createEmptyBorder(0, 3, 0, 0)));
        pLog.setBorder(BorderFactory.createCompoundBorder(Server.pLog.getBorder(), BorderFactory.createEmptyBorder(3, 3, 0, 0)));

        DefaultCaret caret = (DefaultCaret) pLog.getCaret();
        caret.setUpdatePolicy(DefaultCaret.ALWAYS_UPDATE);

        XML.readXmlFlights();

        if (XML.getCountFlights() == 0)
        {

            ProfileFlight a = new ProfileFlight();

            a.setId(100);
            a.setRoute("Николаев-Киев");
            a.setDaysFlight("0101010");
            a.setTimeFlight("15:20");
            a.setBussinesClass("150 15");
            a.setFirstClass("100 30");
            a.setEconomClass("50 50");
            //a.setPlaces("00000000000000000000000000000000000000000000000000000000000000000000");

            XML.addFlight(a);
            XML.createXMLFlights();
            System.out.println(XML.getCountFlights());
            XML.deleteFlightIndex(0);
            System.out.println(XML.getCountFlights());
            XML.readXmlFlights();
        }

        System.out.println("addFlight");
        ProfileFlight temp = new ProfileFlight();
        if (temp.buildFlight("101,Николаев-Киев,0101010,15:30,100 2,75 4,50 10"))
        {
            System.out.println(XML.addFlight(temp));
        }

        if (temp.buildFlight("102,Николаев-Киев,0101010,15:30,100 2,75 4,50 10"))
        {
            System.out.println(XML.addFlight(temp));
        }

        if (temp.buildFlight("103,Николаев-Киев,0101010,15:30,100 2,75 4,50 10"))
        {
            System.out.println(XML.addFlight(temp));
        }

        System.out.println("addPiP");
        System.out.println(XML.addPiP("100,Курченко Игорь Дмитриевич#EP123451!2*16.05.2017"));

        System.out.println(XML.addPiP("102,Курченко Игорь Дмитриевич#EP123451!3*16.05.2017"));
        System.out.println(XML.addPiP("103,Курченко Игорь Дмитриевич#EP123451!3*16.05.2017"));

        /*
        ///TEST addFlight();
        System.out.println("addFlight");
        ProfileFlight temp = new ProfileFlight();
        if(temp.buildFlight("102,Николаев-Киев,0101010,15:30,100 2,75 4,50 10"))
            System.out.println(XML.addFlight(temp));
        //System.out.println(XML.LIST());
        
        
        System.out.println("addPiP");
        System.out.println(XML.addPiP("100,Курченко Игорь Дмитриевич#EP123451!2*16.05.2017"));
        

        
        //System.out.println(XML.LIST());
        //System.out.println(XML.ListTickets());
        
        
        System.out.println("findPiP");
        System.out.println(XML.findPiP("Курченко Игорь Юрьевич", "EP123451"));
        
        
        
        //Нужен поиск по дню и Дате
        System.out.println("findRouteAndDate");
        System.out.println(XML.addPiP("102,Курченко Игорь Юрьевич#EP123451!2*16.05.2017"));
        System.out.println(XML.findDaуAndRoute(2,"16.05.2017", "Николаев-Киев"));
        
        
        System.out.println("findIdandDay");
         */
        System.out.println(XML.findDaуAndRoute(2, "16.05.2017", "Николаев-Киев"));
        //System.out.println(XML.findIdAndDay(100, 2, "16.05.2017"));

    }

    final class Connection extends Thread
    {

        private InputStream in;
        private OutputStream out;
        private Socket socket;

        private String name = "";

        public Connection(Socket socket)
        {
            this.socket = socket;

            try
            {
                in = socket.getInputStream();
                out = socket.getOutputStream();

            }
            catch (IOException e)
            {
                close();
            }
        }

        void outFail() throws IOException
        {
            String wrong = "~Невірний запрос\n";
            out.write(wrong.getBytes());
            end();
        }

        void end() throws IOException
        {
            out.write("endData\n".getBytes("UTF-8"));
            out.flush();
        }

        @Override
        public void run()
        {
            try
            {
                name = "Client ";
                name += Integer.toString(count + 1);
                count++;

                while (true)
                {
                    String line = "";
                    byte[] buf = new byte[2048];
                    int readBytes = in.read(buf);
                    try
                    {
                        line = new String(buf, 0, readBytes, "UTF-8");

                    }
                    catch (Exception ex)
                    {
                    }

                    pLog.append(line + "\n");
                    if (line.equals("stop server"))
                    {
                        count--;
                        break;
                    }
                    /*
                        Допустимые комманды
                        findId<1>
                        findIdAndDay<1,2>
                        findDayAndRoute<1,Николаев-Киев>
                        findDayAndRoute<1,Николаев-Москва>
                        addFlight<100,Николаев-Москва,0101010,15:30:00,100 2,75 4,50 10,000000000000000>
                        findPiP<Sasha Parshin Lex,EP123456>
                        addPiP<1,Курченко Игорь Юрьевич#EP123459*14.04.2017!1>
                     */

                    //addFlight<id,Route,Days,Time,EconomClass,FirstClass,EconomClass>
                    else if (Patterns.getAddFlight().matcher(line).matches())
                    {
                        String flight = line.substring(line.indexOf('<') + 1, line.indexOf('>'));
                        System.out.println(flight);
                        try
                        {
                            ProfileFlight temp = new ProfileFlight();

                            if (temp.buildFlight(flight))
                            {
                                out.write(XML.addFlight(temp).getBytes("UTF-8"));
                                end();
                            }
                            else
                            {
                                outFail();
                            }
                        }
                        catch (Exception e)
                        {
                            outFail();
                        }
                    }
                    else if (Patterns.getFindIdAndDay().matcher(line).matches())
                    {
                        try
                        {
                            String temp = line.substring(line.indexOf('<') + 1, line.indexOf('>'));
                            String id = temp.substring(0, temp.indexOf(','));

                            temp = temp.substring(temp.indexOf(',') + 1, temp.length());
                            String Day = temp.substring(0, temp.indexOf(','));

                            temp = temp.substring(temp.indexOf(',') + 1, temp.length());
                            String Date = temp.substring(0, temp.length());

                            out.write(XML.findIdAndDay(Integer.parseInt(id), Integer.parseInt(Day), Date).getBytes("UTF-8"));
                            end();
                        }
                        catch (Exception exp)
                        {
                            outFail();
                        }

                    }
                    else if (Patterns.getFindDayAndRoute().matcher(line).matches())
                    {
                        try
                        {
                            String temp = line.substring(line.indexOf('<') + 1, line.indexOf('>'));
                            String Day = temp.substring(0, temp.indexOf(','));

                            temp = temp.substring(temp.indexOf(',') + 1, temp.length());
                            String Date = temp.substring(0, temp.indexOf(','));

                            temp = temp.substring(temp.indexOf(',') + 1, temp.length());
                            String Route = temp.substring(0, temp.length());

                            out.write(XML.findDaуAndRoute(Integer.parseInt(Day), Date, Route).toString().getBytes("UTF-8"));
                            end();
                        }
                        catch (Exception exp)
                        {
                            outFail();
                        }
                    }
                    else if (Patterns.getFindPiP().matcher(line).matches())
                    {
                        try
                        {
                            String temp = line.substring(line.indexOf('<') + 1, line.indexOf('>'));
                            String PiP = temp.substring(0, temp.indexOf(","));
                            String pasport = temp.substring(temp.indexOf(",") + 1, temp.length());
                            out.write(XML.findPiP(PiP, pasport).toString().getBytes("UTF-8"));
                            end();
                        }
                        catch (Exception exp)
                        {
                            outFail();
                        }
                    }
                    else if (Patterns.getAddPiP().matcher(line).matches())
                    {
                        try
                        {
                            pLog.append(line);
                            String Data = line.substring(line.indexOf('<') + 1, line.indexOf('>'));
                            out.write(XML.addPiP(Data).getBytes("UTF-8"));
                            end();
                        }
                        catch (Exception exp)
                        {
                            outFail();
                        }
                    }
                    else if (Patterns.getFindId().matcher(line).matches())
                    {
                        try
                        {
                            int id = Integer.parseInt(line.substring(line.indexOf('<') + 1, line.indexOf('>')));
                            out.write(XML.findId(id).getBytes("UTF-8"));
                            end();
                        }
                        catch (NumberFormatException e)
                        {
                            outFail();
                        }
                    }
                    //changeFlight<>
                    else if (Patterns.getChangeFlight().matcher(line).matches())
                    {
                        String flight = line.substring(line.indexOf('<') + 1, line.indexOf('>'));
                        System.out.println(flight);
                        try
                        {
                            ProfileFlight temp = new ProfileFlight();
                            if (temp.buildFlight(flight))
                            {
                                XML.deleteFlight(temp.getId());
                                XML.addFlight(temp);
                            }
                        }
                        catch (Exception e)
                        {
                            outFail();
                        }
                    }
                    //delete flight
                    else if (Patterns.getDeleteFlight().matcher(line).matches())
                    {
                        try
                        {
                            int id = Integer.parseInt(line.substring(line.indexOf('<') + 1, line.indexOf('>')));
                            out.write(XML.deleteFlight(id).getBytes("UTF-8"));
                            end();
                        }
                        catch (NumberFormatException e)
                        {
                            outFail();
                        }
                    }
                    else
                    {
                        outFail();
                    }
                }
            }
            catch (IOException e)
            {
            }
            finally
            {
                close();
            }

        }

        public void close()
        {
            try
            {
                in.close();
                out.close();
                socket.close();
            }
            catch (IOException e)
            {
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField input;
    private javax.swing.JLabel jDesignation;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lCity;
    private javax.swing.JLabel lConsol;
    private javax.swing.JLabel lConsol1;
    private javax.swing.JLabel lExit;
    private javax.swing.JLabel lIcon;
    private javax.swing.JLabel lMinimize;
    private javax.swing.JLabel lName;
    private javax.swing.JPanel pInput;
    private static javax.swing.JTextArea pLog;
    private javax.swing.JPanel pMain;
    private javax.swing.JPanel pOk;
    // End of variables declaration//GEN-END:variables
}
