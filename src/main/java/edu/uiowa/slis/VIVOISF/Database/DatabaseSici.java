package edu.uiowa.slis.VIVOISF.Database;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatabaseSici extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DatabaseSici currentInstance = null;
	private static final Log log = LogFactory.getLog(DatabaseSici.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DatabaseSiciIterator theDatabase = (DatabaseSiciIterator)findAncestorWithClass(this, DatabaseSiciIterator.class);
			pageContext.getOut().print(theDatabase.getSici());
		} catch (Exception e) {
			log.error("Can't find enclosing Database for sici tag ", e);
			throw new JspTagException("Error: Can't find enclosing Database for sici tag ");
		}
		return SKIP_BODY;
	}
}

