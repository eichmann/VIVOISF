package edu.uiowa.slis.VIVOISF.Museum;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MuseumInterviewee extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static MuseumInterviewee currentInstance = null;
	private static final Log log = LogFactory.getLog(MuseumInterviewee.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MuseumIntervieweeIterator theMuseumIntervieweeIterator = (MuseumIntervieweeIterator)findAncestorWithClass(this, MuseumIntervieweeIterator.class);
			pageContext.getOut().print(theMuseumIntervieweeIterator.getInterviewee());
		} catch (Exception e) {
			log.error("Can't find enclosing Museum for interviewee tag ", e);
			throw new JspTagException("Error: Can't find enclosing Museum for interviewee tag ");
		}
		return SKIP_BODY;
	}
}

