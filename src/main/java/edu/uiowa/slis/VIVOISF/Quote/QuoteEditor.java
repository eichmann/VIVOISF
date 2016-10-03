package edu.uiowa.slis.VIVOISF.Quote;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class QuoteEditor extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static QuoteEditor currentInstance = null;
	private static final Log log = LogFactory.getLog(QuoteEditor.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			QuoteEditorIterator theQuoteEditorIterator = (QuoteEditorIterator)findAncestorWithClass(this, QuoteEditorIterator.class);
			pageContext.getOut().print(theQuoteEditorIterator.getEditor());
		} catch (Exception e) {
			log.error("Can't find enclosing Quote for editor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Quote for editor tag ");
		}
		return SKIP_BODY;
	}
}

