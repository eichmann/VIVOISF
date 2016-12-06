package edu.uiowa.slis.VIVOISF.Periodical;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeriodicalHDITotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PeriodicalHDITotal currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalHDITotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PeriodicalHDITotalIterator thePeriodical = (PeriodicalHDITotalIterator)findAncestorWithClass(this, PeriodicalHDITotalIterator.class);
			pageContext.getOut().print(thePeriodical.getHDITotal());
		} catch (Exception e) {
			log.error("Can't find enclosing Periodical for HDITotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing Periodical for HDITotal tag ");
		}
		return SKIP_BODY;
	}
}

