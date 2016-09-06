package edu.uiowa.slis.VIVOISF.LegalCaseDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LegalCaseDocumentPresentedAtType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LegalCaseDocumentPresentedAtType currentInstance = null;
	private static final Log log = LogFactory.getLog(LegalCaseDocumentPresentedAtType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LegalCaseDocumentPresentedAtIterator theLegalCaseDocumentPresentedAtIterator = (LegalCaseDocumentPresentedAtIterator)findAncestorWithClass(this, LegalCaseDocumentPresentedAtIterator.class);
			pageContext.getOut().print(theLegalCaseDocumentPresentedAtIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing LegalCaseDocument for presentedAt tag ", e);
			throw new JspTagException("Error: Can't find enclosing LegalCaseDocument for presentedAt tag ");
		}
		return SKIP_BODY;
	}
}

