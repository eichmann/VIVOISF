package edu.uiowa.slis.VIVOISF.Database;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatabaseCitedBy extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DatabaseCitedBy currentInstance = null;
	private static final Log log = LogFactory.getLog(DatabaseCitedBy.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DatabaseCitedByIterator theDatabaseCitedByIterator = (DatabaseCitedByIterator)findAncestorWithClass(this, DatabaseCitedByIterator.class);
			pageContext.getOut().print(theDatabaseCitedByIterator.getCitedBy());
		} catch (Exception e) {
			log.error("Can't find enclosing Database for citedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Database for citedBy tag ");
		}
		return SKIP_BODY;
	}
}

