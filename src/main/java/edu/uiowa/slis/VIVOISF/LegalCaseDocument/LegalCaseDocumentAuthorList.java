package edu.uiowa.slis.VIVOISF.LegalCaseDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LegalCaseDocumentAuthorList extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LegalCaseDocumentAuthorList currentInstance = null;
	private static final Log log = LogFactory.getLog(LegalCaseDocumentAuthorList.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LegalCaseDocumentAuthorListIterator theLegalCaseDocumentAuthorListIterator = (LegalCaseDocumentAuthorListIterator)findAncestorWithClass(this, LegalCaseDocumentAuthorListIterator.class);
			pageContext.getOut().print(theLegalCaseDocumentAuthorListIterator.getAuthorList());
		} catch (Exception e) {
			log.error("Can't find enclosing LegalCaseDocument for authorList tag ", e);
			throw new JspTagException("Error: Can't find enclosing LegalCaseDocument for authorList tag ");
		}
		return SKIP_BODY;
	}
}

