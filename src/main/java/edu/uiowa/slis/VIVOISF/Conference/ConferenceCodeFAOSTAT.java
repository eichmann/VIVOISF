package edu.uiowa.slis.VIVOISF.Conference;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferenceCodeFAOSTAT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferenceCodeFAOSTAT currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferenceCodeFAOSTAT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConferenceCodeFAOSTATIterator theConference = (ConferenceCodeFAOSTATIterator)findAncestorWithClass(this, ConferenceCodeFAOSTATIterator.class);
			pageContext.getOut().print(theConference.getCodeFAOSTAT());
		} catch (Exception e) {
			log.error("Can't find enclosing Conference for codeFAOSTAT tag ", e);
			throw new JspTagException("Error: Can't find enclosing Conference for codeFAOSTAT tag ");
		}
		return SKIP_BODY;
	}
}

