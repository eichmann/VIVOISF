package edu.uiowa.slis.VIVOISF.Document;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentNameCurrencyEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentNameCurrencyEN currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentNameCurrencyEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DocumentNameCurrencyENIterator theDocument = (DocumentNameCurrencyENIterator)findAncestorWithClass(this, DocumentNameCurrencyENIterator.class);
			pageContext.getOut().print(theDocument.getNameCurrencyEN());
		} catch (Exception e) {
			log.error("Can't find enclosing Document for nameCurrencyEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing Document for nameCurrencyEN tag ");
		}
		return SKIP_BODY;
	}
}

