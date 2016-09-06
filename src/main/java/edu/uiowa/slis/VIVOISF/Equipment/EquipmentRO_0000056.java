package edu.uiowa.slis.VIVOISF.Equipment;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EquipmentRO_0000056 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EquipmentRO_0000056 currentInstance = null;
	private static final Log log = LogFactory.getLog(EquipmentRO_0000056.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			EquipmentRO_0000056Iterator theEquipmentRO_0000056Iterator = (EquipmentRO_0000056Iterator)findAncestorWithClass(this, EquipmentRO_0000056Iterator.class);
			pageContext.getOut().print(theEquipmentRO_0000056Iterator.getRO_0000056());
		} catch (Exception e) {
			log.error("Can't find enclosing Equipment for RO_0000056 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Equipment for RO_0000056 tag ");
		}
		return SKIP_BODY;
	}
}

