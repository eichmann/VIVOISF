package edu.uiowa.slis.VIVOISF.PersonalCommunicationDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PersonalCommunicationDocumentOclcnum extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PersonalCommunicationDocumentOclcnum currentInstance = null;
	private static final Log log = LogFactory.getLog(PersonalCommunicationDocumentOclcnum.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PersonalCommunicationDocumentOclcnumIterator thePersonalCommunicationDocument = (PersonalCommunicationDocumentOclcnumIterator)findAncestorWithClass(this, PersonalCommunicationDocumentOclcnumIterator.class);
			pageContext.getOut().print(thePersonalCommunicationDocument.getOclcnum());
		} catch (Exception e) {
			log.error("Can't find enclosing PersonalCommunicationDocument for oclcnum tag ", e);
			throw new JspTagException("Error: Can't find enclosing PersonalCommunicationDocument for oclcnum tag ");
		}
		return SKIP_BODY;
	}
}

