package edu.uiowa.slis.VIVOISF.DocumentPart;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentPartNameCurrencyIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentPartNameCurrencyIT currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentPartNameCurrencyIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DocumentPartNameCurrencyITIterator theDocumentPart = (DocumentPartNameCurrencyITIterator)findAncestorWithClass(this, DocumentPartNameCurrencyITIterator.class);
			pageContext.getOut().print(theDocumentPart.getNameCurrencyIT());
		} catch (Exception e) {
			log.error("Can't find enclosing DocumentPart for nameCurrencyIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing DocumentPart for nameCurrencyIT tag ");
		}
		return SKIP_BODY;
	}
}

