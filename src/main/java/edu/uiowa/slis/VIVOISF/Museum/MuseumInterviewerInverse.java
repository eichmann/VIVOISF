package edu.uiowa.slis.VIVOISF.Museum;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MuseumInterviewerInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static MuseumInterviewerInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(MuseumInterviewerInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MuseumInterviewerInverseIterator theMuseumInterviewerInverseIterator = (MuseumInterviewerInverseIterator)findAncestorWithClass(this, MuseumInterviewerInverseIterator.class);
			pageContext.getOut().print(theMuseumInterviewerInverseIterator.getInterviewerInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Museum for interviewer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Museum for interviewer tag ");
		}
		return SKIP_BODY;
	}
}

