package edu.uiowa.slis.VIVOISF.Letter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LetterDocumentationFor extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LetterDocumentationFor currentInstance = null;
	private static final Log log = LogFactory.getLog(LetterDocumentationFor.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LetterDocumentationForIterator theLetterDocumentationForIterator = (LetterDocumentationForIterator)findAncestorWithClass(this, LetterDocumentationForIterator.class);
			pageContext.getOut().print(theLetterDocumentationForIterator.getDocumentationFor());
		} catch (Exception e) {
			log.error("Can't find enclosing Letter for documentationFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Letter for documentationFor tag ");
		}
		return SKIP_BODY;
	}
}

