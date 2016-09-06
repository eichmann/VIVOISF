package edu.uiowa.slis.VIVOISF.Manual;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ManualDocumentationFor extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ManualDocumentationFor currentInstance = null;
	private static final Log log = LogFactory.getLog(ManualDocumentationFor.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ManualDocumentationForIterator theManualDocumentationForIterator = (ManualDocumentationForIterator)findAncestorWithClass(this, ManualDocumentationForIterator.class);
			pageContext.getOut().print(theManualDocumentationForIterator.getDocumentationFor());
		} catch (Exception e) {
			log.error("Can't find enclosing Manual for documentationFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Manual for documentationFor tag ");
		}
		return SKIP_BODY;
	}
}

