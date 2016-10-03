package edu.uiowa.slis.VIVOISF.ExtensionUnit;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ExtensionUnitInterviewerInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ExtensionUnitInterviewerInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(ExtensionUnitInterviewerInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ExtensionUnitInterviewerInverseIterator theExtensionUnitInterviewerInverseIterator = (ExtensionUnitInterviewerInverseIterator)findAncestorWithClass(this, ExtensionUnitInterviewerInverseIterator.class);
			pageContext.getOut().print(theExtensionUnitInterviewerInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ExtensionUnit for interviewer tag ", e);
			throw new JspTagException("Error: Can't find enclosing ExtensionUnit for interviewer tag ");
		}
		return SKIP_BODY;
	}
}

