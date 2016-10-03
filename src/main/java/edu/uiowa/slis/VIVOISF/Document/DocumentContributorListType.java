package edu.uiowa.slis.VIVOISF.Document;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentContributorListType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentContributorListType currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentContributorListType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DocumentContributorListIterator theDocumentContributorListIterator = (DocumentContributorListIterator)findAncestorWithClass(this, DocumentContributorListIterator.class);
			pageContext.getOut().print(theDocumentContributorListIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Document for contributorList tag ", e);
			throw new JspTagException("Error: Can't find enclosing Document for contributorList tag ");
		}
		return SKIP_BODY;
	}
}

