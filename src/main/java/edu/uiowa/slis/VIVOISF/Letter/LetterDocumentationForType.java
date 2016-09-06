package edu.uiowa.slis.VIVOISF.Letter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LetterDocumentationForType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LetterDocumentationForType currentInstance = null;
	private static final Log log = LogFactory.getLog(LetterDocumentationForType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LetterDocumentationForIterator theLetterDocumentationForIterator = (LetterDocumentationForIterator)findAncestorWithClass(this, LetterDocumentationForIterator.class);
			pageContext.getOut().print(theLetterDocumentationForIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Letter for documentationFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Letter for documentationFor tag ");
		}
		return SKIP_BODY;
	}
}

