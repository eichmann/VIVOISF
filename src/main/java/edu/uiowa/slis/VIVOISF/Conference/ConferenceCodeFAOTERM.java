package edu.uiowa.slis.VIVOISF.Conference;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferenceCodeFAOTERM extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferenceCodeFAOTERM currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferenceCodeFAOTERM.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConferenceCodeFAOTERMIterator theConference = (ConferenceCodeFAOTERMIterator)findAncestorWithClass(this, ConferenceCodeFAOTERMIterator.class);
			pageContext.getOut().print(theConference.getCodeFAOTERM());
		} catch (Exception e) {
			log.error("Can't find enclosing Conference for codeFAOTERM tag ", e);
			throw new JspTagException("Error: Can't find enclosing Conference for codeFAOTERM tag ");
		}
		return SKIP_BODY;
	}
}

