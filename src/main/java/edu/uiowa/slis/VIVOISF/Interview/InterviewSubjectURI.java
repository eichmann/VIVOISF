package edu.uiowa.slis.VIVOISF.Interview;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class InterviewSubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static InterviewSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(InterviewSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Interview theInterview = (Interview)findAncestorWithClass(this, Interview.class);
			if (!theInterview.commitNeeded) {
				pageContext.getOut().print(theInterview.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Interview for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Interview for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			Interview theInterview = (Interview)findAncestorWithClass(this, Interview.class);
			return theInterview.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing Interview for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Interview for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			Interview theInterview = (Interview)findAncestorWithClass(this, Interview.class);
			theInterview.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing Interview for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Interview for subjectURI tag ");
		}
	}
}

