package edu.uiowa.slis.VIVOISF.Document;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentNameCurrencyAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentNameCurrencyAR currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentNameCurrencyAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DocumentNameCurrencyARIterator theDocument = (DocumentNameCurrencyARIterator)findAncestorWithClass(this, DocumentNameCurrencyARIterator.class);
			pageContext.getOut().print(theDocument.getNameCurrencyAR());
		} catch (Exception e) {
			log.error("Can't find enclosing Document for nameCurrencyAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Document for nameCurrencyAR tag ");
		}
		return SKIP_BODY;
	}
}

