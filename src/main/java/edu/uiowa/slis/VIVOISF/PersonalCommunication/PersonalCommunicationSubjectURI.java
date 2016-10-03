package edu.uiowa.slis.VIVOISF.PersonalCommunication;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PersonalCommunicationSubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PersonalCommunicationSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(PersonalCommunicationSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			PersonalCommunication thePersonalCommunication = (PersonalCommunication)findAncestorWithClass(this, PersonalCommunication.class);
			if (!thePersonalCommunication.commitNeeded) {
				pageContext.getOut().print(thePersonalCommunication.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing PersonalCommunication for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing PersonalCommunication for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			PersonalCommunication thePersonalCommunication = (PersonalCommunication)findAncestorWithClass(this, PersonalCommunication.class);
			return thePersonalCommunication.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing PersonalCommunication for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing PersonalCommunication for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			PersonalCommunication thePersonalCommunication = (PersonalCommunication)findAncestorWithClass(this, PersonalCommunication.class);
			thePersonalCommunication.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing PersonalCommunication for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing PersonalCommunication for subjectURI tag ");
		}
	}
}

