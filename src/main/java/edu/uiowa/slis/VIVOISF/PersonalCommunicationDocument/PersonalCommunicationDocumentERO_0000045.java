package edu.uiowa.slis.VIVOISF.PersonalCommunicationDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PersonalCommunicationDocumentERO_0000045 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PersonalCommunicationDocumentERO_0000045 currentInstance = null;
	private static final Log log = LogFactory.getLog(PersonalCommunicationDocumentERO_0000045.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PersonalCommunicationDocumentERO_0000045Iterator thePersonalCommunicationDocument = (PersonalCommunicationDocumentERO_0000045Iterator)findAncestorWithClass(this, PersonalCommunicationDocumentERO_0000045Iterator.class);
			pageContext.getOut().print(thePersonalCommunicationDocument.getERO_0000045());
		} catch (Exception e) {
			log.error("Can't find enclosing PersonalCommunicationDocument for ERO_0000045 tag ", e);
			throw new JspTagException("Error: Can't find enclosing PersonalCommunicationDocument for ERO_0000045 tag ");
		}
		return SKIP_BODY;
	}
}

