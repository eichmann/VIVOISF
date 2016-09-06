package edu.uiowa.slis.VIVOISF.Equipment;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EquipmentLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EquipmentLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(EquipmentLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Equipment theEquipment = (Equipment)findAncestorWithClass(this, Equipment.class);
			if (!theEquipment.commitNeeded) {
				pageContext.getOut().print(theEquipment.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Equipment for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Equipment for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			Equipment theEquipment = (Equipment)findAncestorWithClass(this, Equipment.class);
			return theEquipment.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing Equipment for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Equipment for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			Equipment theEquipment = (Equipment)findAncestorWithClass(this, Equipment.class);
			theEquipment.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing Equipment for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Equipment for label tag ");
		}
	}
}

