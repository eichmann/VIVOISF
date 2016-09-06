package edu.uiowa.slis.VIVOISF.Conference;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferenceHasProceedingsType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferenceHasProceedingsType currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferenceHasProceedingsType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ConferenceHasProceedingsIterator theConferenceHasProceedingsIterator = (ConferenceHasProceedingsIterator)findAncestorWithClass(this, ConferenceHasProceedingsIterator.class);
			pageContext.getOut().print(theConferenceHasProceedingsIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Conference for hasProceedings tag ", e);
			throw new JspTagException("Error: Can't find enclosing Conference for hasProceedings tag ");
		}
		return SKIP_BODY;
	}
}

