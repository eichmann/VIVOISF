package edu.uiowa.slis.VIVOISF.Conference;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferenceHasTitle extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferenceHasTitle currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferenceHasTitle.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ConferenceHasTitleIterator theConferenceHasTitleIterator = (ConferenceHasTitleIterator)findAncestorWithClass(this, ConferenceHasTitleIterator.class);
			pageContext.getOut().print(theConferenceHasTitleIterator.getHasTitle());
		} catch (Exception e) {
			log.error("Can't find enclosing Conference for hasTitle tag ", e);
			throw new JspTagException("Error: Can't find enclosing Conference for hasTitle tag ");
		}
		return SKIP_BODY;
	}
}

