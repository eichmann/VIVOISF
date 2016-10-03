package edu.uiowa.slis.VIVOISF.LegalDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LegalDocumentContributorListType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LegalDocumentContributorListType currentInstance = null;
	private static final Log log = LogFactory.getLog(LegalDocumentContributorListType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LegalDocumentContributorListIterator theLegalDocumentContributorListIterator = (LegalDocumentContributorListIterator)findAncestorWithClass(this, LegalDocumentContributorListIterator.class);
			pageContext.getOut().print(theLegalDocumentContributorListIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing LegalDocument for contributorList tag ", e);
			throw new JspTagException("Error: Can't find enclosing LegalDocument for contributorList tag ");
		}
		return SKIP_BODY;
	}
}

