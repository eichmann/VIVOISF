package edu.uiowa.slis.VIVOISF.Standard;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StandardPresentedAt extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StandardPresentedAt currentInstance = null;
	private static final Log log = LogFactory.getLog(StandardPresentedAt.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			StandardPresentedAtIterator theStandardPresentedAtIterator = (StandardPresentedAtIterator)findAncestorWithClass(this, StandardPresentedAtIterator.class);
			pageContext.getOut().print(theStandardPresentedAtIterator.getPresentedAt());
		} catch (Exception e) {
			log.error("Can't find enclosing Standard for presentedAt tag ", e);
			throw new JspTagException("Error: Can't find enclosing Standard for presentedAt tag ");
		}
		return SKIP_BODY;
	}
}

