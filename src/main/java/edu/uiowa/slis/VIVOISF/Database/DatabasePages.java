package edu.uiowa.slis.VIVOISF.Database;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatabasePages extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DatabasePages currentInstance = null;
	private static final Log log = LogFactory.getLog(DatabasePages.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DatabasePagesIterator theDatabase = (DatabasePagesIterator)findAncestorWithClass(this, DatabasePagesIterator.class);
			pageContext.getOut().print(theDatabase.getPages());
		} catch (Exception e) {
			log.error("Can't find enclosing Database for pages tag ", e);
			throw new JspTagException("Error: Can't find enclosing Database for pages tag ");
		}
		return SKIP_BODY;
	}
}

