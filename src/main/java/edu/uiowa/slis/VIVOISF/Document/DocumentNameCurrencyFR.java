package edu.uiowa.slis.VIVOISF.Document;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentNameCurrencyFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentNameCurrencyFR currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentNameCurrencyFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DocumentNameCurrencyFRIterator theDocument = (DocumentNameCurrencyFRIterator)findAncestorWithClass(this, DocumentNameCurrencyFRIterator.class);
			pageContext.getOut().print(theDocument.getNameCurrencyFR());
		} catch (Exception e) {
			log.error("Can't find enclosing Document for nameCurrencyFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Document for nameCurrencyFR tag ");
		}
		return SKIP_BODY;
	}
}

