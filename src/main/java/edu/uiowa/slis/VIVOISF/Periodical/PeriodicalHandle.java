package edu.uiowa.slis.VIVOISF.Periodical;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeriodicalHandle extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PeriodicalHandle currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalHandle.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PeriodicalHandleIterator thePeriodical = (PeriodicalHandleIterator)findAncestorWithClass(this, PeriodicalHandleIterator.class);
			pageContext.getOut().print(thePeriodical.getHandle());
		} catch (Exception e) {
			log.error("Can't find enclosing Periodical for handle tag ", e);
			throw new JspTagException("Error: Can't find enclosing Periodical for handle tag ");
		}
		return SKIP_BODY;
	}
}

