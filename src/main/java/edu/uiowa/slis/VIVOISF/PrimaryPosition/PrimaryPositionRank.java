package edu.uiowa.slis.VIVOISF.PrimaryPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PrimaryPositionRank extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PrimaryPositionRank currentInstance = null;
	private static final Log log = LogFactory.getLog(PrimaryPositionRank.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PrimaryPositionRankIterator thePrimaryPosition = (PrimaryPositionRankIterator)findAncestorWithClass(this, PrimaryPositionRankIterator.class);
			pageContext.getOut().print(thePrimaryPosition.getRank());
		} catch (Exception e) {
			log.error("Can't find enclosing PrimaryPosition for rank tag ", e);
			throw new JspTagException("Error: Can't find enclosing PrimaryPosition for rank tag ");
		}
		return SKIP_BODY;
	}
}

