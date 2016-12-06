package edu.uiowa.slis.VIVOISF.Conference;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferenceGDPUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferenceGDPUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferenceGDPUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConferenceGDPUnitIterator theConference = (ConferenceGDPUnitIterator)findAncestorWithClass(this, ConferenceGDPUnitIterator.class);
			pageContext.getOut().print(theConference.getGDPUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing Conference for GDPUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing Conference for GDPUnit tag ");
		}
		return SKIP_BODY;
	}
}

