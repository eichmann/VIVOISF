package edu.uiowa.slis.VIVOISF.ConferencePoster;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePosterRank extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePosterRank currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePosterRank.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConferencePosterRankIterator theConferencePoster = (ConferencePosterRankIterator)findAncestorWithClass(this, ConferencePosterRankIterator.class);
			pageContext.getOut().print(theConferencePoster.getRank());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePoster for rank tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePoster for rank tag ");
		}
		return SKIP_BODY;
	}
}

