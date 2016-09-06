package edu.uiowa.slis.VIVOISF.Standard;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StandardDocumentationForType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StandardDocumentationForType currentInstance = null;
	private static final Log log = LogFactory.getLog(StandardDocumentationForType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			StandardDocumentationForIterator theStandardDocumentationForIterator = (StandardDocumentationForIterator)findAncestorWithClass(this, StandardDocumentationForIterator.class);
			pageContext.getOut().print(theStandardDocumentationForIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Standard for documentationFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Standard for documentationFor tag ");
		}
		return SKIP_BODY;
	}
}

