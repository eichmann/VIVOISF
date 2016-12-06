package edu.uiowa.slis.VIVOISF.Conference;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferenceHasTitleType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferenceHasTitleType currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferenceHasTitleType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ConferenceHasTitleIterator theConferenceHasTitleIterator = (ConferenceHasTitleIterator)findAncestorWithClass(this, ConferenceHasTitleIterator.class);
			pageContext.getOut().print(theConferenceHasTitleIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Conference for hasTitle tag ", e);
			throw new JspTagException("Error: Can't find enclosing Conference for hasTitle tag ");
		}
		return SKIP_BODY;
	}
}

