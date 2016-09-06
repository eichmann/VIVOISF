package edu.uiowa.slis.VIVOISF.PersonalCommunicationDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PersonalCommunicationDocumentIAO_0000136Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PersonalCommunicationDocumentIAO_0000136Type currentInstance = null;
	private static final Log log = LogFactory.getLog(PersonalCommunicationDocumentIAO_0000136Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PersonalCommunicationDocumentIAO_0000136Iterator thePersonalCommunicationDocumentIAO_0000136Iterator = (PersonalCommunicationDocumentIAO_0000136Iterator)findAncestorWithClass(this, PersonalCommunicationDocumentIAO_0000136Iterator.class);
			pageContext.getOut().print(thePersonalCommunicationDocumentIAO_0000136Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing PersonalCommunicationDocument for IAO_0000136 tag ", e);
			throw new JspTagException("Error: Can't find enclosing PersonalCommunicationDocument for IAO_0000136 tag ");
		}
		return SKIP_BODY;
	}
}

