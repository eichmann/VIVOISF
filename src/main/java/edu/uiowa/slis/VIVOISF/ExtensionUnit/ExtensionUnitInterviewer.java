package edu.uiowa.slis.VIVOISF.ExtensionUnit;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ExtensionUnitInterviewer extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ExtensionUnitInterviewer currentInstance = null;
	private static final Log log = LogFactory.getLog(ExtensionUnitInterviewer.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ExtensionUnitInterviewerIterator theExtensionUnitInterviewerIterator = (ExtensionUnitInterviewerIterator)findAncestorWithClass(this, ExtensionUnitInterviewerIterator.class);
			pageContext.getOut().print(theExtensionUnitInterviewerIterator.getInterviewer());
		} catch (Exception e) {
			log.error("Can't find enclosing ExtensionUnit for interviewer tag ", e);
			throw new JspTagException("Error: Can't find enclosing ExtensionUnit for interviewer tag ");
		}
		return SKIP_BODY;
	}
}

