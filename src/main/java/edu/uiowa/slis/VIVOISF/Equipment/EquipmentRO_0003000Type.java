package edu.uiowa.slis.VIVOISF.Equipment;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EquipmentRO_0003000Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EquipmentRO_0003000Type currentInstance = null;
	private static final Log log = LogFactory.getLog(EquipmentRO_0003000Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			EquipmentRO_0003000Iterator theEquipmentRO_0003000Iterator = (EquipmentRO_0003000Iterator)findAncestorWithClass(this, EquipmentRO_0003000Iterator.class);
			pageContext.getOut().print(theEquipmentRO_0003000Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Equipment for RO_0003000 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Equipment for RO_0003000 tag ");
		}
		return SKIP_BODY;
	}
}

