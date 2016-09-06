package edu.uiowa.slis.VIVOISF.ExtensionUnit;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ExtensionUnitAssigneeForType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ExtensionUnitAssigneeForType currentInstance = null;
	private static final Log log = LogFactory.getLog(ExtensionUnitAssigneeForType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ExtensionUnitAssigneeForIterator theExtensionUnitAssigneeForIterator = (ExtensionUnitAssigneeForIterator)findAncestorWithClass(this, ExtensionUnitAssigneeForIterator.class);
			pageContext.getOut().print(theExtensionUnitAssigneeForIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ExtensionUnit for assigneeFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing ExtensionUnit for assigneeFor tag ");
		}
		return SKIP_BODY;
	}
}

