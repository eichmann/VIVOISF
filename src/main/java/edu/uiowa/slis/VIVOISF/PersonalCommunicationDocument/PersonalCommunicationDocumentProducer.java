package edu.uiowa.slis.VIVOISF.PersonalCommunicationDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PersonalCommunicationDocumentProducer extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PersonalCommunicationDocumentProducer currentInstance = null;
	private static final Log log = LogFactory.getLog(PersonalCommunicationDocumentProducer.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PersonalCommunicationDocumentProducerIterator thePersonalCommunicationDocumentProducerIterator = (PersonalCommunicationDocumentProducerIterator)findAncestorWithClass(this, PersonalCommunicationDocumentProducerIterator.class);
			pageContext.getOut().print(thePersonalCommunicationDocumentProducerIterator.getProducer());
		} catch (Exception e) {
			log.error("Can't find enclosing PersonalCommunicationDocument for producer tag ", e);
			throw new JspTagException("Error: Can't find enclosing PersonalCommunicationDocument for producer tag ");
		}
		return SKIP_BODY;
	}
}

