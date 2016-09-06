package edu.uiowa.slis.VIVOISF.Conference;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferenceHasProceedings extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferenceHasProceedings currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferenceHasProceedings.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ConferenceHasProceedingsIterator theConferenceHasProceedingsIterator = (ConferenceHasProceedingsIterator)findAncestorWithClass(this, ConferenceHasProceedingsIterator.class);
			pageContext.getOut().print(theConferenceHasProceedingsIterator.getHasProceedings());
		} catch (Exception e) {
			log.error("Can't find enclosing Conference for hasProceedings tag ", e);
			throw new JspTagException("Error: Can't find enclosing Conference for hasProceedings tag ");
		}
		return SKIP_BODY;
	}
}

