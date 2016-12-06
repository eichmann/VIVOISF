package edu.uiowa.slis.VIVOISF.Thing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThingRank extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ThingRank currentInstance = null;
	private static final Log log = LogFactory.getLog(ThingRank.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ThingRankIterator theThing = (ThingRankIterator)findAncestorWithClass(this, ThingRankIterator.class);
			pageContext.getOut().print(theThing.getRank());
		} catch (Exception e) {
			log.error("Can't find enclosing Thing for rank tag ", e);
			throw new JspTagException("Error: Can't find enclosing Thing for rank tag ");
		}
		return SKIP_BODY;
	}
}

