package edu.uiowa.slis.VIVOISF.Periodical;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeriodicalRank extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PeriodicalRank currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalRank.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PeriodicalRankIterator thePeriodical = (PeriodicalRankIterator)findAncestorWithClass(this, PeriodicalRankIterator.class);
			pageContext.getOut().print(thePeriodical.getRank());
		} catch (Exception e) {
			log.error("Can't find enclosing Periodical for rank tag ", e);
			throw new JspTagException("Error: Can't find enclosing Periodical for rank tag ");
		}
		return SKIP_BODY;
	}
}

