package edu.uiowa.slis.VIVOISF.LegalCaseDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LegalCaseDocumentContributorList extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LegalCaseDocumentContributorList currentInstance = null;
	private static final Log log = LogFactory.getLog(LegalCaseDocumentContributorList.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LegalCaseDocumentContributorListIterator theLegalCaseDocumentContributorListIterator = (LegalCaseDocumentContributorListIterator)findAncestorWithClass(this, LegalCaseDocumentContributorListIterator.class);
			pageContext.getOut().print(theLegalCaseDocumentContributorListIterator.getContributorList());
		} catch (Exception e) {
			log.error("Can't find enclosing LegalCaseDocument for contributorList tag ", e);
			throw new JspTagException("Error: Can't find enclosing LegalCaseDocument for contributorList tag ");
		}
		return SKIP_BODY;
	}
}

