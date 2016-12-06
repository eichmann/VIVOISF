package edu.uiowa.slis.VIVOISF.Conference;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferenceRelatesType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferenceRelatesType currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferenceRelatesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ConferenceRelatesIterator theConferenceRelatesIterator = (ConferenceRelatesIterator)findAncestorWithClass(this, ConferenceRelatesIterator.class);
			pageContext.getOut().print(theConferenceRelatesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Conference for relates tag ", e);
			throw new JspTagException("Error: Can't find enclosing Conference for relates tag ");
		}
		return SKIP_BODY;
	}
}

