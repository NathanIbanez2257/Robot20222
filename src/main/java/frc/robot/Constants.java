
package frc.robot;


public final class Constants 
{

public static int 


///////////////////////////////         Controllers         /////////////////////////////////////////////////

nathan = 0, gio = 1, daniel = 2,                               // controller ports

leftDriveAxis = 1, rightDriveAxis = 5,                      // controller axis 




///////////////////////////////         Falcon Id's        /////////////////////////////////////////////////

rightFront = 10, rightRear = 11, leftFront = 13, leftRear = 12,      // drive ID's

shooterMotor = 16, cascadeMotor = 18,                                // cascade ID's

rotaryArmMotor = 15,                                                 // rotary arm ID



////////////////////////////////        Talon SRX       //////////////////////////////////////////////

indexMotor = 20,                                                     // indexer ID






///////////////////////////////           Controller Buttons        ////////////////////////////////////////




                    /////////////           Nathan Controls              ///////////////

rotaryForwardButton = 8, rotaryBackwardButton = 6,              // rotary arms buttons 

cascadeDownButton = 5, cascadeUpButton = 7,                     // cascade buttons




                    ////////////        Gio Controls            //////////////////

IndexerOutGio = 6, IndexerInGio = 5,                    // indexer buttons
IndexerInMaxGio = 9,

shooterMax = 10, shooterClose = 7, shooterMid = 8,              // shooter controls
shooterFar = 4, shooterRev = 6,                                 // shooter controls 

aimRobotButton2 = 7,                                            // aiming button    




                    ////////////        Daniel Controls            //////////////////

IndexerOutDaniel = 5, IndexerInDaniel = 6,                      // indexer buttons
IndexerMaxDaniel = 9,

shooterMaxDaniel = 10, shooterFarDaniel = 7, shooterMidDaniel = 8,   // shooter controls
shooterCloseDaniel = 4, shooterRevDaniel = 6,                       // shooter controls 

aimRobotButtonDaniel = 7;                                           // aiming button  









public static double


/////////////////////////////               Vision Tracking             ///////////////////////////////////

hubHeight = 8.667, limelightHeight = 2.25, bottomAngle = 15, targetDistance = 10,



/////////////////////////////               Pids For Shooting           ///////////////////////////////////

aimKP = .09, aimKI = 0.0001, aimKD = 0, distanceKP = 0, distanceKI = 0, distanceKD = 0, 



/////////////////////////////                    Encoder                     ///////////////////////////////////
kEncoderDistancePerPulse = ((Math.PI * 6)/24576),



/////////////////////////////                Subsystem Speeds                ///////////////////////////////////
shooterSpeed = -1, 

cascadeSpeed = .6, 

driveSpeed =.7, 

indexerSpeed = .5, 

indexerSpeedMax = .8, 

rotaryArmSpeed = .5;


}

