package edu.uiowa.slis.VIVOISF.Document;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentNameCurrencyIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentNameCurrencyIT currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentNameCurrencyIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DocumentNameCurrencyITIterator theDocument = (DocumentNameCurrencyITIterator)findAncestorWithClass(this, DocumentNameCurrencyITIterator.class);
			pageContext.getOut().print(theDocument.getNameCurrencyIT());
		} catch (Exception e) {
			log.error("Can't find enclosing Document for nameCurrencyIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing Document for nameCurrencyIT tag ");
		}
		return SKIP_BODY;
	}
}

