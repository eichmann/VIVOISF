package edu.uiowa.slis.VIVOISF.self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class self_governingHasStatistics extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static self_governingHasStatistics currentInstance = null;
	private static final Log log = LogFactory.getLog(self_governingHasStatistics.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			self_governingHasStatisticsIterator theself_governing = (self_governingHasStatisticsIterator)findAncestorWithClass(this, self_governingHasStatisticsIterator.class);
			pageContext.getOut().print(theself_governing.getHasStatistics());
		} catch (Exception e) {
			log.error("Can't find enclosing self_governing for hasStatistics tag ", e);
			throw new JspTagException("Error: Can't find enclosing self_governing for hasStatistics tag ");
		}
		return SKIP_BODY;
	}
}

