package edu.uiowa.slis.VIVOISF.Conference;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferenceFreetextKeyword extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferenceFreetextKeyword currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferenceFreetextKeyword.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConferenceFreetextKeywordIterator theConference = (ConferenceFreetextKeywordIterator)findAncestorWithClass(this, ConferenceFreetextKeywordIterator.class);
			pageContext.getOut().print(theConference.getFreetextKeyword());
		} catch (Exception e) {
			log.error("Can't find enclosing Conference for freetextKeyword tag ", e);
			throw new JspTagException("Error: Can't find enclosing Conference for freetextKeyword tag ");
		}
		return SKIP_BODY;
	}
}

