package edu.uiowa.slis.VIVOISF.LegalCaseDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LegalCaseDocumentStatusType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LegalCaseDocumentStatusType currentInstance = null;
	private static final Log log = LogFactory.getLog(LegalCaseDocumentStatusType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LegalCaseDocumentStatusIterator theLegalCaseDocumentStatusIterator = (LegalCaseDocumentStatusIterator)findAncestorWithClass(this, LegalCaseDocumentStatusIterator.class);
			pageContext.getOut().print(theLegalCaseDocumentStatusIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing LegalCaseDocument for status tag ", e);
			throw new JspTagException("Error: Can't find enclosing LegalCaseDocument for status tag ");
		}
		return SKIP_BODY;
	}
}

