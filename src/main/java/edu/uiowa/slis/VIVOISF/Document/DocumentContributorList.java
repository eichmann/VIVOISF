package edu.uiowa.slis.VIVOISF.Document;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentContributorList extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentContributorList currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentContributorList.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DocumentContributorListIterator theDocumentContributorListIterator = (DocumentContributorListIterator)findAncestorWithClass(this, DocumentContributorListIterator.class);
			pageContext.getOut().print(theDocumentContributorListIterator.getContributorList());
		} catch (Exception e) {
			log.error("Can't find enclosing Document for contributorList tag ", e);
			throw new JspTagException("Error: Can't find enclosing Document for contributorList tag ");
		}
		return SKIP_BODY;
	}
}

