package edu.uiowa.slis.VIVOISF.DocumentPart;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentPartCodeCurrency extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentPartCodeCurrency currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentPartCodeCurrency.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DocumentPartCodeCurrencyIterator theDocumentPart = (DocumentPartCodeCurrencyIterator)findAncestorWithClass(this, DocumentPartCodeCurrencyIterator.class);
			pageContext.getOut().print(theDocumentPart.getCodeCurrency());
		} catch (Exception e) {
			log.error("Can't find enclosing DocumentPart for codeCurrency tag ", e);
			throw new JspTagException("Error: Can't find enclosing DocumentPart for codeCurrency tag ");
		}
		return SKIP_BODY;
	}
}

