package edu.uiowa.slis.VIVOISF.Erratum;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ErratumPresentedAt extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ErratumPresentedAt currentInstance = null;
	private static final Log log = LogFactory.getLog(ErratumPresentedAt.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ErratumPresentedAtIterator theErratumPresentedAtIterator = (ErratumPresentedAtIterator)findAncestorWithClass(this, ErratumPresentedAtIterator.class);
			pageContext.getOut().print(theErratumPresentedAtIterator.getPresentedAt());
		} catch (Exception e) {
			log.error("Can't find enclosing Erratum for presentedAt tag ", e);
			throw new JspTagException("Error: Can't find enclosing Erratum for presentedAt tag ");
		}
		return SKIP_BODY;
	}
}

