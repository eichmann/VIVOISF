package edu.uiowa.slis.VIVOISF.Conference;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferenceHasNameType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferenceHasNameType currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferenceHasNameType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ConferenceHasNameIterator theConferenceHasNameIterator = (ConferenceHasNameIterator)findAncestorWithClass(this, ConferenceHasNameIterator.class);
			pageContext.getOut().print(theConferenceHasNameIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Conference for hasName tag ", e);
			throw new JspTagException("Error: Can't find enclosing Conference for hasName tag ");
		}
		return SKIP_BODY;
	}
}
