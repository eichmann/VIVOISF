package edu.uiowa.slis.VIVOISF.Thesis;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThesisDocumentationFor extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ThesisDocumentationFor currentInstance = null;
	private static final Log log = LogFactory.getLog(ThesisDocumentationFor.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ThesisDocumentationForIterator theThesisDocumentationForIterator = (ThesisDocumentationForIterator)findAncestorWithClass(this, ThesisDocumentationForIterator.class);
			pageContext.getOut().print(theThesisDocumentationForIterator.getDocumentationFor());
		} catch (Exception e) {
			log.error("Can't find enclosing Thesis for documentationFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Thesis for documentationFor tag ");
		}
		return SKIP_BODY;
	}
}

