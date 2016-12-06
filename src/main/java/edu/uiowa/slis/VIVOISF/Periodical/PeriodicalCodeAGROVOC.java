package edu.uiowa.slis.VIVOISF.Periodical;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeriodicalCodeAGROVOC extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PeriodicalCodeAGROVOC currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalCodeAGROVOC.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PeriodicalCodeAGROVOCIterator thePeriodical = (PeriodicalCodeAGROVOCIterator)findAncestorWithClass(this, PeriodicalCodeAGROVOCIterator.class);
			pageContext.getOut().print(thePeriodical.getCodeAGROVOC());
		} catch (Exception e) {
			log.error("Can't find enclosing Periodical for codeAGROVOC tag ", e);
			throw new JspTagException("Error: Can't find enclosing Periodical for codeAGROVOC tag ");
		}
		return SKIP_BODY;
	}
}

