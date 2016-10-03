package edu.uiowa.slis.VIVOISF.Database;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatabaseIsbn13 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DatabaseIsbn13 currentInstance = null;
	private static final Log log = LogFactory.getLog(DatabaseIsbn13.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DatabaseIsbn13Iterator theDatabase = (DatabaseIsbn13Iterator)findAncestorWithClass(this, DatabaseIsbn13Iterator.class);
			pageContext.getOut().print(theDatabase.getIsbn13());
		} catch (Exception e) {
			log.error("Can't find enclosing Database for isbn13 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Database for isbn13 tag ");
		}
		return SKIP_BODY;
	}
}

