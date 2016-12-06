package edu.uiowa.slis.VIVOISF.DocumentPart;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentPartNameCurrencyFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentPartNameCurrencyFR currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentPartNameCurrencyFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DocumentPartNameCurrencyFRIterator theDocumentPart = (DocumentPartNameCurrencyFRIterator)findAncestorWithClass(this, DocumentPartNameCurrencyFRIterator.class);
			pageContext.getOut().print(theDocumentPart.getNameCurrencyFR());
		} catch (Exception e) {
			log.error("Can't find enclosing DocumentPart for nameCurrencyFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing DocumentPart for nameCurrencyFR tag ");
		}
		return SKIP_BODY;
	}
}

