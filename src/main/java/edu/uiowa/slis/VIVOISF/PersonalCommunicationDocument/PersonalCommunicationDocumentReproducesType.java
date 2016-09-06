package edu.uiowa.slis.VIVOISF.PersonalCommunicationDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PersonalCommunicationDocumentReproducesType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PersonalCommunicationDocumentReproducesType currentInstance = null;
	private static final Log log = LogFactory.getLog(PersonalCommunicationDocumentReproducesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PersonalCommunicationDocumentReproducesIterator thePersonalCommunicationDocumentReproducesIterator = (PersonalCommunicationDocumentReproducesIterator)findAncestorWithClass(this, PersonalCommunicationDocumentReproducesIterator.class);
			pageContext.getOut().print(thePersonalCommunicationDocumentReproducesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing PersonalCommunicationDocument for reproduces tag ", e);
			throw new JspTagException("Error: Can't find enclosing PersonalCommunicationDocument for reproduces tag ");
		}
		return SKIP_BODY;
	}
}

