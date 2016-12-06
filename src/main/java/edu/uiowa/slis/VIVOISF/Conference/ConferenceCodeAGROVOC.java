package edu.uiowa.slis.VIVOISF.Conference;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferenceCodeAGROVOC extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferenceCodeAGROVOC currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferenceCodeAGROVOC.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConferenceCodeAGROVOCIterator theConference = (ConferenceCodeAGROVOCIterator)findAncestorWithClass(this, ConferenceCodeAGROVOCIterator.class);
			pageContext.getOut().print(theConference.getCodeAGROVOC());
		} catch (Exception e) {
			log.error("Can't find enclosing Conference for codeAGROVOC tag ", e);
			throw new JspTagException("Error: Can't find enclosing Conference for codeAGROVOC tag ");
		}
		return SKIP_BODY;
	}
}

