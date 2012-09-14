
package org.acbr4j.comm;

import gnu.io.CommPortIdentifier;
import gnu.io.PortInUseException;
import gnu.io.SerialPort;
import gnu.io.SerialPortEventListener;
import gnu.io.UnsupportedCommOperationException;

import java.io.IOException;
import java.util.Enumeration;
import java.util.EventListener;
import java.util.TooManyListenersException;



public class Serial extends AbstractPort {

	private SerialPort portSerial = null;
	
	private static Serial instance = null;

	private Serial() {

		super();

	}

	public static Serial getInstance() {

		if ( instance == null ) {
			instance = new Serial();
		}

		return instance;
	}

	/**
	 * Captura a porta aberta de define os objetos de entrada e saida.<BR>
	 * 
	 * @param portn
	 * @param serialParams 
	 * @param event
	 * @return boolean
	 */
	@SuppressWarnings( "unchecked" )
	public boolean activePort( final int portn, final SerialParams serialParams, final EventListener event ) {

		boolean result = false;
		String portstr = convPorta( portn );
		Enumeration<CommPortIdentifier> listaPortas = null;
		CommPortIdentifier ips = null;
		listaPortas = (Enumeration<CommPortIdentifier>) CommPortIdentifier.getPortIdentifiers();

		while ( listaPortas.hasMoreElements() ) {

			ips = listaPortas.nextElement();

			if ( ips.getName().equalsIgnoreCase( portstr ) ) {
				break;
			} else {
				ips = null;
			}

		}

		if ( ips != null ) {

			try {

				portSerial = (SerialPort) ips.open( "SComm", serialParams.getTimeout() );

				if ( portSerial != null ) {

					setInput( portSerial.getInputStream() );
					setOutput( portSerial.getOutputStream() );
					try {
						portSerial.setFlowControlMode( SerialPort.FLOWCONTROL_RTSCTS_OUT );
					} catch ( UnsupportedCommOperationException e ) {
						e.printStackTrace();
					}
					try {
						portSerial.setSerialPortParams( serialParams.getBauderate(), serialParams.getDatabits(), 
								serialParams.getStopbits(), serialParams.getParity() );
					} catch ( UnsupportedCommOperationException e ) {
						e.printStackTrace();
					}
					portSerial.setDTR( true );
					portSerial.setRTS( true );
					
					if (portSerial!=null) 
						result = true;
				}

			} catch ( PortInUseException e ) {
				e.printStackTrace();
			} catch ( IOException e ) {
				e.printStackTrace();
				// portaSerial = null;
			}	
			
			try {
				portSerial.addEventListener( (SerialPortEventListener) event );
				portSerial.notifyOnDataAvailable( true );
			} catch ( TooManyListenersException e ) {
				e.printStackTrace();
				result = false;
			}
		}

		return result;

	}
	
	public void disablePort() {
		
		if ( portSerial != null ) {
			portSerial.close();
		}

		portSerial = null;
		setActived( false );
	}

}
