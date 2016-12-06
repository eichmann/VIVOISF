package edu.uiowa.slis.VIVOISF.Periodical;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeriodicalCodeGAUL extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PeriodicalCodeGAUL currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalCodeGAUL.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PeriodicalCodeGAULIterator thePeriodical = (PeriodicalCodeGAULIterator)findAncestorWithClass(this, PeriodicalCodeGAULIterator.class);
			pageContext.getOut().print(thePeriodical.getCodeGAUL());
		} catch (Exception e) {
			log.error("Can't find enclosing Periodical for codeGAUL tag ", e);
			throw new JspTagException("Error: Can't find enclosing Periodical for codeGAUL tag ");
		}
		return SKIP_BODY;
	}
}

