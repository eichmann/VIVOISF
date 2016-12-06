package edu.uiowa.slis.VIVOISF.DocumentPart;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentPartNameCurrencyAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentPartNameCurrencyAR currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentPartNameCurrencyAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DocumentPartNameCurrencyARIterator theDocumentPart = (DocumentPartNameCurrencyARIterator)findAncestorWithClass(this, DocumentPartNameCurrencyARIterator.class);
			pageContext.getOut().print(theDocumentPart.getNameCurrencyAR());
		} catch (Exception e) {
			log.error("Can't find enclosing DocumentPart for nameCurrencyAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing DocumentPart for nameCurrencyAR tag ");
		}
		return SKIP_BODY;
	}
}

