package edu.uiowa.slis.VIVOISF.Periodical;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeriodicalOclcnum extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PeriodicalOclcnum currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalOclcnum.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PeriodicalOclcnumIterator thePeriodical = (PeriodicalOclcnumIterator)findAncestorWithClass(this, PeriodicalOclcnumIterator.class);
			pageContext.getOut().print(thePeriodical.getOclcnum());
		} catch (Exception e) {
			log.error("Can't find enclosing Periodical for oclcnum tag ", e);
			throw new JspTagException("Error: Can't find enclosing Periodical for oclcnum tag ");
		}
		return SKIP_BODY;
	}
}

