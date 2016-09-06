package edu.uiowa.slis.VIVOISF.Emergency;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EmergencySubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EmergencySubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(EmergencySubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Emergency theEmergency = (Emergency)findAncestorWithClass(this, Emergency.class);
			if (!theEmergency.commitNeeded) {
				pageContext.getOut().print(theEmergency.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Emergency for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Emergency for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			Emergency theEmergency = (Emergency)findAncestorWithClass(this, Emergency.class);
			return theEmergency.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing Emergency for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Emergency for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			Emergency theEmergency = (Emergency)findAncestorWithClass(this, Emergency.class);
			theEmergency.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing Emergency for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Emergency for subjectURI tag ");
		}
	}
}

