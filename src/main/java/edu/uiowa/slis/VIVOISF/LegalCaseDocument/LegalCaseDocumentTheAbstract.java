package edu.uiowa.slis.VIVOISF.LegalCaseDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LegalCaseDocumentTheAbstract extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LegalCaseDocumentTheAbstract currentInstance = null;
	private static final Log log = LogFactory.getLog(LegalCaseDocumentTheAbstract.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LegalCaseDocumentTheAbstractIterator theLegalCaseDocument = (LegalCaseDocumentTheAbstractIterator)findAncestorWithClass(this, LegalCaseDocumentTheAbstractIterator.class);
			pageContext.getOut().print(theLegalCaseDocument.getTheAbstract());
		} catch (Exception e) {
			log.error("Can't find enclosing LegalCaseDocument for theAbstract tag ", e);
			throw new JspTagException("Error: Can't find enclosing LegalCaseDocument for theAbstract tag ");
		}
		return SKIP_BODY;
	}
}

