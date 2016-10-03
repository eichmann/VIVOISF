package edu.uiowa.slis.VIVOISF.ExtensionUnit;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ExtensionUnitIntervieweeInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ExtensionUnitIntervieweeInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(ExtensionUnitIntervieweeInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ExtensionUnitIntervieweeInverseIterator theExtensionUnitIntervieweeInverseIterator = (ExtensionUnitIntervieweeInverseIterator)findAncestorWithClass(this, ExtensionUnitIntervieweeInverseIterator.class);
			pageContext.getOut().print(theExtensionUnitIntervieweeInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ExtensionUnit for interviewee tag ", e);
			throw new JspTagException("Error: Can't find enclosing ExtensionUnit for interviewee tag ");
		}
		return SKIP_BODY;
	}
}

