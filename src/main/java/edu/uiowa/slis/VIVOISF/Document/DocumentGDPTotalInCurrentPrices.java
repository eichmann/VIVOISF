package edu.uiowa.slis.VIVOISF.Document;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentGDPTotalInCurrentPrices extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentGDPTotalInCurrentPrices currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentGDPTotalInCurrentPrices.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DocumentGDPTotalInCurrentPricesIterator theDocument = (DocumentGDPTotalInCurrentPricesIterator)findAncestorWithClass(this, DocumentGDPTotalInCurrentPricesIterator.class);
			pageContext.getOut().print(theDocument.getGDPTotalInCurrentPrices());
		} catch (Exception e) {
			log.error("Can't find enclosing Document for GDPTotalInCurrentPrices tag ", e);
			throw new JspTagException("Error: Can't find enclosing Document for GDPTotalInCurrentPrices tag ");
		}
		return SKIP_BODY;
	}
}

