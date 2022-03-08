
package frc.robot;

import edu.wpi.first.wpilibj.DigitalInput;
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
import edu.wpi.first.wpilibj2.command.ParallelCommandGroup;
import edu.wpi.first.wpilibj2.command.RunCommand;
import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
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
  

  Joystick nathan = new Joystick(Constants.nathan);
  Joystick gio = new Joystick(Constants.gio);
  Joystick daniel = new Joystick(Constants.daniel);


  /*RunCommand gioMove = new RunCommand(() -> driveSub.move
  (Constants.driveSpeed*gio.getRawAxis(1),
  Constants.driveSpeed*gio.getRawAxis(5)),driveSub);*/

  

  /*RunCommand nathanMove = new RunCommand(() -> driveSub.move
  (Constants.driveSpeed*nathan.getRawAxis(Constants.leftDriveAxis),
  Constants.driveSpeed*nathan.getRawAxis(Constants.rightDriveAxis)),driveSub);
  

  /*RunCommand danielMove = new RunCommand(() -> driveSub.move
  (Constants.driveSpeed*daniel.getRawAxis(Constants.leftDriveAxis),
  Constants.driveSpeed*daniel.getRawAxis(Constants.rightDriveAxis)),driveSub);*/

  public RobotContainer() 
  {

  
    //////////////////////////////////////////////    Jasmine Controls       /////////////////////////////////////////////////




                          ////////////    Drive Controls      ///////////////

    //driveSub.setDefaultCommand(nathanMove);




                        //////////////     Cascade Controls    ////////////////

    JoystickButton cascadeUp = new JoystickButton(nathan, Constants.cascadeUpButton);
    cascadeUp.whileHeld(cascadeMoveUp);
   
    JoystickButton cascadeDown = new JoystickButton(nathan,Constants.cascadeDownButton);
    cascadeDown.whileHeld(cascadeMoveDown);

    


                        //////////////      Rotary Arms Controls    /////////////////

    JoystickButton rotaryForward = new JoystickButton(nathan, Constants.rotaryForwardButton);
    rotaryForward.whileHeld(rotateForward);

    JoystickButton rotaryBackward = new JoystickButton(nathan, Constants.rotaryBackwardButton);
    rotaryBackward.whileHeld(rotateBackward);
    
    






    ////////////////////////////////////////////////   Gio Controls     ////////////////////////////////////////////////////////



                                  /////////////////    Drive Controls      /////////////////////
                                  
    //driveSub.setDefaultCommand(gioMove);
    
   
    

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



    
                                //////////////      Indexer  Controls     ///////////////////////

    JoystickButton indexerInGio = new JoystickButton(gio, Constants.IndexerInGio);
    indexerInGio.whileHeld(indexerIn);

    JoystickButton indexerMaxGio = new JoystickButton(gio, Constants.IndexerInMaxGio);
    indexerMaxGio.whileHeld(indexerInMax);

    JoystickButton indexerOutGio = new JoystickButton(gio, Constants.IndexerOutGio);
    indexerOutGio.whileHeld(indexerOut);
    



                                //////////////      Aiming Controls       /////////////////////

    /*JoystickButton aimingRobot2 = new JoystickButton(ish, Constants.aimRobotButton2);
    aimingRobot2.whileHeld(aimRobot);*/









////////////////////////////////////////////////    Daniel Controls     ////////////////////////////////////////////////////////



                                  /////////////////    Drive Controls      /////////////////////
                  
    //driveSub.setDefaultCommand(danielMove);


/*
                                  ////////////////    Shooter Controls      ////////////////////

    JoystickButton shooterRevDaniel = new JoystickButton(daniel, Constants.shooterRevDaniel);
    shooterRevDaniel.whileHeld(shooterReverse);
    
    JoystickButton shooterMaxDaniel = new JoystickButton(daniel, Constants.shooterMaxDaniel);
    shooterMaxDaniel.whileHeld(shooterMax);

    JoystickButton shooterFarDaniel = new JoystickButton(daniel, Constants.shooterFarDaniel);
    shooterFarDaniel.whileHeld(shooterFar);

    JoystickButton shooterMidDaniel = new JoystickButton(daniel, Constants.shooterMidDaniel);
    shooterMidDaniel.whileHeld(shooterMid);

    JoystickButton shooterCloseDaniel = new JoystickButton(daniel, Constants.shooterCloseDaniel);
    shooterCloseDaniel.whileHeld(shooterClose);




    /*
                                //////////////      Indexer  Controls     ///////////////////////

    JoystickButton indexerInDaniel = new JoystickButton(daniel, Constants.IndexerInDaniel);
    indexerInDaniel.whileHeld(indexerIn);

    JoystickButton indexerMaxDaniel = new JoystickButton(daniel, Constants.IndexerMaxDaniel);
    indexerMaxDaniel.whileHeld(indexerInMax);

    JoystickButton indexerOutDaniel = new JoystickButton(daniel, Constants.IndexerOutDaniel);
    indexerOutDaniel.whileHeld(indexerOut);
    



                                //////////////      Aiming Controls       /////////////////////

    /*JoystickButton aimingRobotDaniel = new JoystickButton(daniel, Constants.aimRobotButtonDaniel);
    aimingRobotDaniel.whileHeld(aimRobot);*/


    configureButtonBindings();

  }




 
  private void configureButtonBindings() 
  {
    
  }

 
  public Command getAutonomousCommand() {

    return null;
  }
}
