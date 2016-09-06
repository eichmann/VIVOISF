package edu.uiowa.slis.VIVOISF.Equipment;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EquipmentEquipmentForType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EquipmentEquipmentForType currentInstance = null;
	private static final Log log = LogFactory.getLog(EquipmentEquipmentForType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			EquipmentEquipmentForIterator theEquipmentEquipmentForIterator = (EquipmentEquipmentForIterator)findAncestorWithClass(this, EquipmentEquipmentForIterator.class);
			pageContext.getOut().print(theEquipmentEquipmentForIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Equipment for equipmentFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Equipment for equipmentFor tag ");
		}
		return SKIP_BODY;
	}
}

