package edu.uiowa.slis.VIVOISF.Erratum;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ErratumLocator extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ErratumLocator currentInstance = null;
	private static final Log log = LogFactory.getLog(ErratumLocator.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ErratumLocatorIterator theErratum = (ErratumLocatorIterator)findAncestorWithClass(this, ErratumLocatorIterator.class);
			pageContext.getOut().print(theErratum.getLocator());
		} catch (Exception e) {
			log.error("Can't find enclosing Erratum for locator tag ", e);
			throw new JspTagException("Error: Can't find enclosing Erratum for locator tag ");
		}
		return SKIP_BODY;
	}
}

