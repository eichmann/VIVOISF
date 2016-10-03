package edu.uiowa.slis.VIVOISF.other;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class otherHasStatistics extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static otherHasStatistics currentInstance = null;
	private static final Log log = LogFactory.getLog(otherHasStatistics.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			otherHasStatisticsIterator theother = (otherHasStatisticsIterator)findAncestorWithClass(this, otherHasStatisticsIterator.class);
			pageContext.getOut().print(theother.getHasStatistics());
		} catch (Exception e) {
			log.error("Can't find enclosing other for hasStatistics tag ", e);
			throw new JspTagException("Error: Can't find enclosing other for hasStatistics tag ");
		}
		return SKIP_BODY;
	}
}

