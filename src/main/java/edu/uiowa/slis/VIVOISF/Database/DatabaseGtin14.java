package edu.uiowa.slis.VIVOISF.Database;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatabaseGtin14 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DatabaseGtin14 currentInstance = null;
	private static final Log log = LogFactory.getLog(DatabaseGtin14.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DatabaseGtin14Iterator theDatabase = (DatabaseGtin14Iterator)findAncestorWithClass(this, DatabaseGtin14Iterator.class);
			pageContext.getOut().print(theDatabase.getGtin14());
		} catch (Exception e) {
			log.error("Can't find enclosing Database for gtin14 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Database for gtin14 tag ");
		}
		return SKIP_BODY;
	}
}

