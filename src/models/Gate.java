package models;

public class Gate extends BaseModel{
    private Long gateNum;
    private GateType gateType;
    private GateStatus gateStatus;

    public Long getGateNum() {
        return gateNum;
    }

    public void setGateNum(Long gateNum) {
        this.gateNum = gateNum;
    }

    public GateType getGateType() {
        return gateType;
    }

    public void setGateType(GateType gateType) {
        this.gateType = gateType;
    }

    public GateStatus getGateStatus() {
        return gateStatus;
    }

    public void setGateStatus(GateStatus gateStatus) {
        this.gateStatus = gateStatus;
    }
}
