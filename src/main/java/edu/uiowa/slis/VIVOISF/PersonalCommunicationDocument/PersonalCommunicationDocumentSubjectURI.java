package edu.uiowa.slis.VIVOISF.PersonalCommunicationDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PersonalCommunicationDocumentSubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PersonalCommunicationDocumentSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(PersonalCommunicationDocumentSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			PersonalCommunicationDocument thePersonalCommunicationDocument = (PersonalCommunicationDocument)findAncestorWithClass(this, PersonalCommunicationDocument.class);
			if (!thePersonalCommunicationDocument.commitNeeded) {
				pageContext.getOut().print(thePersonalCommunicationDocument.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing PersonalCommunicationDocument for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing PersonalCommunicationDocument for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			PersonalCommunicationDocument thePersonalCommunicationDocument = (PersonalCommunicationDocument)findAncestorWithClass(this, PersonalCommunicationDocument.class);
			return thePersonalCommunicationDocument.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing PersonalCommunicationDocument for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing PersonalCommunicationDocument for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			PersonalCommunicationDocument thePersonalCommunicationDocument = (PersonalCommunicationDocument)findAncestorWithClass(this, PersonalCommunicationDocument.class);
			thePersonalCommunicationDocument.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing PersonalCommunicationDocument for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing PersonalCommunicationDocument for subjectURI tag ");
		}
	}
}

