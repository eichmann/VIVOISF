package edu.uiowa.slis.VIVOISF.ConferencePaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePaperRank extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePaperRank currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePaperRank.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConferencePaperRankIterator theConferencePaper = (ConferencePaperRankIterator)findAncestorWithClass(this, ConferencePaperRankIterator.class);
			pageContext.getOut().print(theConferencePaper.getRank());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePaper for rank tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePaper for rank tag ");
		}
		return SKIP_BODY;
	}
}

