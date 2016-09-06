package edu.uiowa.slis.VIVOISF.Legislation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LegislationPresentedAt extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LegislationPresentedAt currentInstance = null;
	private static final Log log = LogFactory.getLog(LegislationPresentedAt.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LegislationPresentedAtIterator theLegislationPresentedAtIterator = (LegislationPresentedAtIterator)findAncestorWithClass(this, LegislationPresentedAtIterator.class);
			pageContext.getOut().print(theLegislationPresentedAtIterator.getPresentedAt());
		} catch (Exception e) {
			log.error("Can't find enclosing Legislation for presentedAt tag ", e);
			throw new JspTagException("Error: Can't find enclosing Legislation for presentedAt tag ");
		}
		return SKIP_BODY;
	}
}

