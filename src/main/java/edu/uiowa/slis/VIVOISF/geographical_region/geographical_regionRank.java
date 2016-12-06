package edu.uiowa.slis.VIVOISF.geographical_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class geographical_regionRank extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static geographical_regionRank currentInstance = null;
	private static final Log log = LogFactory.getLog(geographical_regionRank.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			geographical_regionRankIterator thegeographical_region = (geographical_regionRankIterator)findAncestorWithClass(this, geographical_regionRankIterator.class);
			pageContext.getOut().print(thegeographical_region.getRank());
		} catch (Exception e) {
			log.error("Can't find enclosing geographical_region for rank tag ", e);
			throw new JspTagException("Error: Can't find enclosing geographical_region for rank tag ");
		}
		return SKIP_BODY;
	}
}

