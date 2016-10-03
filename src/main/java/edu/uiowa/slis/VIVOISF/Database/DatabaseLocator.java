package edu.uiowa.slis.VIVOISF.Database;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatabaseLocator extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DatabaseLocator currentInstance = null;
	private static final Log log = LogFactory.getLog(DatabaseLocator.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DatabaseLocatorIterator theDatabase = (DatabaseLocatorIterator)findAncestorWithClass(this, DatabaseLocatorIterator.class);
			pageContext.getOut().print(theDatabase.getLocator());
		} catch (Exception e) {
			log.error("Can't find enclosing Database for locator tag ", e);
			throw new JspTagException("Error: Can't find enclosing Database for locator tag ");
		}
		return SKIP_BODY;
	}
}

