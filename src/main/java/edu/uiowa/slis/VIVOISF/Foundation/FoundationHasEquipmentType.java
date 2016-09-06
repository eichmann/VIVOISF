package edu.uiowa.slis.VIVOISF.Foundation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FoundationHasEquipmentType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FoundationHasEquipmentType currentInstance = null;
	private static final Log log = LogFactory.getLog(FoundationHasEquipmentType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			FoundationHasEquipmentIterator theFoundationHasEquipmentIterator = (FoundationHasEquipmentIterator)findAncestorWithClass(this, FoundationHasEquipmentIterator.class);
			pageContext.getOut().print(theFoundationHasEquipmentIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Foundation for hasEquipment tag ", e);
			throw new JspTagException("Error: Can't find enclosing Foundation for hasEquipment tag ");
		}
		return SKIP_BODY;
	}
}

