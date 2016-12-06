package edu.uiowa.slis.VIVOISF.territory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class territoryRank extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static territoryRank currentInstance = null;
	private static final Log log = LogFactory.getLog(territoryRank.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			territoryRankIterator theterritory = (territoryRankIterator)findAncestorWithClass(this, territoryRankIterator.class);
			pageContext.getOut().print(theterritory.getRank());
		} catch (Exception e) {
			log.error("Can't find enclosing territory for rank tag ", e);
			throw new JspTagException("Error: Can't find enclosing territory for rank tag ");
		}
		return SKIP_BODY;
	}
}

