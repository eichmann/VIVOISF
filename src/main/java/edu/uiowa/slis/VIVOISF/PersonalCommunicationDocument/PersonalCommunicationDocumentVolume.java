package edu.uiowa.slis.VIVOISF.PersonalCommunicationDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PersonalCommunicationDocumentVolume extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PersonalCommunicationDocumentVolume currentInstance = null;
	private static final Log log = LogFactory.getLog(PersonalCommunicationDocumentVolume.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PersonalCommunicationDocumentVolumeIterator thePersonalCommunicationDocument = (PersonalCommunicationDocumentVolumeIterator)findAncestorWithClass(this, PersonalCommunicationDocumentVolumeIterator.class);
			pageContext.getOut().print(thePersonalCommunicationDocument.getVolume());
		} catch (Exception e) {
			log.error("Can't find enclosing PersonalCommunicationDocument for volume tag ", e);
			throw new JspTagException("Error: Can't find enclosing PersonalCommunicationDocument for volume tag ");
		}
		return SKIP_BODY;
	}
}

