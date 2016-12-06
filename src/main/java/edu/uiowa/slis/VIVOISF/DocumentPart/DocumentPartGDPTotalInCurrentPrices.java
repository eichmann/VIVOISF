package edu.uiowa.slis.VIVOISF.DocumentPart;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentPartGDPTotalInCurrentPrices extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentPartGDPTotalInCurrentPrices currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentPartGDPTotalInCurrentPrices.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DocumentPartGDPTotalInCurrentPricesIterator theDocumentPart = (DocumentPartGDPTotalInCurrentPricesIterator)findAncestorWithClass(this, DocumentPartGDPTotalInCurrentPricesIterator.class);
			pageContext.getOut().print(theDocumentPart.getGDPTotalInCurrentPrices());
		} catch (Exception e) {
			log.error("Can't find enclosing DocumentPart for GDPTotalInCurrentPrices tag ", e);
			throw new JspTagException("Error: Can't find enclosing DocumentPart for GDPTotalInCurrentPrices tag ");
		}
		return SKIP_BODY;
	}
}

