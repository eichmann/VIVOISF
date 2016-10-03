package edu.uiowa.slis.VIVOISF.Abstract;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AbstractLocator extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AbstractLocator currentInstance = null;
	private static final Log log = LogFactory.getLog(AbstractLocator.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AbstractLocatorIterator theAbstract = (AbstractLocatorIterator)findAncestorWithClass(this, AbstractLocatorIterator.class);
			pageContext.getOut().print(theAbstract.getLocator());
		} catch (Exception e) {
			log.error("Can't find enclosing Abstract for locator tag ", e);
			throw new JspTagException("Error: Can't find enclosing Abstract for locator tag ");
		}
		return SKIP_BODY;
	}
}

