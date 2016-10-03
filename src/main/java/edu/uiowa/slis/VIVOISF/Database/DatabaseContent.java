package edu.uiowa.slis.VIVOISF.Database;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatabaseContent extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DatabaseContent currentInstance = null;
	private static final Log log = LogFactory.getLog(DatabaseContent.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DatabaseContentIterator theDatabase = (DatabaseContentIterator)findAncestorWithClass(this, DatabaseContentIterator.class);
			pageContext.getOut().print(theDatabase.getContent());
		} catch (Exception e) {
			log.error("Can't find enclosing Database for content tag ", e);
			throw new JspTagException("Error: Can't find enclosing Database for content tag ");
		}
		return SKIP_BODY;
	}
}

