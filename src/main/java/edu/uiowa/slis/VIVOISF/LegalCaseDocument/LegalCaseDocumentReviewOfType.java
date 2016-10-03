package edu.uiowa.slis.VIVOISF.LegalCaseDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LegalCaseDocumentReviewOfType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LegalCaseDocumentReviewOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(LegalCaseDocumentReviewOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LegalCaseDocumentReviewOfIterator theLegalCaseDocumentReviewOfIterator = (LegalCaseDocumentReviewOfIterator)findAncestorWithClass(this, LegalCaseDocumentReviewOfIterator.class);
			pageContext.getOut().print(theLegalCaseDocumentReviewOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing LegalCaseDocument for reviewOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing LegalCaseDocument for reviewOf tag ");
		}
		return SKIP_BODY;
	}
}
