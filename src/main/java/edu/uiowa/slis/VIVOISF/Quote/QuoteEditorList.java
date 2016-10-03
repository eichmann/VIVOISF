package edu.uiowa.slis.VIVOISF.Quote;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class QuoteEditorList extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static QuoteEditorList currentInstance = null;
	private static final Log log = LogFactory.getLog(QuoteEditorList.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			QuoteEditorListIterator theQuoteEditorListIterator = (QuoteEditorListIterator)findAncestorWithClass(this, QuoteEditorListIterator.class);
			pageContext.getOut().print(theQuoteEditorListIterator.getEditorList());
		} catch (Exception e) {
			log.error("Can't find enclosing Quote for editorList tag ", e);
			throw new JspTagException("Error: Can't find enclosing Quote for editorList tag ");
		}
		return SKIP_BODY;
	}
}

