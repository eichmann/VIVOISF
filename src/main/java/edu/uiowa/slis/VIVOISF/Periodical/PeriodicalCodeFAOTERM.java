package edu.uiowa.slis.VIVOISF.Periodical;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeriodicalCodeFAOTERM extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PeriodicalCodeFAOTERM currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalCodeFAOTERM.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PeriodicalCodeFAOTERMIterator thePeriodical = (PeriodicalCodeFAOTERMIterator)findAncestorWithClass(this, PeriodicalCodeFAOTERMIterator.class);
			pageContext.getOut().print(thePeriodical.getCodeFAOTERM());
		} catch (Exception e) {
			log.error("Can't find enclosing Periodical for codeFAOTERM tag ", e);
			throw new JspTagException("Error: Can't find enclosing Periodical for codeFAOTERM tag ");
		}
		return SKIP_BODY;
	}
}

