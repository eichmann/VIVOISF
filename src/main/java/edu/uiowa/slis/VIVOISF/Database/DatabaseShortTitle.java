package edu.uiowa.slis.VIVOISF.Database;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatabaseShortTitle extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DatabaseShortTitle currentInstance = null;
	private static final Log log = LogFactory.getLog(DatabaseShortTitle.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DatabaseShortTitleIterator theDatabase = (DatabaseShortTitleIterator)findAncestorWithClass(this, DatabaseShortTitleIterator.class);
			pageContext.getOut().print(theDatabase.getShortTitle());
		} catch (Exception e) {
			log.error("Can't find enclosing Database for shortTitle tag ", e);
			throw new JspTagException("Error: Can't find enclosing Database for shortTitle tag ");
		}
		return SKIP_BODY;
	}
}

