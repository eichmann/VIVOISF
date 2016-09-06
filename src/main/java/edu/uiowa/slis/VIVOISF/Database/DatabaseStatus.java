package edu.uiowa.slis.VIVOISF.Database;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatabaseStatus extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DatabaseStatus currentInstance = null;
	private static final Log log = LogFactory.getLog(DatabaseStatus.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DatabaseStatusIterator theDatabaseStatusIterator = (DatabaseStatusIterator)findAncestorWithClass(this, DatabaseStatusIterator.class);
			pageContext.getOut().print(theDatabaseStatusIterator.getStatus());
		} catch (Exception e) {
			log.error("Can't find enclosing Database for status tag ", e);
			throw new JspTagException("Error: Can't find enclosing Database for status tag ");
		}
		return SKIP_BODY;
	}
}

