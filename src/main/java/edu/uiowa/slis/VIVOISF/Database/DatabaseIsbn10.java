package edu.uiowa.slis.VIVOISF.Database;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatabaseIsbn10 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DatabaseIsbn10 currentInstance = null;
	private static final Log log = LogFactory.getLog(DatabaseIsbn10.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DatabaseIsbn10Iterator theDatabase = (DatabaseIsbn10Iterator)findAncestorWithClass(this, DatabaseIsbn10Iterator.class);
			pageContext.getOut().print(theDatabase.getIsbn10());
		} catch (Exception e) {
			log.error("Can't find enclosing Database for isbn10 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Database for isbn10 tag ");
		}
		return SKIP_BODY;
	}
}

