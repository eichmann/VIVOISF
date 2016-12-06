package edu.uiowa.slis.VIVOISF.Periodical;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeriodicalNameListEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PeriodicalNameListEN currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalNameListEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PeriodicalNameListENIterator thePeriodical = (PeriodicalNameListENIterator)findAncestorWithClass(this, PeriodicalNameListENIterator.class);
			pageContext.getOut().print(thePeriodical.getNameListEN());
		} catch (Exception e) {
			log.error("Can't find enclosing Periodical for nameListEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing Periodical for nameListEN tag ");
		}
		return SKIP_BODY;
	}
}

