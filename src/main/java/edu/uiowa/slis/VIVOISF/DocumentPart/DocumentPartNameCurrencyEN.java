package edu.uiowa.slis.VIVOISF.DocumentPart;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentPartNameCurrencyEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentPartNameCurrencyEN currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentPartNameCurrencyEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DocumentPartNameCurrencyENIterator theDocumentPart = (DocumentPartNameCurrencyENIterator)findAncestorWithClass(this, DocumentPartNameCurrencyENIterator.class);
			pageContext.getOut().print(theDocumentPart.getNameCurrencyEN());
		} catch (Exception e) {
			log.error("Can't find enclosing DocumentPart for nameCurrencyEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing DocumentPart for nameCurrencyEN tag ");
		}
		return SKIP_BODY;
	}
}

