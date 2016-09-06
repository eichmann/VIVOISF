package edu.uiowa.slis.VIVOISF.Quote;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class QuoteDocumentationFor extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static QuoteDocumentationFor currentInstance = null;
	private static final Log log = LogFactory.getLog(QuoteDocumentationFor.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			QuoteDocumentationForIterator theQuoteDocumentationForIterator = (QuoteDocumentationForIterator)findAncestorWithClass(this, QuoteDocumentationForIterator.class);
			pageContext.getOut().print(theQuoteDocumentationForIterator.getDocumentationFor());
		} catch (Exception e) {
			log.error("Can't find enclosing Quote for documentationFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Quote for documentationFor tag ");
		}
		return SKIP_BODY;
	}
}

