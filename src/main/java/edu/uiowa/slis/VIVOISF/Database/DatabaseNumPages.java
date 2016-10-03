package edu.uiowa.slis.VIVOISF.Database;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatabaseNumPages extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DatabaseNumPages currentInstance = null;
	private static final Log log = LogFactory.getLog(DatabaseNumPages.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DatabaseNumPagesIterator theDatabase = (DatabaseNumPagesIterator)findAncestorWithClass(this, DatabaseNumPagesIterator.class);
			pageContext.getOut().print(theDatabase.getNumPages());
		} catch (Exception e) {
			log.error("Can't find enclosing Database for numPages tag ", e);
			throw new JspTagException("Error: Can't find enclosing Database for numPages tag ");
		}
		return SKIP_BODY;
	}
}

