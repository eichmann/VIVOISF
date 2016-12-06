package edu.uiowa.slis.VIVOISF.Document;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentNameCurrencyRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentNameCurrencyRU currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentNameCurrencyRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DocumentNameCurrencyRUIterator theDocument = (DocumentNameCurrencyRUIterator)findAncestorWithClass(this, DocumentNameCurrencyRUIterator.class);
			pageContext.getOut().print(theDocument.getNameCurrencyRU());
		} catch (Exception e) {
			log.error("Can't find enclosing Document for nameCurrencyRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing Document for nameCurrencyRU tag ");
		}
		return SKIP_BODY;
	}
}

