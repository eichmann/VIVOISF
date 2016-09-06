package edu.uiowa.slis.VIVOISF.Thesis;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThesisPresentedAt extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ThesisPresentedAt currentInstance = null;
	private static final Log log = LogFactory.getLog(ThesisPresentedAt.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ThesisPresentedAtIterator theThesisPresentedAtIterator = (ThesisPresentedAtIterator)findAncestorWithClass(this, ThesisPresentedAtIterator.class);
			pageContext.getOut().print(theThesisPresentedAtIterator.getPresentedAt());
		} catch (Exception e) {
			log.error("Can't find enclosing Thesis for presentedAt tag ", e);
			throw new JspTagException("Error: Can't find enclosing Thesis for presentedAt tag ");
		}
		return SKIP_BODY;
	}
}

