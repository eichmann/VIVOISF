package edu.uiowa.slis.VIVOISF.ExtensionUnit;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ExtensionUnitHasEquipment extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ExtensionUnitHasEquipment currentInstance = null;
	private static final Log log = LogFactory.getLog(ExtensionUnitHasEquipment.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ExtensionUnitHasEquipmentIterator theExtensionUnitHasEquipmentIterator = (ExtensionUnitHasEquipmentIterator)findAncestorWithClass(this, ExtensionUnitHasEquipmentIterator.class);
			pageContext.getOut().print(theExtensionUnitHasEquipmentIterator.getHasEquipment());
		} catch (Exception e) {
			log.error("Can't find enclosing ExtensionUnit for hasEquipment tag ", e);
			throw new JspTagException("Error: Can't find enclosing ExtensionUnit for hasEquipment tag ");
		}
		return SKIP_BODY;
	}
}

