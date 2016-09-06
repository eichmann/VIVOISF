package edu.uiowa.slis.VIVOISF.ExtensionUnit;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ExtensionUnitHasEquipmentType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ExtensionUnitHasEquipmentType currentInstance = null;
	private static final Log log = LogFactory.getLog(ExtensionUnitHasEquipmentType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ExtensionUnitHasEquipmentIterator theExtensionUnitHasEquipmentIterator = (ExtensionUnitHasEquipmentIterator)findAncestorWithClass(this, ExtensionUnitHasEquipmentIterator.class);
			pageContext.getOut().print(theExtensionUnitHasEquipmentIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ExtensionUnit for hasEquipment tag ", e);
			throw new JspTagException("Error: Can't find enclosing ExtensionUnit for hasEquipment tag ");
		}
		return SKIP_BODY;
	}
}

