package edu.uiowa.slis.VIVOISF.Equipment;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EquipmentRO_0003001Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EquipmentRO_0003001Type currentInstance = null;
	private static final Log log = LogFactory.getLog(EquipmentRO_0003001Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			EquipmentRO_0003001Iterator theEquipmentRO_0003001Iterator = (EquipmentRO_0003001Iterator)findAncestorWithClass(this, EquipmentRO_0003001Iterator.class);
			pageContext.getOut().print(theEquipmentRO_0003001Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Equipment for RO_0003001 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Equipment for RO_0003001 tag ");
		}
		return SKIP_BODY;
	}
}

