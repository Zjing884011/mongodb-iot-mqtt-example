/*
 * Copyright 2014 MbientLab Inc. All rights reserved.
 *
 * IMPORTANT: Your use of this Software is limited to those specific rights
 * granted under the terms of a software license agreement between the user who 
 * downloaded the software, his/her employer (which must be your employer) and 
 * MbientLab Inc, (the "License").  You may not use this Software unless you 
 * agree to abide by the terms of the License which can be found at 
 * www.mbientlab.com/terms . The License limits your use, and you acknowledge, 
 * that the  Software may not be modified, copied or distributed and can be used 
 * solely and exclusively in conjunction with a MbientLab Inc, product.  Other 
 * than for the foregoing purpose, you may not use, reproduce, copy, prepare 
 * derivative works of, modify, distribute, perform, display or sell this 
 * Software and/or its documentation for any purpose.
 *
 * YOU FURTHER ACKNOWLEDGE AND AGREE THAT THE SOFTWARE AND DOCUMENTATION ARE 
 * PROVIDED "AS IS" WITHOUT WARRANTY OF ANY KIND, EITHER EXPRESS OR IMPLIED, 
 * INCLUDING WITHOUT LIMITATION, ANY WARRANTY OF MERCHANTABILITY, TITLE, 
 * NON-INFRINGEMENT AND FITNESS FOR A PARTICULAR PURPOSE. IN NO EVENT SHALL 
 * MBIENTLAB OR ITS LICENSORS BE LIABLE OR OBLIGATED UNDER CONTRACT, NEGLIGENCE, 
 * STRICT LIABILITY, CONTRIBUTION, BREACH OF WARRANTY, OR OTHER LEGAL EQUITABLE 
 * THEORY ANY DIRECT OR INDIRECT DAMAGES OR EXPENSES INCLUDING BUT NOT LIMITED 
 * TO ANY INCIDENTAL, SPECIAL, INDIRECT, PUNITIVE OR CONSEQUENTIAL DAMAGES, LOST 
 * PROFITS OR LOST DATA, COST OF PROCUREMENT OF SUBSTITUTE GOODS, TECHNOLOGY, 
 * SERVICES, OR ANY CLAIMS BY THIRD PARTIES (INCLUDING BUT NOT LIMITED TO ANY 
 * DEFENSE THEREOF), OR OTHER SIMILAR COSTS.
 *
 * Should you have any questions regarding your right to use this Software, 
 * contact MbientLab Inc, at www.mbientlab.com.
 */
package com.mbientlab.metawear.api.characteristic;

import java.util.UUID;

import com.mbientlab.metawear.api.GATT;
import com.mbientlab.metawear.api.GATT.GATTCharacteristic;

/**
 * Enumeration of GATT characteristics specific to Device Information service.
 * @author Eric Tsai
 * @see com.mbientlab.metawear.api.GATT.GATTService#DEVICE_INFORMATION
 */
public enum DeviceInformation implements GATTCharacteristic { 
    /** Manufacturer's name i.e. Mbient Lab*/
    MANUFACTURER_NAME("29"),
    /** Serial number of the device */
    SERIAL_NUMBER("25"),
    /** Firmware version on the device */
    FIRMWARE_VERSION("26"),
    /** Hardware version of the device */
    HARDWARE_VERSION("27");
    
    private final UUID uuid;
    private DeviceInformation(String uuidPart) {
        this.uuid= UUID.fromString(String.format("00002a%s-0000-1000-8000-00805f9b34fb", uuidPart));
    }
    
    @Override
    public UUID uuid() { return uuid; }
    
    @Override
    public GATTService gattService() { return GATT.GATTService.DEVICE_INFORMATION; }
}
