package edu.uiowa.slis.VIVOISF.Museum;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MuseumIntervieweeInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static MuseumIntervieweeInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(MuseumIntervieweeInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MuseumIntervieweeInverseIterator theMuseumIntervieweeInverseIterator = (MuseumIntervieweeInverseIterator)findAncestorWithClass(this, MuseumIntervieweeInverseIterator.class);
			pageContext.getOut().print(theMuseumIntervieweeInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Museum for interviewee tag ", e);
			throw new JspTagException("Error: Can't find enclosing Museum for interviewee tag ");
		}
		return SKIP_BODY;
	}
}

