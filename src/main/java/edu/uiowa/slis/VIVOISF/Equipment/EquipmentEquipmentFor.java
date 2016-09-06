package edu.uiowa.slis.VIVOISF.Equipment;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EquipmentEquipmentFor extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EquipmentEquipmentFor currentInstance = null;
	private static final Log log = LogFactory.getLog(EquipmentEquipmentFor.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			EquipmentEquipmentForIterator theEquipmentEquipmentForIterator = (EquipmentEquipmentForIterator)findAncestorWithClass(this, EquipmentEquipmentForIterator.class);
			pageContext.getOut().print(theEquipmentEquipmentForIterator.getEquipmentFor());
		} catch (Exception e) {
			log.error("Can't find enclosing Equipment for equipmentFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Equipment for equipmentFor tag ");
		}
		return SKIP_BODY;
	}
}

