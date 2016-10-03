package edu.uiowa.slis.VIVOISF.LegalDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LegalDocumentAuthorList extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LegalDocumentAuthorList currentInstance = null;
	private static final Log log = LogFactory.getLog(LegalDocumentAuthorList.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LegalDocumentAuthorListIterator theLegalDocumentAuthorListIterator = (LegalDocumentAuthorListIterator)findAncestorWithClass(this, LegalDocumentAuthorListIterator.class);
			pageContext.getOut().print(theLegalDocumentAuthorListIterator.getAuthorList());
		} catch (Exception e) {
			log.error("Can't find enclosing LegalDocument for authorList tag ", e);
			throw new JspTagException("Error: Can't find enclosing LegalDocument for authorList tag ");
		}
		return SKIP_BODY;
	}
}

