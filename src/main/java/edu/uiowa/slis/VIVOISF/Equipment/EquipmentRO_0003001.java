package edu.uiowa.slis.VIVOISF.Equipment;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EquipmentRO_0003001 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EquipmentRO_0003001 currentInstance = null;
	private static final Log log = LogFactory.getLog(EquipmentRO_0003001.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			EquipmentRO_0003001Iterator theEquipmentRO_0003001Iterator = (EquipmentRO_0003001Iterator)findAncestorWithClass(this, EquipmentRO_0003001Iterator.class);
			pageContext.getOut().print(theEquipmentRO_0003001Iterator.getRO_0003001());
		} catch (Exception e) {
			log.error("Can't find enclosing Equipment for RO_0003001 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Equipment for RO_0003001 tag ");
		}
		return SKIP_BODY;
	}
}

