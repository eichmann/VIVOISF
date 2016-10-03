package edu.uiowa.slis.VIVOISF.LegalDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LegalDocumentDistributor extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LegalDocumentDistributor currentInstance = null;
	private static final Log log = LogFactory.getLog(LegalDocumentDistributor.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LegalDocumentDistributorIterator theLegalDocumentDistributorIterator = (LegalDocumentDistributorIterator)findAncestorWithClass(this, LegalDocumentDistributorIterator.class);
			pageContext.getOut().print(theLegalDocumentDistributorIterator.getDistributor());
		} catch (Exception e) {
			log.error("Can't find enclosing LegalDocument for distributor tag ", e);
			throw new JspTagException("Error: Can't find enclosing LegalDocument for distributor tag ");
		}
		return SKIP_BODY;
	}
}

