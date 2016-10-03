package edu.uiowa.slis.VIVOISF.Database;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatabaseAsin extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DatabaseAsin currentInstance = null;
	private static final Log log = LogFactory.getLog(DatabaseAsin.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DatabaseAsinIterator theDatabase = (DatabaseAsinIterator)findAncestorWithClass(this, DatabaseAsinIterator.class);
			pageContext.getOut().print(theDatabase.getAsin());
		} catch (Exception e) {
			log.error("Can't find enclosing Database for asin tag ", e);
			throw new JspTagException("Error: Can't find enclosing Database for asin tag ");
		}
		return SKIP_BODY;
	}
}

