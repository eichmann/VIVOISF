package edu.uiowa.slis.VIVOISF.territory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class territoryHasStatistics extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static territoryHasStatistics currentInstance = null;
	private static final Log log = LogFactory.getLog(territoryHasStatistics.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			territoryHasStatisticsIterator theterritory = (territoryHasStatisticsIterator)findAncestorWithClass(this, territoryHasStatisticsIterator.class);
			pageContext.getOut().print(theterritory.getHasStatistics());
		} catch (Exception e) {
			log.error("Can't find enclosing territory for hasStatistics tag ", e);
			throw new JspTagException("Error: Can't find enclosing territory for hasStatistics tag ");
		}
		return SKIP_BODY;
	}
}

