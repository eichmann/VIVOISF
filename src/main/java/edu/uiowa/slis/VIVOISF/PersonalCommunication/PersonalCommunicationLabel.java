package edu.uiowa.slis.VIVOISF.PersonalCommunication;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PersonalCommunicationLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PersonalCommunicationLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(PersonalCommunicationLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			PersonalCommunication thePersonalCommunication = (PersonalCommunication)findAncestorWithClass(this, PersonalCommunication.class);
			if (!thePersonalCommunication.commitNeeded) {
				pageContext.getOut().print(thePersonalCommunication.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing PersonalCommunication for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing PersonalCommunication for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			PersonalCommunication thePersonalCommunication = (PersonalCommunication)findAncestorWithClass(this, PersonalCommunication.class);
			return thePersonalCommunication.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing PersonalCommunication for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing PersonalCommunication for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			PersonalCommunication thePersonalCommunication = (PersonalCommunication)findAncestorWithClass(this, PersonalCommunication.class);
			thePersonalCommunication.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing PersonalCommunication for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing PersonalCommunication for label tag ");
		}
	}
}

