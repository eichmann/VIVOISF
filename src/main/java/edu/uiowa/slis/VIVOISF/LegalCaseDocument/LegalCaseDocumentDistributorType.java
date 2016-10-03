package edu.uiowa.slis.VIVOISF.LegalCaseDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LegalCaseDocumentDistributorType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LegalCaseDocumentDistributorType currentInstance = null;
	private static final Log log = LogFactory.getLog(LegalCaseDocumentDistributorType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LegalCaseDocumentDistributorIterator theLegalCaseDocumentDistributorIterator = (LegalCaseDocumentDistributorIterator)findAncestorWithClass(this, LegalCaseDocumentDistributorIterator.class);
			pageContext.getOut().print(theLegalCaseDocumentDistributorIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing LegalCaseDocument for distributor tag ", e);
			throw new JspTagException("Error: Can't find enclosing LegalCaseDocument for distributor tag ");
		}
		return SKIP_BODY;
	}
}

