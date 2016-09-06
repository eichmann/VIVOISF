package edu.uiowa.slis.VIVOISF.Database;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatabaseDoi extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DatabaseDoi currentInstance = null;
	private static final Log log = LogFactory.getLog(DatabaseDoi.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DatabaseDoiIterator theDatabase = (DatabaseDoiIterator)findAncestorWithClass(this, DatabaseDoiIterator.class);
			pageContext.getOut().print(theDatabase.getDoi());
		} catch (Exception e) {
			log.error("Can't find enclosing Database for doi tag ", e);
			throw new JspTagException("Error: Can't find enclosing Database for doi tag ");
		}
		return SKIP_BODY;
	}
}

