package edu.uiowa.slis.VIVOISF.Periodical;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeriodicalCodeDBPediaID extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PeriodicalCodeDBPediaID currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalCodeDBPediaID.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PeriodicalCodeDBPediaIDIterator thePeriodical = (PeriodicalCodeDBPediaIDIterator)findAncestorWithClass(this, PeriodicalCodeDBPediaIDIterator.class);
			pageContext.getOut().print(thePeriodical.getCodeDBPediaID());
		} catch (Exception e) {
			log.error("Can't find enclosing Periodical for codeDBPediaID tag ", e);
			throw new JspTagException("Error: Can't find enclosing Periodical for codeDBPediaID tag ");
		}
		return SKIP_BODY;
	}
}

