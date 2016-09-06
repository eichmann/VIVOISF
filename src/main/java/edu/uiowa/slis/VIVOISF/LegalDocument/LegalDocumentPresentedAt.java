package edu.uiowa.slis.VIVOISF.LegalDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LegalDocumentPresentedAt extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LegalDocumentPresentedAt currentInstance = null;
	private static final Log log = LogFactory.getLog(LegalDocumentPresentedAt.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LegalDocumentPresentedAtIterator theLegalDocumentPresentedAtIterator = (LegalDocumentPresentedAtIterator)findAncestorWithClass(this, LegalDocumentPresentedAtIterator.class);
			pageContext.getOut().print(theLegalDocumentPresentedAtIterator.getPresentedAt());
		} catch (Exception e) {
			log.error("Can't find enclosing LegalDocument for presentedAt tag ", e);
			throw new JspTagException("Error: Can't find enclosing LegalDocument for presentedAt tag ");
		}
		return SKIP_BODY;
	}
}

