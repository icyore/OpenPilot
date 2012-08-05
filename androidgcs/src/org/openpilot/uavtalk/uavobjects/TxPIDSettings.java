/**
 ******************************************************************************
 *
 * @file       uavobjecttemplate.cpp
 * @author     The OpenPilot Team, http://www.openpilot.org Copyright (C) 2010.
 * @brief      Template for an uavobject in java
 *             This is a autogenerated file!! Do not modify and expect a result.
 *             Settings used by @ref TxPID optional module to tune PID settings using R/C transmitter
 *
 * @see        The GNU Public License (GPL) Version 3
 *
 *****************************************************************************/
/*
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY
 * or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License
 * for more details.
 *
 * You should have received a copy of the GNU General Public License along
 * with this program; if not, write to the Free Software Foundation, Inc.,
 * 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA
 */

package org.openpilot.uavtalk.uavobjects;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

import org.openpilot.uavtalk.UAVObjectManager;
import org.openpilot.uavtalk.UAVObject;
import org.openpilot.uavtalk.UAVDataObject;
import org.openpilot.uavtalk.UAVObjectField;

/**
Settings used by @ref TxPID optional module to tune PID settings using R/C transmitter

generated from txpidsettings.xml
 **/
public class TxPIDSettings extends UAVDataObject {

	public TxPIDSettings() {
		super(OBJID, ISSINGLEINST, ISSETTINGS, NAME);
		
		List<UAVObjectField> fields = new ArrayList<UAVObjectField>();
		

		List<String> ThrottleRangeElemNames = new ArrayList<String>();
		ThrottleRangeElemNames.add("Min");
		ThrottleRangeElemNames.add("Max");
		fields.add( new UAVObjectField("ThrottleRange", "%", UAVObjectField.FieldType.FLOAT32, ThrottleRangeElemNames, null) );

		List<String> MinPIDElemNames = new ArrayList<String>();
		MinPIDElemNames.add("Instance1");
		MinPIDElemNames.add("Instance2");
		MinPIDElemNames.add("Instance3");
		fields.add( new UAVObjectField("MinPID", "", UAVObjectField.FieldType.FLOAT32, MinPIDElemNames, null) );

		List<String> MaxPIDElemNames = new ArrayList<String>();
		MaxPIDElemNames.add("Instance1");
		MaxPIDElemNames.add("Instance2");
		MaxPIDElemNames.add("Instance3");
		fields.add( new UAVObjectField("MaxPID", "", UAVObjectField.FieldType.FLOAT32, MaxPIDElemNames, null) );

		List<String> UpdateModeElemNames = new ArrayList<String>();
		UpdateModeElemNames.add("0");
		List<String> UpdateModeEnumOptions = new ArrayList<String>();
		UpdateModeEnumOptions.add("Never");
		UpdateModeEnumOptions.add("When Armed");
		UpdateModeEnumOptions.add("Always");
		fields.add( new UAVObjectField("UpdateMode", "option", UAVObjectField.FieldType.ENUM, UpdateModeElemNames, UpdateModeEnumOptions) );

		List<String> InputsElemNames = new ArrayList<String>();
		InputsElemNames.add("Instance1");
		InputsElemNames.add("Instance2");
		InputsElemNames.add("Instance3");
		List<String> InputsEnumOptions = new ArrayList<String>();
		InputsEnumOptions.add("Throttle");
		InputsEnumOptions.add("Accessory0");
		InputsEnumOptions.add("Accessory1");
		InputsEnumOptions.add("Accessory2");
		InputsEnumOptions.add("Accessory3");
		InputsEnumOptions.add("Accessory4");
		InputsEnumOptions.add("Accessory5");
		fields.add( new UAVObjectField("Inputs", "channel", UAVObjectField.FieldType.ENUM, InputsElemNames, InputsEnumOptions) );

		List<String> PIDsElemNames = new ArrayList<String>();
		PIDsElemNames.add("Instance1");
		PIDsElemNames.add("Instance2");
		PIDsElemNames.add("Instance3");
		List<String> PIDsEnumOptions = new ArrayList<String>();
		PIDsEnumOptions.add("Disabled");
		PIDsEnumOptions.add("Roll Rate.Kp");
		PIDsEnumOptions.add("Pitch Rate.Kp");
		PIDsEnumOptions.add("Roll+Pitch Rate.Kp");
		PIDsEnumOptions.add("Yaw Rate.Kp");
		PIDsEnumOptions.add("Roll Rate.Ki");
		PIDsEnumOptions.add("Pitch Rate.Ki");
		PIDsEnumOptions.add("Roll+Pitch Rate.Ki");
		PIDsEnumOptions.add("Yaw Rate.Ki");
		PIDsEnumOptions.add("Roll Rate.Kd");
		PIDsEnumOptions.add("Pitch Rate.Kd");
		PIDsEnumOptions.add("Roll+Pitch Rate.Kd");
		PIDsEnumOptions.add("Yaw Rate.Kd");
		PIDsEnumOptions.add("Roll Rate.ILimit");
		PIDsEnumOptions.add("Pitch Rate.ILimit");
		PIDsEnumOptions.add("Roll+Pitch Rate.ILimit");
		PIDsEnumOptions.add("Yaw Rate.ILimit");
		PIDsEnumOptions.add("Roll Attitude.Kp");
		PIDsEnumOptions.add("Pitch Attitude.Kp");
		PIDsEnumOptions.add("Roll+Pitch Attitude.Kp");
		PIDsEnumOptions.add("Yaw Attitude.Kp");
		PIDsEnumOptions.add("Roll Attitude.Ki");
		PIDsEnumOptions.add("Pitch Attitude.Ki");
		PIDsEnumOptions.add("Roll+Pitch Attitude.Ki");
		PIDsEnumOptions.add("Yaw Attitude.Ki");
		PIDsEnumOptions.add("Roll Attitude.ILimit");
		PIDsEnumOptions.add("Pitch Attitude.ILimit");
		PIDsEnumOptions.add("Roll+Pitch Attitude.ILimit");
		PIDsEnumOptions.add("Yaw Attitude.ILimit");
		PIDsEnumOptions.add("GyroTau");
		fields.add( new UAVObjectField("PIDs", "option", UAVObjectField.FieldType.ENUM, PIDsElemNames, PIDsEnumOptions) );


		// Compute the number of bytes for this object
		int numBytes = 0;
		ListIterator<UAVObjectField> li = fields.listIterator();
		while(li.hasNext()) {
			numBytes += li.next().getNumBytes();
		}
		NUMBYTES = numBytes;

		// Initialize object
		initializeFields(fields, ByteBuffer.allocate(NUMBYTES), NUMBYTES);
		// Set the default field values
		setDefaultFieldValues();
		// Set the object description
		setDescription(DESCRIPTION);
	}

