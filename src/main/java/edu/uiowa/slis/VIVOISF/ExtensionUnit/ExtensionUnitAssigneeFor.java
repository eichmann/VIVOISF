package edu.uiowa.slis.VIVOISF.ExtensionUnit;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ExtensionUnitAssigneeFor extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ExtensionUnitAssigneeFor currentInstance = null;
	private static final Log log = LogFactory.getLog(ExtensionUnitAssigneeFor.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ExtensionUnitAssigneeForIterator theExtensionUnitAssigneeForIterator = (ExtensionUnitAssigneeForIterator)findAncestorWithClass(this, ExtensionUnitAssigneeForIterator.class);
			pageContext.getOut().print(theExtensionUnitAssigneeForIterator.getAssigneeFor());
		} catch (Exception e) {
			log.error("Can't find enclosing ExtensionUnit for assigneeFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing ExtensionUnit for assigneeFor tag ");
		}
		return SKIP_BODY;
	}
}

