package edu.uiowa.slis.VIVOISF.PersonalCommunicationDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PersonalCommunicationDocumentEanucc13 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PersonalCommunicationDocumentEanucc13 currentInstance = null;
	private static final Log log = LogFactory.getLog(PersonalCommunicationDocumentEanucc13.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PersonalCommunicationDocumentEanucc13Iterator thePersonalCommunicationDocument = (PersonalCommunicationDocumentEanucc13Iterator)findAncestorWithClass(this, PersonalCommunicationDocumentEanucc13Iterator.class);
			pageContext.getOut().print(thePersonalCommunicationDocument.getEanucc13());
		} catch (Exception e) {
			log.error("Can't find enclosing PersonalCommunicationDocument for eanucc13 tag ", e);
			throw new JspTagException("Error: Can't find enclosing PersonalCommunicationDocument for eanucc13 tag ");
		}
		return SKIP_BODY;
	}
}

