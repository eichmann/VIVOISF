package edu.uiowa.slis.VIVOISF.ExtensionUnit;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ExtensionUnitIntervieweeType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ExtensionUnitIntervieweeType currentInstance = null;
	private static final Log log = LogFactory.getLog(ExtensionUnitIntervieweeType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ExtensionUnitIntervieweeIterator theExtensionUnitIntervieweeIterator = (ExtensionUnitIntervieweeIterator)findAncestorWithClass(this, ExtensionUnitIntervieweeIterator.class);
			pageContext.getOut().print(theExtensionUnitIntervieweeIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ExtensionUnit for interviewee tag ", e);
			throw new JspTagException("Error: Can't find enclosing ExtensionUnit for interviewee tag ");
		}
		return SKIP_BODY;
	}
}

