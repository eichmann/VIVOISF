package edu.uiowa.slis.VIVOISF.Database;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatabaseUpc extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DatabaseUpc currentInstance = null;
	private static final Log log = LogFactory.getLog(DatabaseUpc.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DatabaseUpcIterator theDatabase = (DatabaseUpcIterator)findAncestorWithClass(this, DatabaseUpcIterator.class);
			pageContext.getOut().print(theDatabase.getUpc());
		} catch (Exception e) {
			log.error("Can't find enclosing Database for upc tag ", e);
			throw new JspTagException("Error: Can't find enclosing Database for upc tag ");
		}
		return SKIP_BODY;
	}
}

