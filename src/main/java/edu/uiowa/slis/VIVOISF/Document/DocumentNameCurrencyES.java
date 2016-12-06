package edu.uiowa.slis.VIVOISF.Document;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentNameCurrencyES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentNameCurrencyES currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentNameCurrencyES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DocumentNameCurrencyESIterator theDocument = (DocumentNameCurrencyESIterator)findAncestorWithClass(this, DocumentNameCurrencyESIterator.class);
			pageContext.getOut().print(theDocument.getNameCurrencyES());
		} catch (Exception e) {
			log.error("Can't find enclosing Document for nameCurrencyES tag ", e);
			throw new JspTagException("Error: Can't find enclosing Document for nameCurrencyES tag ");
		}
		return SKIP_BODY;
	}
}

