
import javax.swing.*;
import javax.swing.JOptionPane;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import javax.swing.SwingUtilities;
import javax.swing.Timer;
import java.awt.Dimension;
import java.awt.GraphicsEnvironment;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

public class cards{

	static JFrame initialframe;
	static int clicked;
	
	//Cards/Timer
	static JFrame shit; //first cards dealt
	static JFrame piss;//hit cards
	static JFrame shit2;//second of the first cards
	static Timer timer;

	//Random Numbers
	static int rnd; //random number, used for shit
	static int rnd2; //random number, used for shit2
	static int rnd3; //random number, used for HIT cards

	//Values of the cards
	static int[] values; // array of values corresponding to cards
	static int checkval; //Sum of the cardvalues
	static int val;  // value of inital card-shit
	static int val2; // value of intial card-shit2
	static int val3; //values of HIT cards-piss

	//AI cards
	static int comprnd; //Computer Player
	static int comprnd2;
	static int comprnd3;
	static int compval;
	static int compval2;
	static int compval3;
	static int compcheck;

	//AceStuff
	static JFrame ace;
	static JButton one;
	static JButton eleven;


	public void makecards(){
		final JFrame[] cards = new JFrame[53];
			cards[0]= new JFrame ("Joker");
			
			cards[1]=new JFrame ("Ace of Hearts");
				cards[1].setSize(240,320);
				cards[1].setLayout(new BorderLayout());
				JLabel background1 = new JLabel (new ImageIcon("img/AceOfHearts.png"));
				cards[1].add(background1);
				background1.setLayout(new FlowLayout());

			cards[2]=new JFrame ("Two of Hearts") ;
				cards[2].setSize(240,320);
				cards[2].setLayout(new BorderLayout());
				JLabel background2 = new JLabel (new ImageIcon("img/TwoOfHearts.png"));
				cards[2].add(background2);
				background2.setLayout(new FlowLayout());

			cards[3]= new JFrame ("Three of Hearts");
				cards[3].setSize(240,320);
				cards[3].setLayout(new BorderLayout());
				JLabel background3 = new JLabel (new ImageIcon("img/ThreeOfHearts.png"));
				cards[3].add(background3);
				background3.setLayout(new FlowLayout());

			cards[4]=new JFrame ("Four of Hearts") ;
				cards[4].setSize(240,320);
				cards[4].setLayout(new BorderLayout());
				JLabel background4 = new JLabel (new ImageIcon("img/FourOfHearts.png"));
				cards[4].add(background4);
				background4.setLayout(new FlowLayout());

			cards[5]= new JFrame ("Five of Hearts") ;
				cards[5].setSize(240,320);
				cards[5].setLayout(new BorderLayout());
				JLabel background5 = new JLabel (new ImageIcon("img/FiveOfHearts.png"));
				cards[5].add(background5);
				background5.setLayout(new FlowLayout());

			cards[6]= new JFrame ("Six of Hearts") ;
				cards[6].setSize(240,320);
				cards[6].setLayout(new BorderLayout());
				JLabel background6 = new JLabel (new ImageIcon("img/SixOfHearts.png"));
				cards[6].add(background6);
				background6.setLayout(new FlowLayout());

			cards[7]= new JFrame ("Seven of Hearts"); 
				cards[7].setSize(240,320);
				cards[7].setLayout(new BorderLayout());
				JLabel background7 = new JLabel (new ImageIcon("img/SevenOfHearts.png"));
				cards[7].add(background7);
				background7.setLayout(new FlowLayout());

			cards[8]= new JFrame ("Eight of Hearts") ;
				cards[8].setSize(240,320);
				cards[8].setLayout(new BorderLayout());
				JLabel background8 = new JLabel (new ImageIcon("img/EightOfHearts.png"));
				cards[8].add(background8);
				background8.setLayout(new FlowLayout());

			cards[9]= new JFrame ("Nine of Hearts") ;
				cards[9].setSize(240,320);
				cards[9].setLayout(new BorderLayout());
				JLabel background9 = new JLabel (new ImageIcon("img/NineOfHearts.png"));
				cards[9].add(background9);
				background9.setLayout(new FlowLayout());

			cards[10]=new JFrame ("Ten of Hearts");
				cards[10].setSize(240,320);
				cards[10].setLayout(new BorderLayout());
				JLabel background10 = new JLabel (new ImageIcon("img/TenOfHearts.png"));
				cards[10].add(background10);
				background10.setLayout(new FlowLayout());

			cards[11]= new JFrame ("Jack of Hearts") ;
				cards[11].setSize(240,320);
				cards[11].setLayout(new BorderLayout());
				JLabel background11 = new JLabel (new ImageIcon("img/JackOfHearts.png"));
				cards[11].add(background11);
				background11.setLayout(new FlowLayout());

			cards[12]= new JFrame ("Queen of Hearts") ;
				cards[12].setSize(240,320);
				cards[12].setLayout(new BorderLayout());
				JLabel background12 = new JLabel (new ImageIcon("img/QueenOfHearts.png"));
				cards[12].add(background12);
				background12.setLayout(new FlowLayout());

			cards[13]= new JFrame ("King of Hearts");
				cards[13].setSize(240,320);
				cards[13].setLayout(new BorderLayout());
				JLabel background13 = new JLabel (new ImageIcon("img/KingOfHearts.png"));
				cards[13].add(background13);
				background13.setLayout(new FlowLayout());

			cards[14]= new JFrame ("Ace of Diamonds") ;
				cards[14].setSize(240,320);
				cards[14].setLayout(new BorderLayout());
				JLabel background14 = new JLabel (new ImageIcon("img/AceOfDiamonds.png"));
				cards[14].add(background14);
				background14.setLayout(new FlowLayout());

			cards[15]= new JFrame ("Two of Diamonds"); 
				cards[15].setSize(240,320);
				cards[15].setLayout(new BorderLayout());
				JLabel background15 = new JLabel (new ImageIcon("img/TwoOfDiamonds.png"));
				cards[15].add(background15);
				background15.setLayout(new FlowLayout());

			cards[16]= new JFrame ("Three of Diamonds") ;
				cards[16].setSize(240,320);
				cards[16].setLayout(new BorderLayout());
				JLabel background16 = new JLabel (new ImageIcon("img/ThreeOfDiamonds.png"));
				cards[16].add(background16);
				background16.setLayout(new FlowLayout());

			cards[17]= new JFrame ("Four of Diamonds") ;
				cards[17].setSize(240,320);
				cards[17].setLayout(new BorderLayout());
				JLabel background17 = new JLabel (new ImageIcon("img/FourOfDiamonds.png"));
				cards[17].add(background17);
				background17.setLayout(new FlowLayout());

			cards[18]= new JFrame ("Five of Diamonds") ;
				cards[18].setSize(240,320);
				cards[18].setLayout(new BorderLayout());
				JLabel background18 = new JLabel (new ImageIcon("img/FiveOfDiamonds.png"));
				cards[18].add(background18);
				background18.setLayout(new FlowLayout());

			cards[19]= new JFrame ("Six of Diamonds") ;
				cards[19].setSize(240,320);
				cards[19].setLayout(new BorderLayout());
				JLabel background19 = new JLabel (new ImageIcon("img/SixOfDiamonds.png"));
				cards[19].add(background19);
				background19.setLayout(new FlowLayout());

			cards[20]= new JFrame ("Seven of Diamonds") ;
				cards[20].setSize(240,320);
				cards[20].setLayout(new BorderLayout());
				JLabel background20 = new JLabel (new ImageIcon("img/SevenOfDiamonds.png"));
				cards[20].add(background20);
				background20.setLayout(new FlowLayout());

			cards[21]= new JFrame ("Eight of Diamonds") ;
				cards[21].setSize(240,320);
				cards[21].setLayout(new BorderLayout());
				JLabel background21 = new JLabel (new ImageIcon("img/EightOfDiamonds.png"));
				cards[21].add(background21);
				background21.setLayout(new FlowLayout());

			cards[22]= new JFrame ("Nine of Diamonds"); 
				cards[22].setSize(240,320);
				cards[22].setLayout(new BorderLayout());
				JLabel background22 = new JLabel (new ImageIcon("img/NineOfDiamonds.png"));
				cards[22].add(background22);
				background22.setLayout(new FlowLayout());

			cards[23]= new JFrame ("Ten of Diamonds");
				cards[23].setSize(240,320);
				cards[23].setLayout(new BorderLayout());
				JLabel background23 = new JLabel (new ImageIcon("img/TenOfDiamonds.png"));
				cards[23].add(background23);
				background23.setLayout(new FlowLayout());

			cards[24]=new JFrame ("Jack of Diamonds") ;
				cards[24].setSize(240,320);
				cards[24].setLayout(new BorderLayout());
				JLabel background24 = new JLabel (new ImageIcon("img/JackOfDiamonds.png"));
				cards[24].add(background24);
				background24.setLayout(new FlowLayout());

			cards[25]= new JFrame ("Queen of Diamonds") ;
				cards[25].setSize(240,320);
				cards[25].setLayout(new BorderLayout());
				JLabel background25 = new JLabel (new ImageIcon("img/QueenOfDiamonds.png"));
				cards[25].add(background25);
				background25.setLayout(new FlowLayout());

			cards[26]= new JFrame ("King of Diamonds");
				cards[26].setSize(240,320);
				cards[26].setLayout(new BorderLayout());
				JLabel background26 = new JLabel (new ImageIcon("img/KingOfDiamonds.png"));
				cards[26].add(background26);
				background26.setLayout(new FlowLayout());

			cards[27]= new JFrame ("Ace of Clubs") ;
				cards[27].setSize(240,320);
				cards[27].setLayout(new BorderLayout());
				JLabel background27 = new JLabel (new ImageIcon("img/AceOfClubs.png"));
				cards[27].add(background27);
				background27.setLayout(new FlowLayout());

			cards[28]= new JFrame ("Two of Clubs") ;
				cards[28].setSize(240,320);
				cards[28].setLayout(new BorderLayout());
				JLabel background28 = new JLabel (new ImageIcon("img/TwoOfClubs.png"));
				cards[28].add(background28);
				background28.setLayout(new FlowLayout());

			cards[29]= new JFrame ("Three of Clubs") ;
				cards[29].setSize(240,320);
				cards[29].setLayout(new BorderLayout());
				JLabel background29 = new JLabel (new ImageIcon("img/ThreeOfClubs.png"));
				cards[29].add(background29);
				background29.setLayout(new FlowLayout());

			cards[30]= new JFrame ("Four of Clubs") ;
				cards[30].setSize(240,320);
				cards[30].setLayout(new BorderLayout());
				JLabel background30 = new JLabel (new ImageIcon("img/FourOfClubs.png"));
				cards[30].add(background30);
				background30.setLayout(new FlowLayout());

			cards[31]= new JFrame ("Five of Clubs") ;
				cards[31].setSize(240,320);
				cards[31].setLayout(new BorderLayout());
				JLabel background31 = new JLabel (new ImageIcon("img/FiveOfClubs.png"));
				cards[31].add(background31);
				background31.setLayout(new FlowLayout());

			cards[32]= new JFrame ("Six of Clubs") ;
				cards[32].setSize(240,320);
				cards[32].setLayout(new BorderLayout());
				JLabel background32 = new JLabel (new ImageIcon("img/SixOfClubs.png"));
				cards[32].add(background32);
				background32.setLayout(new FlowLayout());

			cards[33]= new JFrame ("Seven of Clubs") ;
				cards[33].setSize(240,320);
				cards[33].setLayout(new BorderLayout());
				JLabel background33 = new JLabel (new ImageIcon("img/SevenOfClubs.png"));
				cards[33].add(background33);
				background33.setLayout(new FlowLayout());

			cards[34]= new JFrame ("Eight of Clubs") ;
				cards[34].setSize(240,320);
				cards[34].setLayout(new BorderLayout());
				JLabel background34 = new JLabel (new ImageIcon("img/EightOfClubs.png"));
				cards[34].add(background34);
				background34.setLayout(new FlowLayout());

			cards[35]= new JFrame ("Nine of Clubs") ;
				cards[35].setSize(240,320);
				cards[35].setLayout(new BorderLayout());
				JLabel background35 = new JLabel (new ImageIcon("img/NineOfClubs.png"));
				cards[35].add(background35);
				background35.setLayout(new FlowLayout());

			cards[36]= new JFrame ("Ten of Clubs");
				cards[36].setSize(240,320);
				cards[36].setLayout(new BorderLayout());
				JLabel background36 = new JLabel (new ImageIcon("img/TenOfClubs.png"));
				cards[36].add(background36);
				background36.setLayout(new FlowLayout());

			cards[37]= new JFrame ("Jack of Clubs") ;
				cards[37].setSize(240,320);
				cards[37].setLayout(new BorderLayout());
				JLabel background37 = new JLabel (new ImageIcon("img/JackOfClubs.png"));
				cards[37].add(background37);
				background37.setLayout(new FlowLayout());

			cards[38]= new JFrame ("Queen of Clubs") ;
				cards[38].setSize(240,320);
				cards[38].setLayout(new BorderLayout());
				JLabel background38 = new JLabel (new ImageIcon("img/QueenOfClubs.png"));
				cards[38].add(background38);
				background38.setLayout(new FlowLayout());

			cards[39]= new JFrame ("King of Clubs");
				cards[39].setSize(240,320);
				cards[39].setLayout(new BorderLayout());
				JLabel background39 = new JLabel (new ImageIcon("img/KingOfClubs.png"));
				cards[39].add(background39);
				background39.setLayout(new FlowLayout());

			cards[40]= new JFrame ("Ace of Spades"); 
				cards[40].setSize(240,320);
				cards[40].setLayout(new BorderLayout());
				JLabel background40 = new JLabel (new ImageIcon("img/AceOfSpades.png"));
				cards[40].add(background40);
				background40.setLayout(new FlowLayout());

			cards[41]= new JFrame ("Two of Spades"); 
				cards[41].setSize(240,320);
				cards[41].setLayout(new BorderLayout());
				JLabel background41 = new JLabel (new ImageIcon("img/TwoOfSpades.png"));
				cards[41].add(background41);
				background41.setLayout(new FlowLayout());

			cards[42]= new JFrame ("Three of Spades"); 
				cards[42].setSize(240,320);
				cards[42].setLayout(new BorderLayout());
				JLabel background42 = new JLabel (new ImageIcon("img/ThreeOfSpades.png"));
				cards[42].add(background42);
				background42.setLayout(new FlowLayout());

			cards[43]= new JFrame ("Four of Spades"); 
				cards[43].setSize(240,320);
				cards[43].setLayout(new BorderLayout());
				JLabel background43 = new JLabel (new ImageIcon("img/FourOfSpades.png"));
				cards[43].add(background43);
				background43.setLayout(new FlowLayout());

			cards[44]= new JFrame ("Five of Spades") ;
				cards[44].setSize(240,320);
				cards[44].setLayout(new BorderLayout());
				JLabel background44 = new JLabel (new ImageIcon("img/FiveOfSpades.png"));
				cards[44].add(background44);
				background44.setLayout(new FlowLayout());

			cards[45]= new JFrame ("Six of Spades") ;
				cards[45].setSize(240,320);
				cards[45].setLayout(new BorderLayout());
				JLabel background45 = new JLabel (new ImageIcon("img/SixOfSpades.png"));
				cards[45].add(background45);
				background45.setLayout(new FlowLayout());

			cards[46]= new JFrame ("Seven of Spades");
				cards[46].setSize(240,320);
				cards[46].setLayout(new BorderLayout());
				JLabel background46 = new JLabel (new ImageIcon("img/SevenOfSpades.png"));
				cards[46].add(background46);
				background46.setLayout(new FlowLayout());

			cards[47]= new JFrame ("Eight of Spades") ;
				cards[47].setSize(240,320);
				cards[47].setLayout(new BorderLayout());
				JLabel background47 = new JLabel (new ImageIcon("img/EightOfSpades.png"));
				cards[47].add(background47);
				background47.setLayout(new FlowLayout());

			cards[48]= new JFrame ("Nine of Spades") ;
				cards[48].setSize(240,320);
				cards[48].setLayout(new BorderLayout());
				JLabel background48 = new JLabel (new ImageIcon("img/NineOfSpades.png"));
				cards[48].add(background48);
				background48.setLayout(new FlowLayout());

			cards[49]= new JFrame ("Ten of Spades");
				cards[49].setSize(240,320);
				cards[49].setLayout(new BorderLayout());
				JLabel background49 = new JLabel (new ImageIcon("img/TenOfSpades.png"));
				cards[49].add(background49);
				background49.setLayout(new FlowLayout());

			cards[50]= new JFrame ("Jack of Spades") ;
				cards[50].setSize(240,320);
				cards[50].setLayout(new BorderLayout());
				JLabel background50 = new JLabel (new ImageIcon("img/JackOfSpades.png"));
				cards[50].add(background50);
				background50.setLayout(new FlowLayout());

			cards[51]= new JFrame ("Queen of Spades") ;
				cards[51].setSize(240,320);
				cards[51].setLayout(new BorderLayout());
				JLabel background51 = new JLabel (new ImageIcon("img/QueenOfSpades.png"));
				cards[51].add(background51);
				background51.setLayout(new FlowLayout());

			cards[52]= new JFrame ("King of Spades");
				cards[52].setSize(240,320);
				cards[52].setLayout(new BorderLayout());
				JLabel background52 = new JLabel (new ImageIcon("img/KingOfSpades.png"));
				cards[52].add(background52);
				background52.setLayout(new FlowLayout());

			

			//The home screen

			initialframe = new JFrame("BlackJack"); 
			JPanel initialpane = new JPanel();
			initialframe.getContentPane().add(initialpane);
			JLabel label = new JLabel("Press 'Deal Cards' to Play");
			JButton deal = new JButton("Deal Cards");
			JButton hit = new JButton("Hit Me!");
			JButton exit = new JButton("Exit");
			JButton redeal = new JButton("New Game");
			JButton stand = new JButton("Stand");
			//JLabel picture = new JLabel (new ImageIcon("img/background.png"));
			//initialframe.add(picture);
			//picture.setLayout(new FlowLayout());
			initialpane.add(label);
			initialpane.add(deal);
			initialpane.add(hit);
			initialpane.add(stand);
			initialpane.add(redeal);
			initialpane.add(exit);
			
			initialframe.setSize(240,320);
			initialframe.setIconImage(new ImageIcon("Users/matthewha/Desktop/blackjack/blackjack.jpg").getImage());
			
			// centers home screen, or initial frame

			Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
				int w= initialframe.getSize().width;
				int h = initialframe.getSize().height;
				int x = (dim.width-w)/2;
				int y = (dim.height-h)/2;
			initialframe.setLocation(x,y);
			initialframe.setBackground(Color.GREEN);
			initialframe.setVisible(true);
			initialframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

			exit.addActionListener(new ActionListener(){
			@Override	
                            public void actionPerformed(ActionEvent e1){
					System.exit(0);
				}
			});
			
			// integers used for the random number range

			int i;
			final int low=1;
			final int high=52;

	deal.addActionListener(new ActionListener(){
                        @Override
			public void actionPerformed(ActionEvent e1){
				
				 rnd = (int)(Math.random() * (high-low+1))+low; //generates random number
                 rnd2 = (int)(Math.random() * (high-low+1))+low; //generates random number
                      	shit = cards[rnd]; //creates a card(from the array) with a random number index 
                      	shit2=cards[rnd2]; //second card
                        shit.setVisible(true);
                        shit2.setVisible(true);
                        shit.setLocation(0,0);
                        shit2.setLocation(0,0);
                        animation1(); //So the cards aren't on top ov eachother
                        
                        cardvalues(); 


						val = values[rnd]; // value of the first card
						val2 = values[rnd2]; //value of the second card

				computer(); //Computer Dealer gets cards

			if((rnd==1||rnd==14||rnd==27||rnd==40)&&(rnd2==1||rnd2==14||rnd2==27||rnd2==40)){
				//nothing here yet, this is for when there's two aces

			}
				//If the first card is an ace

			else if(rnd==1||rnd==14||rnd==27||rnd==40){
				
				aceframe();

				one.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent e1){
						
						aceframeVal(1);
					}

				});

				eleven.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent e1){

						aceframeVal(11);
					}

				});
		}

		//if the second card is an ace
		else if(rnd2==1||rnd2==14||rnd2==27||rnd2==40){
				
				aceframe();

				one.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent e1){
						
						aceframeVal2(1);
					}

				});
				eleven.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent e1){
						
						aceframeVal2(11);
					}

				});

		}
		//if no cards are aces

		else{
						
						checkval = val+val2;
						System.out.println(checkval);

                        
				}


			}});
		
			

		hit.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e1){
				
				clicked++;
				int i;
				
				
					rnd3 = (int)(Math.random() * (high-low+1))+low; //third random number
				
                    piss=cards[rnd3];
					piss.setVisible(true);
					int xcoor=shit2.getLocation().x;
					int ycoor=shit2.getLocation().y;
					piss.setLocation(xcoor+100,ycoor+100);

						cardvalues();
					
					if(rnd3==1 || rnd3==14 || rnd3==27 || rnd3== 40){
						aceframe();

							one.addActionListener(new ActionListener(){
								public void actionPerformed(ActionEvent e1){

										val3=1;
										checkval = val3 + checkval;
										System.out.println(checkval);

										ace.dispose();

										if(checkval>21){
											lose("You busted by going over 21.");
										}
										if(checkval==21 || (checkval<21 && compcheck>21) || (checkval>compcheck)){
											win("BlackJack!");

										}
									}

								});

								eleven.addActionListener(new ActionListener(){
									public void actionPerformed(ActionEvent e1){

										val3=11;
										checkval = val3+checkval;
										System.out.println(checkval);

										ace.dispose();

										if(checkval>21){
										lose("You busted by going over 21.");
										}
										if(checkval==21){
											win("BlackJack!");

									}
									}

								});
							}

			else{
					
					val3=values[rnd3]; //gets the value of the HIT card
					checkval = val3+checkval; //increases the sum with each HIT card
					System.out.println(checkval);
					//System.out.println(clicked);

					if(checkval>21){
						lose("You busted by going over 21.");
					}
					if(checkval==21){
						win("BlackJack!");

					}


				

			}
		}});
		
		stand.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e1){
				if(compcheck>21 || checkval>compcheck){
					win("Your Card Value is Higher Than The Dealer's");
				}

				else if(checkval<compcheck){
					lose("Dealer Beats You         ");
				}


			}
		});
		redeal.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e1){
				shit.dispose();
				shit2.dispose();

				int loopval;

			for(loopval=0; loopval==clicked; loopval++)
				piss.dispose();

				rnd = (int)(Math.random() * (high-low+1))+low;
                rnd2 = (int)(Math.random() * (high-low+1))+low;
                      	shit = cards[rnd];
                      	shit2=cards[rnd2];
                        shit.setVisible(true);
                        shit2.setVisible(true);
                        animation1();

			            if((rnd==1||rnd==14||rnd==27||rnd==40)&&(rnd2==1||rnd2==14||rnd2==27||rnd2==40)){
							//nothing here yet, this is for when there's two aces

						}
							//If the first card is an ace

						else if(rnd==1||rnd==14||rnd==27||rnd==40){
							
							aceframe();

							one.addActionListener(new ActionListener(){
								public void actionPerformed(ActionEvent e1){

									aceframeVal(1);
								}

							});

							eleven.addActionListener(new ActionListener(){
								public void actionPerformed(ActionEvent e1){

									aceframeVal(11);
								}

							});
						}

					//if the second card is an ace
					else if(rnd2==1||rnd2==14||rnd2==27||rnd2==40){
							
							aceframe();

							one.addActionListener(new ActionListener(){
								public void actionPerformed(ActionEvent e1){
									
									aceframeVal2(1);
								}

							});
							eleven.addActionListener(new ActionListener(){
								public void actionPerformed(ActionEvent e1){
									
									aceframeVal2(11);
								}

							});

					}
					//if no cards are aces

					else{
									
									checkval = val+val2;
									System.out.println(checkval);

			                        
							}

			}
		});
	}

	//not sure if this works or not, moves the cards so that they're not directly on top of eachther
	public void animation1(){
		Timer timer = new Timer(40, new ActionListener(){
			
			public void actionPerformed(ActionEvent e){
				Point location = shit2.getLocation();
				Point to = new Point(location);
				if(to.x<100){
					to.x+=50;
					if(to.x>100){
						to.x=100;
					}
				}
				if(to.y<100){
					to.y+=50;
					if(to.y>100){
						to.y=100;
					}
				}
				shit.setLocation(to);
				 if (to.equals(location)) {
                            ((Timer)e.getSource()).stop();
                        }
				
			}

		});

				timer.setRepeats(false);
				timer.start();


	


	}
	//values of the cards
	public void cardvalues(){
			values = new int[53];
				values[0]=0;
				values[1]=1;
				values[2]=2;
				values[3]=3;
				values[4]=4;
				values[5]=5;
				values[6]=6;
				values[7]=7;
				values[8]=8;
				values[9]=9;
				values[10]=10;
				values[11]=10;
				values[12]=10;
				values[13]=10;
				values[14]=1;
				values[15]=2;
				values[16]=3;
				values[17]=4;
				values[18]=5;
				values[19]=6;
				values[20]=7;
				values[21]=8;
				values[22]=9;
				values[23]=10;
				values[24]=10;
				values[25]=10;
				values[26]=10;
				values[27]=1;
				values[28]=2;
				values[29]=3;
				values[30]=4;
				values[31]=5;
				values[32]=6;
				values[33]=7;
				values[34]=8;
				values[35]=9;
				values[36]=10;
				values[37]=10;
				values[38]=10;
				values[39]=10;
				values[40]=1;
				values[41]=2;
				values[42]=3;
				values[43]=4;
				values[44]=5;
				values[45]=6;
				values[46]=7;
				values[47]=8;
				values[48]=9;
				values[49]=10;
				values[50]=10;
				values[51]=10;
				values[52]=10;
				
		
	}

	public void lose(String losephrase){
		final JFrame lose = new JFrame("You lose");
		JPanel losepane = new JPanel();
		JLabel loselabel = new JLabel(losephrase);
		JButton okay = new JButton("Okay");
		lose.getContentPane().add(losepane);
		losepane.add(loselabel);
		losepane.add(okay);
		lose.setSize(200,200);
		lose.setVisible(true);
		lose.setBackground(Color.RED);
		okay.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e1){
				lose.dispose();
			}

		});
	}
