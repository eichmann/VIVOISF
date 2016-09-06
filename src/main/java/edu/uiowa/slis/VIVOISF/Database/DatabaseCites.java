package edu.uiowa.slis.VIVOISF.Database;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatabaseCites extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DatabaseCites currentInstance = null;
	private static final Log log = LogFactory.getLog(DatabaseCites.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DatabaseCitesIterator theDatabaseCitesIterator = (DatabaseCitesIterator)findAncestorWithClass(this, DatabaseCitesIterator.class);
			pageContext.getOut().print(theDatabaseCitesIterator.getCites());
		} catch (Exception e) {
			log.error("Can't find enclosing Database for cites tag ", e);
			throw new JspTagException("Error: Can't find enclosing Database for cites tag ");
		}
		return SKIP_BODY;
	}
}

