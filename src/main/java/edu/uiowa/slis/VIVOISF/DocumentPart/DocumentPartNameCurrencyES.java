package edu.uiowa.slis.VIVOISF.DocumentPart;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentPartNameCurrencyES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentPartNameCurrencyES currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentPartNameCurrencyES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DocumentPartNameCurrencyESIterator theDocumentPart = (DocumentPartNameCurrencyESIterator)findAncestorWithClass(this, DocumentPartNameCurrencyESIterator.class);
			pageContext.getOut().print(theDocumentPart.getNameCurrencyES());
		} catch (Exception e) {
			log.error("Can't find enclosing DocumentPart for nameCurrencyES tag ", e);
			throw new JspTagException("Error: Can't find enclosing DocumentPart for nameCurrencyES tag ");
		}
		return SKIP_BODY;
	}
}

