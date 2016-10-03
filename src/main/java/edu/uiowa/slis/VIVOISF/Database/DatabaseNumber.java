package edu.uiowa.slis.VIVOISF.Database;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatabaseNumber extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DatabaseNumber currentInstance = null;
	private static final Log log = LogFactory.getLog(DatabaseNumber.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DatabaseNumberIterator theDatabase = (DatabaseNumberIterator)findAncestorWithClass(this, DatabaseNumberIterator.class);
			pageContext.getOut().print(theDatabase.getNumber());
		} catch (Exception e) {
			log.error("Can't find enclosing Database for number tag ", e);
			throw new JspTagException("Error: Can't find enclosing Database for number tag ");
		}
		return SKIP_BODY;
	}
}

