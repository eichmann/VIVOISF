package edu.uiowa.slis.VIVOISF.Conference;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferenceHasTelephone extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferenceHasTelephone currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferenceHasTelephone.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ConferenceHasTelephoneIterator theConferenceHasTelephoneIterator = (ConferenceHasTelephoneIterator)findAncestorWithClass(this, ConferenceHasTelephoneIterator.class);
			pageContext.getOut().print(theConferenceHasTelephoneIterator.getHasTelephone());
		} catch (Exception e) {
			log.error("Can't find enclosing Conference for hasTelephone tag ", e);
			throw new JspTagException("Error: Can't find enclosing Conference for hasTelephone tag ");
		}
		return SKIP_BODY;
	}
}

