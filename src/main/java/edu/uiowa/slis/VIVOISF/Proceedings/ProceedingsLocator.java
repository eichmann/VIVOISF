package edu.uiowa.slis.VIVOISF.Proceedings;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ProceedingsLocator extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ProceedingsLocator currentInstance = null;
	private static final Log log = LogFactory.getLog(ProceedingsLocator.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ProceedingsLocatorIterator theProceedings = (ProceedingsLocatorIterator)findAncestorWithClass(this, ProceedingsLocatorIterator.class);
			pageContext.getOut().print(theProceedings.getLocator());
		} catch (Exception e) {
			log.error("Can't find enclosing Proceedings for locator tag ", e);
			throw new JspTagException("Error: Can't find enclosing Proceedings for locator tag ");
		}
		return SKIP_BODY;
	}
}

