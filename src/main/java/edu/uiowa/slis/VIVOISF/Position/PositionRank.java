package edu.uiowa.slis.VIVOISF.Position;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PositionRank extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PositionRank currentInstance = null;
	private static final Log log = LogFactory.getLog(PositionRank.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PositionRankIterator thePosition = (PositionRankIterator)findAncestorWithClass(this, PositionRankIterator.class);
			pageContext.getOut().print(thePosition.getRank());
		} catch (Exception e) {
			log.error("Can't find enclosing Position for rank tag ", e);
			throw new JspTagException("Error: Can't find enclosing Position for rank tag ");
		}
		return SKIP_BODY;
	}
}

