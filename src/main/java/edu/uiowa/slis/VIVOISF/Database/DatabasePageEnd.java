package edu.uiowa.slis.VIVOISF.Database;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatabasePageEnd extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DatabasePageEnd currentInstance = null;
	private static final Log log = LogFactory.getLog(DatabasePageEnd.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DatabasePageEndIterator theDatabase = (DatabasePageEndIterator)findAncestorWithClass(this, DatabasePageEndIterator.class);
			pageContext.getOut().print(theDatabase.getPageEnd());
		} catch (Exception e) {
			log.error("Can't find enclosing Database for pageEnd tag ", e);
			throw new JspTagException("Error: Can't find enclosing Database for pageEnd tag ");
		}
		return SKIP_BODY;
	}
}

