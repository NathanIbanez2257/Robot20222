
package frc.robot;


public final class Constants 
{

public static int 


///////////////////////////////         Controllers         /////////////////////////////////////////////////

jasmine = 0, gio = 1, daniel = 2,                               // controller ports

leftDriveAxis = 1, rightDriveAxis = 5,                      // controller axis 




///////////////////////////////         Falcon Id's        /////////////////////////////////////////////////

rightFront = 10, rightRear = 11, leftFront = 13, leftRear = 12,      // drive ID's

shooterMotor = 16, cascadeMotor = 18,                                // cascade ID's

rotaryArmMotor = 15,                                                 // rotary arm ID



////////////////////////////////        Talon SRX       //////////////////////////////////////////////

indexMotor = 20,                                                     // indexer ID






///////////////////////////////           Controller Buttons        ////////////////////////////////////////




                    /////////////           Jasmine Controls              ///////////////

rotaryForwardButton = 6, rotaryBackwardButton = 8,              // rotary arms buttons 

cascadeDownButton = 7, cascadeUpButton = 5,                     // cascade buttons

IndexerInButton = 5, IndexerOutButton = 7,                      // indexer buttons

shooterButton = 6, shooterRev1 = 12,                            // shooter buttons

aimRobotButton = 14,                                            // aim button



                    ////////////        Gio Controls            //////////////////

rotaryForwardButton2 = 1, rotaryBackwardButton2 = 4,            // rotary arms buttons

cascadeDownButton2 = 8, cascadeUpButton2 = 8,                   // cascade buttons

IndexerOut2Button = 6, IndexerIn2Button = 5,                    // indexer buttons
IndexerInMax2Button = 9,

shooterMax = 10, shooterClose = 7, shooterMid = 8,                 // shooter controls
shooterFar = 4, shooterRev = 6,                                // shooter controls 

aimRobotButton2 = 7,                                            // aiming button    




                    ////////////        Daniel Controls            //////////////////

rotaryForwardButton3 = 1, rotaryBackwardButton3 = 4,            // rotary arms buttons

cascadeDownButton3 = 8, cascadeUpButton3 = 8,                   // cascade buttons

IndexerOut3Button = 5, IndexerIn3Button = 6,                    // indexer buttons

shooterButton3 = 8, shooter9_3 = 4, shooter8_3 = 3,             // shooter controls
shooter7_3 = 2, shooter6_3 = 1, shooterRev3 = 5,                // shooter controls 

aimRobotButton3 = 7;                                            // aiming button  









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

