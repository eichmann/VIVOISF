package edu.uiowa.slis.VIVOISF.ExtensionUnit;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ExtensionUnitOrganizerInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ExtensionUnitOrganizerInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(ExtensionUnitOrganizerInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ExtensionUnitOrganizerInverseIterator theExtensionUnitOrganizerInverseIterator = (ExtensionUnitOrganizerInverseIterator)findAncestorWithClass(this, ExtensionUnitOrganizerInverseIterator.class);
			pageContext.getOut().print(theExtensionUnitOrganizerInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ExtensionUnit for organizer tag ", e);
			throw new JspTagException("Error: Can't find enclosing ExtensionUnit for organizer tag ");
		}
		return SKIP_BODY;
	}
}

