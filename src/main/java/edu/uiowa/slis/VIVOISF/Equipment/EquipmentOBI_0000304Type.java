package edu.uiowa.slis.VIVOISF.Equipment;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EquipmentOBI_0000304Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EquipmentOBI_0000304Type currentInstance = null;
	private static final Log log = LogFactory.getLog(EquipmentOBI_0000304Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			EquipmentOBI_0000304Iterator theEquipmentOBI_0000304Iterator = (EquipmentOBI_0000304Iterator)findAncestorWithClass(this, EquipmentOBI_0000304Iterator.class);
			pageContext.getOut().print(theEquipmentOBI_0000304Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Equipment for OBI_0000304 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Equipment for OBI_0000304 tag ");
		}
		return SKIP_BODY;
	}
}

