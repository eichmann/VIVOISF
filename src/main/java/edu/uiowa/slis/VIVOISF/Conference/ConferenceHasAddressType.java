package edu.uiowa.slis.VIVOISF.Conference;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferenceHasAddressType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferenceHasAddressType currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferenceHasAddressType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ConferenceHasAddressIterator theConferenceHasAddressIterator = (ConferenceHasAddressIterator)findAncestorWithClass(this, ConferenceHasAddressIterator.class);
			pageContext.getOut().print(theConferenceHasAddressIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Conference for hasAddress tag ", e);
			throw new JspTagException("Error: Can't find enclosing Conference for hasAddress tag ");
		}
		return SKIP_BODY;
	}
}

