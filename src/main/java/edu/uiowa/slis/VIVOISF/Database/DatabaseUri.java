package edu.uiowa.slis.VIVOISF.Database;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatabaseUri extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DatabaseUri currentInstance = null;
	private static final Log log = LogFactory.getLog(DatabaseUri.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DatabaseUriIterator theDatabase = (DatabaseUriIterator)findAncestorWithClass(this, DatabaseUriIterator.class);
			pageContext.getOut().print(theDatabase.getUri());
		} catch (Exception e) {
			log.error("Can't find enclosing Database for uri tag ", e);
			throw new JspTagException("Error: Can't find enclosing Database for uri tag ");
		}
		return SKIP_BODY;
	}
}

