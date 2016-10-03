package edu.uiowa.slis.VIVOISF.DocumentPart;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentPartContributorListType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentPartContributorListType currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentPartContributorListType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DocumentPartContributorListIterator theDocumentPartContributorListIterator = (DocumentPartContributorListIterator)findAncestorWithClass(this, DocumentPartContributorListIterator.class);
			pageContext.getOut().print(theDocumentPartContributorListIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing DocumentPart for contributorList tag ", e);
			throw new JspTagException("Error: Can't find enclosing DocumentPart for contributorList tag ");
		}
		return SKIP_BODY;
	}
}

