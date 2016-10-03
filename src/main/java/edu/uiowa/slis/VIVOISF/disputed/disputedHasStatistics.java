package edu.uiowa.slis.VIVOISF.disputed;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class disputedHasStatistics extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static disputedHasStatistics currentInstance = null;
	private static final Log log = LogFactory.getLog(disputedHasStatistics.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			disputedHasStatisticsIterator thedisputed = (disputedHasStatisticsIterator)findAncestorWithClass(this, disputedHasStatisticsIterator.class);
			pageContext.getOut().print(thedisputed.getHasStatistics());
		} catch (Exception e) {
			log.error("Can't find enclosing disputed for hasStatistics tag ", e);
			throw new JspTagException("Error: Can't find enclosing disputed for hasStatistics tag ");
		}
		return SKIP_BODY;
	}
}

