package edu.uiowa.slis.VIVOISF.LegalDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LegalDocumentPresentedAtType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LegalDocumentPresentedAtType currentInstance = null;
	private static final Log log = LogFactory.getLog(LegalDocumentPresentedAtType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LegalDocumentPresentedAtIterator theLegalDocumentPresentedAtIterator = (LegalDocumentPresentedAtIterator)findAncestorWithClass(this, LegalDocumentPresentedAtIterator.class);
			pageContext.getOut().print(theLegalDocumentPresentedAtIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing LegalDocument for presentedAt tag ", e);
			throw new JspTagException("Error: Can't find enclosing LegalDocument for presentedAt tag ");
		}
		return SKIP_BODY;
	}
}

