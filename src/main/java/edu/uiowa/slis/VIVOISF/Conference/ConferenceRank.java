package edu.uiowa.slis.VIVOISF.Conference;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferenceRank extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferenceRank currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferenceRank.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConferenceRankIterator theConference = (ConferenceRankIterator)findAncestorWithClass(this, ConferenceRankIterator.class);
			pageContext.getOut().print(theConference.getRank());
		} catch (Exception e) {
			log.error("Can't find enclosing Conference for rank tag ", e);
			throw new JspTagException("Error: Can't find enclosing Conference for rank tag ");
		}
		return SKIP_BODY;
	}
}

