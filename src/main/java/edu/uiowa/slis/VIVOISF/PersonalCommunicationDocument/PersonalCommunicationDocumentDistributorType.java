package edu.uiowa.slis.VIVOISF.PersonalCommunicationDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PersonalCommunicationDocumentDistributorType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PersonalCommunicationDocumentDistributorType currentInstance = null;
	private static final Log log = LogFactory.getLog(PersonalCommunicationDocumentDistributorType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PersonalCommunicationDocumentDistributorIterator thePersonalCommunicationDocumentDistributorIterator = (PersonalCommunicationDocumentDistributorIterator)findAncestorWithClass(this, PersonalCommunicationDocumentDistributorIterator.class);
			pageContext.getOut().print(thePersonalCommunicationDocumentDistributorIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing PersonalCommunicationDocument for distributor tag ", e);
			throw new JspTagException("Error: Can't find enclosing PersonalCommunicationDocument for distributor tag ");
		}
		return SKIP_BODY;
	}
}

