/******************************************************************************

AUTOLIV ELECTRONIC document.

-------------------------------------

Copyright Autoliv Inc. All rights reserved.

*******************************************************************************
JAVA-File project AEC_Configurator
******************************************************************************/
/* PRQA S 0288 ++ */
/*
 * Explanation:
 *    see @details
 */
/*
$Revision: 1.0 $
$ProjectName: ?? $
*/
/* PRQA S 0288 -- */
/*!****************************************************************************

@details
	Button use to display the next atttributze
 */

package fr.autoliv.pp4g.erh.aecConfigurator.controller.button;

import org.jnativehook.keyboard.NativeKeyEvent;

import fr.autoliv.pp4g.erh.aecConfigurator.controller.ControlStore;
import fr.autoliv.pp4g.erh.aecConfigurator.controller.executor.IDCommand;
import fr.autoliv.pp4g.erh.aecConfigurator.view.MainFrame;
import fr.autoliv.pp4g.erh.aecConfigurator.view.constant.ConstantIcon;
import fr.autoliv.pp4g.erh.aecConfigurator.view.constant.ConstantString;

public class ButtonNext extends ModelButton{
		
	/**
	 * The serial version UID
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * The main frame where all the component are displayed
	 */
	private MainFrame mainFrame;
	
	/**
	 * Constructor of the button to take the component up in the list
	 * @param mainFrame
	 */
	public ButtonNext(MainFrame mainFrame){
		super(ConstantIcon.IC_NEXT,NativeKeyEvent.VC_RIGHT,true,ModelButton.BUTTON_ICON,ConstantString.TOOL_TIP_BUTTON_NEXT);
		this.mainFrame=mainFrame;
	}
	
	/**
	 * Process called when the user want to pass to the next argument
	 */
	@Override
	synchronized public void buttonEvent(){
		if(	
			this.mainFrame.getFrameState()==MainFrame.STATE_EDIT_AEC ||
			this.mainFrame.getFrameState()==MainFrame.STATE_NEW_AEC
		){
			ControlStore.getInstance().getExecutor().executeCommand(IDCommand.SELECT_NEXT_ATTRIBUTE);
		}
	}
}
