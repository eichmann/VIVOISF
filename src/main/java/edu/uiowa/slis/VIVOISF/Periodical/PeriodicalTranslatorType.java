package edu.uiowa.slis.VIVOISF.Periodical;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeriodicalTranslatorType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PeriodicalTranslatorType currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalTranslatorType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PeriodicalTranslatorIterator thePeriodicalTranslatorIterator = (PeriodicalTranslatorIterator)findAncestorWithClass(this, PeriodicalTranslatorIterator.class);
			pageContext.getOut().print(thePeriodicalTranslatorIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Periodical for translator tag ", e);
			throw new JspTagException("Error: Can't find enclosing Periodical for translator tag ");
		}
		return SKIP_BODY;
	}
}

