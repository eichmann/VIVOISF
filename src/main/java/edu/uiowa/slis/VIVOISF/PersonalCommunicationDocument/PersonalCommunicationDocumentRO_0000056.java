package edu.uiowa.slis.VIVOISF.PersonalCommunicationDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PersonalCommunicationDocumentRO_0000056 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PersonalCommunicationDocumentRO_0000056 currentInstance = null;
	private static final Log log = LogFactory.getLog(PersonalCommunicationDocumentRO_0000056.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PersonalCommunicationDocumentRO_0000056Iterator thePersonalCommunicationDocumentRO_0000056Iterator = (PersonalCommunicationDocumentRO_0000056Iterator)findAncestorWithClass(this, PersonalCommunicationDocumentRO_0000056Iterator.class);
			pageContext.getOut().print(thePersonalCommunicationDocumentRO_0000056Iterator.getRO_0000056());
		} catch (Exception e) {
			log.error("Can't find enclosing PersonalCommunicationDocument for RO_0000056 tag ", e);
			throw new JspTagException("Error: Can't find enclosing PersonalCommunicationDocument for RO_0000056 tag ");
		}
		return SKIP_BODY;
	}
}

