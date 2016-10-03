package edu.uiowa.slis.VIVOISF.Manuscript;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ManuscriptLocator extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ManuscriptLocator currentInstance = null;
	private static final Log log = LogFactory.getLog(ManuscriptLocator.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ManuscriptLocatorIterator theManuscript = (ManuscriptLocatorIterator)findAncestorWithClass(this, ManuscriptLocatorIterator.class);
			pageContext.getOut().print(theManuscript.getLocator());
		} catch (Exception e) {
			log.error("Can't find enclosing Manuscript for locator tag ", e);
			throw new JspTagException("Error: Can't find enclosing Manuscript for locator tag ");
		}
		return SKIP_BODY;
	}
}

