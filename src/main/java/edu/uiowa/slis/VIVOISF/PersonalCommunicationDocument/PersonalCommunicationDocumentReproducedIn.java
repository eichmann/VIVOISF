package edu.uiowa.slis.VIVOISF.PersonalCommunicationDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PersonalCommunicationDocumentReproducedIn extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PersonalCommunicationDocumentReproducedIn currentInstance = null;
	private static final Log log = LogFactory.getLog(PersonalCommunicationDocumentReproducedIn.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PersonalCommunicationDocumentReproducedInIterator thePersonalCommunicationDocumentReproducedInIterator = (PersonalCommunicationDocumentReproducedInIterator)findAncestorWithClass(this, PersonalCommunicationDocumentReproducedInIterator.class);
			pageContext.getOut().print(thePersonalCommunicationDocumentReproducedInIterator.getReproducedIn());
		} catch (Exception e) {
			log.error("Can't find enclosing PersonalCommunicationDocument for reproducedIn tag ", e);
			throw new JspTagException("Error: Can't find enclosing PersonalCommunicationDocument for reproducedIn tag ");
		}
		return SKIP_BODY;
	}
}

