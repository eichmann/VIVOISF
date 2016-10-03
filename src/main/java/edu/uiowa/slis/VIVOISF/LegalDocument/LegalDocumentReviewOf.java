package edu.uiowa.slis.VIVOISF.LegalDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LegalDocumentReviewOf extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LegalDocumentReviewOf currentInstance = null;
	private static final Log log = LogFactory.getLog(LegalDocumentReviewOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LegalDocumentReviewOfIterator theLegalDocumentReviewOfIterator = (LegalDocumentReviewOfIterator)findAncestorWithClass(this, LegalDocumentReviewOfIterator.class);
			pageContext.getOut().print(theLegalDocumentReviewOfIterator.getReviewOf());
		} catch (Exception e) {
			log.error("Can't find enclosing LegalDocument for reviewOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing LegalDocument for reviewOf tag ");
		}
		return SKIP_BODY;
	}
}

