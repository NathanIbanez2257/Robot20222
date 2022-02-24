
package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import frc.robot.commands.aimRobotCommand;
import frc.robot.commands.cascadeCommand;
import frc.robot.commands.indexerCommand;
import frc.robot.commands.rotaryArmsCommand;
import frc.robot.commands.shooterCommand;
import frc.robot.subsystems.cascade;
import frc.robot.subsystems.drive;
import frc.robot.subsystems.indexer;
import frc.robot.subsystems.rotaryArms;
import frc.robot.subsystems.shooter;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.RunCommand;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;

public class RobotContainer 
{

  private final shooter shooterSub = new shooter();
  private final drive driveSub = new drive();
  private final cascade cascadeSub = new cascade();
  private final indexer indexerSub = new indexer();
  private final rotaryArms rotarySub = new rotaryArms();


  private final shooterCommand shooterMax = new shooterCommand(shooterSub, Constants.shooterSpeed);
  private final shooterCommand shooterReverse = new shooterCommand(shooterSub, -.4 * Constants.shooterSpeed);
  private final shooterCommand shooterFar = new shooterCommand(shooterSub, .7 *Constants.shooterSpeed);
  private final shooterCommand shooterMid = new shooterCommand(shooterSub, .6 *Constants.shooterSpeed);
  private final shooterCommand shooterClose = new shooterCommand(shooterSub, .5 *Constants.shooterSpeed);

  
  private final cascadeCommand cascadeMoveUp = new cascadeCommand( cascadeSub, Constants.cascadeSpeed);
  private final cascadeCommand cascadeMoveDown = new cascadeCommand(cascadeSub, -1 * Constants.cascadeSpeed);
  private final indexerCommand indexerIn = new indexerCommand(indexerSub, Constants.indexerSpeed);

  private final indexerCommand indexerInMax = new indexerCommand(indexerSub, Constants.indexerSpeedMax);
  private final indexerCommand indexerOut = new indexerCommand(indexerSub, -.5 * Constants.indexerSpeed);

  private final rotaryArmsCommand rotateForward = new rotaryArmsCommand(rotarySub, Constants.rotaryArmSpeed);
  private final rotaryArmsCommand rotateBackward = new rotaryArmsCommand(rotarySub, -1 * Constants.rotaryArmSpeed);

  //private final aimRobotCommand aimRobot = new aimRobotCommand(driveSub, Constants.targetDistance);
  

  Joystick jasmine = new Joystick(Constants.jasmine);
  Joystick gio = new Joystick(Constants.gio);
  Joystick daniel = new Joystick(Constants.daniel);


  RunCommand move2 = new RunCommand(() -> driveSub.move(Constants.driveSpeed*gio.getRawAxis(1),
  Constants.driveSpeed*gio.getRawAxis(5)),driveSub);

  /*RunCommand move3 = new RunCommand(() -> driveSub.move
  (Constants.driveSpeed*daniel.getRawAxis(Constants.leftDriveAxis),
  Constants.driveSpeed*daniel.getRawAxis(Constants.rightDriveAxis)),driveSub);*/


  /*
  RunCommand cascadeMove = new RunCommand(() -> cascadeSub.cascadeMove
  (Constants.cascadeSpeed*jasmine.getRawAxis(Constants.leftDriveAxis)));

  RunCommand rotaryMove = new RunCommand(() -> rotarySub.rotateArms
  (Constants.rotaryArmSpeed*jasmine.getRawAxis(Constants.rightDriveAxis)));
*/


  /*RunCommand move1 = new RunCommand(() -> driveSub.move(Constants.driveSpeed*jasmine.getRawAxis(Constants.leftDriveAxis),
  Constants.driveSpeed*jasmine.getRawAxis(Constants.rightDriveAxis)),driveSub);
  */
  

