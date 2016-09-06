package edu.uiowa.slis.VIVOISF.Hearing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class HearingSubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static HearingSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(HearingSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Hearing theHearing = (Hearing)findAncestorWithClass(this, Hearing.class);
			if (!theHearing.commitNeeded) {
				pageContext.getOut().print(theHearing.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Hearing for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Hearing for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			Hearing theHearing = (Hearing)findAncestorWithClass(this, Hearing.class);
			return theHearing.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing Hearing for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Hearing for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			Hearing theHearing = (Hearing)findAncestorWithClass(this, Hearing.class);
			theHearing.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing Hearing for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Hearing for subjectURI tag ");
		}
	}
}

