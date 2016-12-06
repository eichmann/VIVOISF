package edu.uiowa.slis.VIVOISF.DocumentPart;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentPartNameCurrencyRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentPartNameCurrencyRU currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentPartNameCurrencyRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DocumentPartNameCurrencyRUIterator theDocumentPart = (DocumentPartNameCurrencyRUIterator)findAncestorWithClass(this, DocumentPartNameCurrencyRUIterator.class);
			pageContext.getOut().print(theDocumentPart.getNameCurrencyRU());
		} catch (Exception e) {
			log.error("Can't find enclosing DocumentPart for nameCurrencyRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing DocumentPart for nameCurrencyRU tag ");
		}
		return SKIP_BODY;
	}
}

