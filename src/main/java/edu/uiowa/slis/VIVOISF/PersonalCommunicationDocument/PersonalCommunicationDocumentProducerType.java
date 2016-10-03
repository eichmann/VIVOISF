package edu.uiowa.slis.VIVOISF.PersonalCommunicationDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PersonalCommunicationDocumentProducerType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PersonalCommunicationDocumentProducerType currentInstance = null;
	private static final Log log = LogFactory.getLog(PersonalCommunicationDocumentProducerType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PersonalCommunicationDocumentProducerIterator thePersonalCommunicationDocumentProducerIterator = (PersonalCommunicationDocumentProducerIterator)findAncestorWithClass(this, PersonalCommunicationDocumentProducerIterator.class);
			pageContext.getOut().print(thePersonalCommunicationDocumentProducerIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing PersonalCommunicationDocument for producer tag ", e);
			throw new JspTagException("Error: Can't find enclosing PersonalCommunicationDocument for producer tag ");
		}
		return SKIP_BODY;
	}
}

