package edu.uiowa.slis.VIVOISF.Database;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatabasePageStart extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DatabasePageStart currentInstance = null;
	private static final Log log = LogFactory.getLog(DatabasePageStart.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DatabasePageStartIterator theDatabase = (DatabasePageStartIterator)findAncestorWithClass(this, DatabasePageStartIterator.class);
			pageContext.getOut().print(theDatabase.getPageStart());
		} catch (Exception e) {
			log.error("Can't find enclosing Database for pageStart tag ", e);
			throw new JspTagException("Error: Can't find enclosing Database for pageStart tag ");
		}
		return SKIP_BODY;
	}
}

