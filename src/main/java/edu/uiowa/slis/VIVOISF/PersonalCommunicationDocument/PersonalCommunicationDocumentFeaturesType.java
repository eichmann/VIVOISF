package edu.uiowa.slis.VIVOISF.PersonalCommunicationDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PersonalCommunicationDocumentFeaturesType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PersonalCommunicationDocumentFeaturesType currentInstance = null;
	private static final Log log = LogFactory.getLog(PersonalCommunicationDocumentFeaturesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PersonalCommunicationDocumentFeaturesIterator thePersonalCommunicationDocumentFeaturesIterator = (PersonalCommunicationDocumentFeaturesIterator)findAncestorWithClass(this, PersonalCommunicationDocumentFeaturesIterator.class);
			pageContext.getOut().print(thePersonalCommunicationDocumentFeaturesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing PersonalCommunicationDocument for features tag ", e);
			throw new JspTagException("Error: Can't find enclosing PersonalCommunicationDocument for features tag ");
		}
		return SKIP_BODY;
	}
}