  public RobotContainer() 
  {


    //////////////////////////////////////////////    Jasmine Controls       /////////////////////////////////////////////////




                          ////////////    Drive Controls      ///////////////

    //driveSub.setDefaultCommand(move1);




                          /////////////     Shooter Controls    /////////////////

    /*JoystickButton shooter = new JoystickButton(jasmine, Constants.shooterButton);
    shooter.whileHeld(shooterMove);*/




                        //////////////     Cascade Controls    ////////////////

    JoystickButton cascadeUp = new JoystickButton(jasmine, Constants.cascadeUpButton);
    cascadeUp.whileHeld(cascadeMoveUp);
   
    JoystickButton cascadeDown = new JoystickButton(jasmine,Constants.cascadeDownButton);
    cascadeDown.whileHeld(cascadeMoveDown);

    //cascadeSub.setDefaultCommand(cascadeMove);



                          /////////////     Indexer Controls      ///////////////

    /*JoystickButton indexerI = new JoystickButton(jasmine, Constants.IndexerInButton);
    indexerI.whileHeld(indexerIn);*/

    /*JoystickButton indexerO = new JoystickButton(jasmine, Constants.IndexerOutButton);
    indexerO.whileHeld(indexerOut);*/

    


                        //////////////      Rotary Arms Controls    /////////////////

    JoystickButton rotaryForward = new JoystickButton(jasmine, Constants.rotaryForwardButton);
    rotaryForward.whileHeld(rotateForward);

    JoystickButton rotaryBackward = new JoystickButton(jasmine, Constants.rotaryBackwardButton);
    rotaryBackward.whileHeld(rotateBackward);
    
    //rotarySub.setDefaultCommand(rotaryMove);

    
                        ////////////      Aiming Controls       ////////////////////

    /* JoystickButton aimingRobot = new JoystickButton(jasmine, Constants.aimRobotButton);
    aimingRobot.whileHeld(aimRobot);*/











    ////////////////////////////////////////////////   Ish Controls     ////////////////////////////////////////////////////////



                                  /////////////////    Drive Controls      /////////////////////
                                  
    driveSub.setDefaultCommand(move2);
    
   
    

                                  ////////////////    Shooter Controls      ////////////////////

    JoystickButton shooterRev2 = new JoystickButton(gio, Constants.shooterRev);
    shooterRev2.whileHeld(shooterReverse);
    
    JoystickButton shooterMaxGio = new JoystickButton(gio, Constants.shooterMax);
    shooterMaxGio.whileHeld(shooterMax);

    JoystickButton shooterFarGio = new JoystickButton(gio, Constants.shooterFar);
    shooterFarGio.whileHeld(shooterFar);

    JoystickButton shooterMidGio = new JoystickButton(gio, Constants.shooterMid);
    shooterMidGio.whileHeld(shooterMid);

    JoystickButton shooterCloseGio = new JoystickButton(gio, Constants.shooterClose);
    shooterCloseGio.whileHeld(shooterClose);




                                ///////////////     Cascade Controls      /////////////////////
    
    /*JoystickButton cascadeUp2 = new JoystickButton(ish, Constants.cascadeUpButton2);
    cascadeUp2.whileHeld(cascadeMoveUp);*/

    /*JoystickButton cascadeDown2 = new JoystickButton(ish,Constants.cascadeDownButton2);
    cascadeDown2.whileHeld(cascadeMoveDown);*/



    
                                //////////////      Indexer  Controls     ///////////////////////

    JoystickButton indexerI2 = new JoystickButton(gio, Constants.IndexerIn2Button);
    indexerI2.whileHeld(indexerIn);

    JoystickButton indexer2 = new JoystickButton(gio, Constants.IndexerInMax2Button);
    indexer2.whileHeld(indexerInMax);

    JoystickButton indexer2O = new JoystickButton(gio, Constants.IndexerOut2Button);
    indexer2O.whileHeld(indexerOut);
    



                                //////////////      Rotary Arms Controls   /////////////////////   

    /*JoystickButton rotaryForward2 = new JoystickButton(ish, Constants.rotaryForwardButton2);
    rotaryForward2.whileHeld(rotateForward);*/

    /*JoystickButton rotaryBackward2 = new JoystickButton(ish, Constants.rotaryBackwardButton2);
    rotaryBackward2.whileHeld(rotateBackward);*/




                                //////////////      Aiming Controls       /////////////////////

    /*JoystickButton aimingRobot2 = new JoystickButton(ish, Constants.aimRobotButton2);
    aimingRobot2.whileHeld(aimRobot);*/













////////////////////////////////////////////////    Daniel Controls     ////////////////////////////////////////////////////////



                                  /////////////////    Drive Controls      /////////////////////
                  
    //driveSub.setDefaultCommand(move3);


/*
                                  ////////////////    Shooter Controls      ////////////////////

    JoystickButton shooterRev3 = new JoystickButton(daniel, Constants.shooterRev3);
    shooterRev3.whileHeld(shooterReverse);
    
    JoystickButton shooter2_3 = new JoystickButton(daniel, Constants.shooterButton3);
    shooter2_3.whileHeld(shooterMove);

    JoystickButton shooter9_3 = new JoystickButton(daniel, Constants.shooter9_3);
    shooter9_3.whileHeld(shooter90);

    JoystickButton shooter8_3 = new JoystickButton(daniel, Constants.shooter8_3);
    shooter8_3.whileHeld(shooter80);

    JoystickButton shooter7_3 = new JoystickButton(daniel, Constants.shooter7_3);
    shooter7_3.whileHeld(shooter70);

    JoystickButton shooter6_3 = new JoystickButton(daniel, Constants.shooter6_3);
    shooter6_3.whileHeld(shooter60);




                                ///////////////     Cascade Controls      /////////////////////
    
    /*JoystickButton cascadeUp3 = new JoystickButton(daniel, Constants.cascadeUpButton2);
    cascadeUp3.whileHeld(cascadeMoveUp);*/

    /*JoystickButton cascadeDown3 = new JoystickButton(daniel,Constants.cascadeDownButton2);
    cascadeDown3.whileHeld(cascadeMoveDown);*/



    /*
                                //////////////      Indexer  Controls     ///////////////////////

    JoystickButton indexerI3 = new JoystickButton(daniel, Constants.IndexerIn3Button);
    indexerI3.whileHeld(indexerIn);

    JoystickButton indexer3 = new JoystickButton(daniel, Constants.IndexerIn3Button);
    indexer3.whileHeld(indexerInMax);

    JoystickButton indexer3O = new JoystickButton(daniel, Constants.IndexerOut3Button);
    indexer3O.whileHeld(indexerOut);
    



                                //////////////      Rotary Arms Controls   /////////////////////   

    /*JoystickButton rotaryForward3 = new JoystickButton(daniel, Constants.rotaryForwardButton3);
    rotaryForward2.whileHeld(rotateForward);*/

    /*JoystickButton rotaryBackward2 = new JoystickButton(daniel, Constants.rotaryBackwardButton3);
    rotaryBackward3.whileHeld(rotateBackward);*/




                                //////////////      Aiming Controls       /////////////////////

    /*JoystickButton aimingRobot2 = new JoystickButton(ish, Constants.aimRobotButton2);
    aimingRobot2.whileHeld(aimRobot);*/


    configureButtonBindings();

  }




 
  private void configureButtonBindings() 
  {
    
  }

 
  public Command getAutonomousCommand() {
    return null;
  }
}
