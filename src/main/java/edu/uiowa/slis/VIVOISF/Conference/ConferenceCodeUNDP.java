package edu.uiowa.slis.VIVOISF.Conference;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferenceCodeUNDP extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferenceCodeUNDP currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferenceCodeUNDP.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConferenceCodeUNDPIterator theConference = (ConferenceCodeUNDPIterator)findAncestorWithClass(this, ConferenceCodeUNDPIterator.class);
			pageContext.getOut().print(theConference.getCodeUNDP());
		} catch (Exception e) {
			log.error("Can't find enclosing Conference for codeUNDP tag ", e);
			throw new JspTagException("Error: Can't find enclosing Conference for codeUNDP tag ");
		}
		return SKIP_BODY;
	}
}

