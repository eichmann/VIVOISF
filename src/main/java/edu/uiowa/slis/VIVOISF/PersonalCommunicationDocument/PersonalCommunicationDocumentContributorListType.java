package edu.uiowa.slis.VIVOISF.PersonalCommunicationDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PersonalCommunicationDocumentContributorListType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PersonalCommunicationDocumentContributorListType currentInstance = null;
	private static final Log log = LogFactory.getLog(PersonalCommunicationDocumentContributorListType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PersonalCommunicationDocumentContributorListIterator thePersonalCommunicationDocumentContributorListIterator = (PersonalCommunicationDocumentContributorListIterator)findAncestorWithClass(this, PersonalCommunicationDocumentContributorListIterator.class);
			pageContext.getOut().print(thePersonalCommunicationDocumentContributorListIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing PersonalCommunicationDocument for contributorList tag ", e);
			throw new JspTagException("Error: Can't find enclosing PersonalCommunicationDocument for contributorList tag ");
		}
		return SKIP_BODY;
	}
}

