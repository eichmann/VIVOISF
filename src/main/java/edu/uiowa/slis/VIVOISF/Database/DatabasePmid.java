package edu.uiowa.slis.VIVOISF.Database;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatabasePmid extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DatabasePmid currentInstance = null;
	private static final Log log = LogFactory.getLog(DatabasePmid.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DatabasePmidIterator theDatabase = (DatabasePmidIterator)findAncestorWithClass(this, DatabasePmidIterator.class);
			pageContext.getOut().print(theDatabase.getPmid());
		} catch (Exception e) {
			log.error("Can't find enclosing Database for pmid tag ", e);
			throw new JspTagException("Error: Can't find enclosing Database for pmid tag ");
		}
		return SKIP_BODY;
	}
}

