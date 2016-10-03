package edu.uiowa.slis.VIVOISF.PersonalCommunicationDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PersonalCommunicationDocumentContributorList extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PersonalCommunicationDocumentContributorList currentInstance = null;
	private static final Log log = LogFactory.getLog(PersonalCommunicationDocumentContributorList.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PersonalCommunicationDocumentContributorListIterator thePersonalCommunicationDocumentContributorListIterator = (PersonalCommunicationDocumentContributorListIterator)findAncestorWithClass(this, PersonalCommunicationDocumentContributorListIterator.class);
			pageContext.getOut().print(thePersonalCommunicationDocumentContributorListIterator.getContributorList());
		} catch (Exception e) {
			log.error("Can't find enclosing PersonalCommunicationDocument for contributorList tag ", e);
			throw new JspTagException("Error: Can't find enclosing PersonalCommunicationDocument for contributorList tag ");
		}
		return SKIP_BODY;
	}
}

