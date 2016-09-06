package edu.uiowa.slis.VIVOISF.Division;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DivisionHasEquipment extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DivisionHasEquipment currentInstance = null;
	private static final Log log = LogFactory.getLog(DivisionHasEquipment.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DivisionHasEquipmentIterator theDivisionHasEquipmentIterator = (DivisionHasEquipmentIterator)findAncestorWithClass(this, DivisionHasEquipmentIterator.class);
			pageContext.getOut().print(theDivisionHasEquipmentIterator.getHasEquipment());
		} catch (Exception e) {
			log.error("Can't find enclosing Division for hasEquipment tag ", e);
			throw new JspTagException("Error: Can't find enclosing Division for hasEquipment tag ");
		}
		return SKIP_BODY;
	}
}

