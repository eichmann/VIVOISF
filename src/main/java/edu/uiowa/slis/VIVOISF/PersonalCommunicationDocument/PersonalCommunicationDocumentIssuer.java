package edu.uiowa.slis.VIVOISF.PersonalCommunicationDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PersonalCommunicationDocumentIssuer extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PersonalCommunicationDocumentIssuer currentInstance = null;
	private static final Log log = LogFactory.getLog(PersonalCommunicationDocumentIssuer.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PersonalCommunicationDocumentIssuerIterator thePersonalCommunicationDocumentIssuerIterator = (PersonalCommunicationDocumentIssuerIterator)findAncestorWithClass(this, PersonalCommunicationDocumentIssuerIterator.class);
			pageContext.getOut().print(thePersonalCommunicationDocumentIssuerIterator.getIssuer());
		} catch (Exception e) {
			log.error("Can't find enclosing PersonalCommunicationDocument for issuer tag ", e);
			throw new JspTagException("Error: Can't find enclosing PersonalCommunicationDocument for issuer tag ");
		}
		return SKIP_BODY;
	}
}

