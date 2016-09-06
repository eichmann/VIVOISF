package edu.uiowa.slis.VIVOISF.PersonalCommunicationDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PersonalCommunicationDocumentARG_0000001 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PersonalCommunicationDocumentARG_0000001 currentInstance = null;
	private static final Log log = LogFactory.getLog(PersonalCommunicationDocumentARG_0000001.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PersonalCommunicationDocumentARG_0000001Iterator thePersonalCommunicationDocument = (PersonalCommunicationDocumentARG_0000001Iterator)findAncestorWithClass(this, PersonalCommunicationDocumentARG_0000001Iterator.class);
			pageContext.getOut().print(thePersonalCommunicationDocument.getARG_0000001());
		} catch (Exception e) {
			log.error("Can't find enclosing PersonalCommunicationDocument for ARG_0000001 tag ", e);
			throw new JspTagException("Error: Can't find enclosing PersonalCommunicationDocument for ARG_0000001 tag ");
		}
		return SKIP_BODY;
	}
}

