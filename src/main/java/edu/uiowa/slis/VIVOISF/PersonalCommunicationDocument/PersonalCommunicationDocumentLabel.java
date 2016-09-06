package edu.uiowa.slis.VIVOISF.PersonalCommunicationDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PersonalCommunicationDocumentLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PersonalCommunicationDocumentLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(PersonalCommunicationDocumentLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			PersonalCommunicationDocument thePersonalCommunicationDocument = (PersonalCommunicationDocument)findAncestorWithClass(this, PersonalCommunicationDocument.class);
			if (!thePersonalCommunicationDocument.commitNeeded) {
				pageContext.getOut().print(thePersonalCommunicationDocument.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing PersonalCommunicationDocument for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing PersonalCommunicationDocument for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			PersonalCommunicationDocument thePersonalCommunicationDocument = (PersonalCommunicationDocument)findAncestorWithClass(this, PersonalCommunicationDocument.class);
			return thePersonalCommunicationDocument.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing PersonalCommunicationDocument for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing PersonalCommunicationDocument for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			PersonalCommunicationDocument thePersonalCommunicationDocument = (PersonalCommunicationDocument)findAncestorWithClass(this, PersonalCommunicationDocument.class);
			thePersonalCommunicationDocument.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing PersonalCommunicationDocument for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing PersonalCommunicationDocument for label tag ");
		}
	}
}

