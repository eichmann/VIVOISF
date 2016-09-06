package edu.uiowa.slis.VIVOISF.PersonalCommunicationDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PersonalCommunicationDocumentReproducedInType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PersonalCommunicationDocumentReproducedInType currentInstance = null;
	private static final Log log = LogFactory.getLog(PersonalCommunicationDocumentReproducedInType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PersonalCommunicationDocumentReproducedInIterator thePersonalCommunicationDocumentReproducedInIterator = (PersonalCommunicationDocumentReproducedInIterator)findAncestorWithClass(this, PersonalCommunicationDocumentReproducedInIterator.class);
			pageContext.getOut().print(thePersonalCommunicationDocumentReproducedInIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing PersonalCommunicationDocument for reproducedIn tag ", e);
			throw new JspTagException("Error: Can't find enclosing PersonalCommunicationDocument for reproducedIn tag ");
		}
		return SKIP_BODY;
	}
}

