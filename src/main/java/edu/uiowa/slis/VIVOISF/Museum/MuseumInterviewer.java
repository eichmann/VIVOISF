package edu.uiowa.slis.VIVOISF.Museum;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MuseumInterviewer extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static MuseumInterviewer currentInstance = null;
	private static final Log log = LogFactory.getLog(MuseumInterviewer.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MuseumInterviewerIterator theMuseumInterviewerIterator = (MuseumInterviewerIterator)findAncestorWithClass(this, MuseumInterviewerIterator.class);
			pageContext.getOut().print(theMuseumInterviewerIterator.getInterviewer());
		} catch (Exception e) {
			log.error("Can't find enclosing Museum for interviewer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Museum for interviewer tag ");
		}
		return SKIP_BODY;
	}
}

