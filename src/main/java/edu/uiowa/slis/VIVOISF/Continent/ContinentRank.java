package edu.uiowa.slis.VIVOISF.Continent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ContinentRank extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ContinentRank currentInstance = null;
	private static final Log log = LogFactory.getLog(ContinentRank.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ContinentRankIterator theContinent = (ContinentRankIterator)findAncestorWithClass(this, ContinentRankIterator.class);
			pageContext.getOut().print(theContinent.getRank());
		} catch (Exception e) {
			log.error("Can't find enclosing Continent for rank tag ", e);
			throw new JspTagException("Error: Can't find enclosing Continent for rank tag ");
		}
		return SKIP_BODY;
	}
}

