package frc3128.AutoTarget;

import com.sun.squawk.util.MathUtils;
import frc3128.Connection.CameraCon;
import frc3128.DebugLog;
import frc3128.EventManager.EventSequence.SequenceEvent;
import frc3128.Global;

/*public class ATiltLock extends SequenceEvent {
    private double angle = 0;
    private boolean isLocked = false;
    private boolean taskDone = false;
    private double max = -34.0;
    
    public void execute() {
        if(!Global.msTilt.hasLock(this)) Global.msTilt.getLock(this);        
        if(this.getRunTimeMillis() > 3000) Global.robotStop();
        
        if(!isLocked) {
            this.angle = -180*(MathUtils.atan2(92, CameraCon.distToGoal))/(Math.PI)*0.9;
            if(CameraCon.distToGoal != 0) isLocked = true;
            else return;
        }
        
        DebugLog.log(5, referenceName, "angle: "+angle+" cAng: "+Global.gTilt.getAngle() + " pow:" + Global.msTilt.get());
        if(this.angle < this.max) {DebugLog.log(1, referenceName, "Tilt targeted to invalid angle! " + this.angle); this.angle = this.max;} 
        if(this.angle > -1) {DebugLog.log(1, referenceName, "Tilt targeted to invalid angle! " + this.angle); this.angle = 0;}
        
        if(isLocked && Math.abs(angle - Global.gTilt.getAngle()) > 1.0) 
            Global.msTilt.set(-1.0*(angle - Global.gTilt.getAngle())/55.0+0.15, this);
        else {
            if(isLocked) {Global.msTilt.set(.15, this); taskDone = true;}
        }
    }

    public boolean exitConditionMet() {
        if(taskDone) {
            Global.msTilt.releaseLock(this);
            this.isLocked = false;
        }
        return taskDone;
    }
}*/
