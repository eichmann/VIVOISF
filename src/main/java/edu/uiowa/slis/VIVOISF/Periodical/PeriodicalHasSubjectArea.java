package edu.uiowa.slis.VIVOISF.Periodical;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeriodicalHasSubjectArea extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PeriodicalHasSubjectArea currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalHasSubjectArea.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PeriodicalHasSubjectAreaIterator thePeriodicalHasSubjectAreaIterator = (PeriodicalHasSubjectAreaIterator)findAncestorWithClass(this, PeriodicalHasSubjectAreaIterator.class);
			pageContext.getOut().print(thePeriodicalHasSubjectAreaIterator.getHasSubjectArea());
		} catch (Exception e) {
			log.error("Can't find enclosing Periodical for hasSubjectArea tag ", e);
			throw new JspTagException("Error: Can't find enclosing Periodical for hasSubjectArea tag ");
		}
		return SKIP_BODY;
	}
}