public void win(String winphrase){
		final JFrame win = new JFrame("You Win!");
		JPanel winpane = new JPanel();
		JLabel winlabel = new JLabel(winphrase);
		JButton okay = new JButton("Okay");
		win.getContentPane().add(winpane);
		winpane.add(winlabel);
		winpane.add(okay);
		win.setSize(200,200);
		win.setVisible(true);
		win.setBackground(Color.YELLOW);
		okay.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e1){
				win.dispose();
			}

		});
	}

public void computer(){
	int low=1;
	int high=52;

	comprnd=(int)(Math.random() * (high-low+1))+low;
	comprnd2=(int)(Math.random() * (high-low+1))+low;
	compval = values[comprnd];
	compval2 = values[comprnd2];
	compcheck = compval+compval2;
	System.out.println("Dealer Value= "+compcheck);

	compHitStand();



}
public void compHitStand(){
	if (compcheck<=16){
		compHit();
		


	}

}
public void compHit(){
	int low=1;
	int high=52;
	comprnd3=(int)(Math.random() * (high-low+1))+low;

	cardvalues();

	compval3=values[comprnd3];
	compcheck=compval+compval2+compval3;
	System.out.println("Dealer Value After Hit= "+compcheck);

}
public void aceframe(){
	ace = new JFrame();
	JPanel acepane = new JPanel();
	ace.getContentPane().add(acepane);
	JLabel acelabel = new JLabel("You have an Ace, choose its value:");
    one = new JButton("One");
	eleven = new JButton("Eleven");
	acepane.add(acelabel);
	acepane.add(one);
	acepane.add(eleven);
	ace.setSize(260,200);
	ace.setVisible(true);
	int ace_x=initialframe.getLocation().x;
	int ace_y=initialframe.getLocation().y;
	ace.setLocation(ace_x, ace_y-300);
}

public void aceframeVal(int aceVal){
	val = aceVal; //ace has value of one
	val2 = values[rnd2]; //second card has its normal value
	checkval = val + val2;
	System.out.println(checkval);

	ace.dispose();
}

public void aceframeVal2(int aceVal){
	val2=aceVal;
	val = values[rnd];
	checkval = val + val2;
	System.out.println(checkval);

	ace.dispose();


}

}
	