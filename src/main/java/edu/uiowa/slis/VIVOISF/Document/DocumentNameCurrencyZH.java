package edu.uiowa.slis.VIVOISF.Document;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentNameCurrencyZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentNameCurrencyZH currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentNameCurrencyZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DocumentNameCurrencyZHIterator theDocument = (DocumentNameCurrencyZHIterator)findAncestorWithClass(this, DocumentNameCurrencyZHIterator.class);
			pageContext.getOut().print(theDocument.getNameCurrencyZH());
		} catch (Exception e) {
			log.error("Can't find enclosing Document for nameCurrencyZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing Document for nameCurrencyZH tag ");
		}
		return SKIP_BODY;
	}
}

