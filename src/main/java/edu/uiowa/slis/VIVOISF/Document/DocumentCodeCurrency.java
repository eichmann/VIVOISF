package edu.uiowa.slis.VIVOISF.Document;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentCodeCurrency extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentCodeCurrency currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentCodeCurrency.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DocumentCodeCurrencyIterator theDocument = (DocumentCodeCurrencyIterator)findAncestorWithClass(this, DocumentCodeCurrencyIterator.class);
			pageContext.getOut().print(theDocument.getCodeCurrency());
		} catch (Exception e) {
			log.error("Can't find enclosing Document for codeCurrency tag ", e);
			throw new JspTagException("Error: Can't find enclosing Document for codeCurrency tag ");
		}
		return SKIP_BODY;
	}
}

