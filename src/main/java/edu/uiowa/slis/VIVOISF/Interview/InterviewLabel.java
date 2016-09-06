package edu.uiowa.slis.VIVOISF.Interview;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class InterviewLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static InterviewLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(InterviewLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Interview theInterview = (Interview)findAncestorWithClass(this, Interview.class);
			if (!theInterview.commitNeeded) {
				pageContext.getOut().print(theInterview.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Interview for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Interview for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			Interview theInterview = (Interview)findAncestorWithClass(this, Interview.class);
			return theInterview.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing Interview for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Interview for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			Interview theInterview = (Interview)findAncestorWithClass(this, Interview.class);
			theInterview.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing Interview for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Interview for label tag ");
		}
	}
}