	/**
	 * Create a Metadata object filled with default values for this object
	 * @return Metadata object with default values
	 */
	public Metadata getDefaultMetadata() {
		UAVObject.Metadata metadata = new UAVObject.Metadata();
    	metadata.flags =
		    UAVObject.Metadata.AccessModeNum(UAVObject.AccessMode.ACCESS_READWRITE) << UAVOBJ_ACCESS_SHIFT |
		    UAVObject.Metadata.AccessModeNum(UAVObject.AccessMode.ACCESS_READWRITE) << UAVOBJ_GCS_ACCESS_SHIFT |
		    1 << UAVOBJ_TELEMETRY_ACKED_SHIFT |
		    1 << UAVOBJ_GCS_TELEMETRY_ACKED_SHIFT |
		    UAVObject.Metadata.UpdateModeNum(UAVObject.UpdateMode.UPDATEMODE_ONCHANGE) << UAVOBJ_TELEMETRY_UPDATE_MODE_SHIFT |
		    UAVObject.Metadata.UpdateModeNum(UAVObject.UpdateMode.UPDATEMODE_ONCHANGE) << UAVOBJ_GCS_TELEMETRY_UPDATE_MODE_SHIFT;
    	metadata.flightTelemetryUpdatePeriod = 0;
    	metadata.gcsTelemetryUpdatePeriod = 0;
    	metadata.loggingUpdatePeriod = 0;
 
		return metadata;
	}

	/**
	 * Initialize object fields with the default values.
	 * If a default value is not specified the object fields
	 * will be initialized to zero.
	 */
	public void setDefaultFieldValues()
	{
		getField("ThrottleRange").setValue(0.2,0);
		getField("ThrottleRange").setValue(0.8,1);
		getField("MinPID").setValue(0,0);
		getField("MinPID").setValue(0,1);
		getField("MinPID").setValue(0,2);
		getField("MaxPID").setValue(0,0);
		getField("MaxPID").setValue(0,1);
		getField("MaxPID").setValue(0,2);
		getField("UpdateMode").setValue("When Armed");
		getField("Inputs").setValue("Throttle",0);
		getField("Inputs").setValue("Accessory0",1);
		getField("Inputs").setValue("Accessory1",2);
		getField("PIDs").setValue("Disabled",0);
		getField("PIDs").setValue("Disabled",1);
		getField("PIDs").setValue("Disabled",2);

	}

	/**
	 * Create a clone of this object, a new instance ID must be specified.
	 * Do not use this function directly to create new instances, the
	 * UAVObjectManager should be used instead.
	 */
	public UAVDataObject clone(long instID) {
		// TODO: Need to get specific instance to clone
		try {
			TxPIDSettings obj = new TxPIDSettings();
			obj.initialize(instID, this.getMetaObject());
			return obj;
		} catch  (Exception e) {
			return null;
		}
	}

	/**
	 * Static function to retrieve an instance of the object.
	 */
	public TxPIDSettings GetInstance(UAVObjectManager objMngr, long instID)
	{
	    return (TxPIDSettings)(objMngr.getObject(TxPIDSettings.OBJID, instID));
	}

	// Constants
	protected static final long OBJID = 0x42B2D2AEl;
	protected static final String NAME = "TxPIDSettings";
	protected static String DESCRIPTION = "Settings used by @ref TxPID optional module to tune PID settings using R/C transmitter";
	protected static final boolean ISSINGLEINST = 1 > 0;
	protected static final boolean ISSETTINGS = 1 > 0;
	protected static int NUMBYTES = 0;


}
