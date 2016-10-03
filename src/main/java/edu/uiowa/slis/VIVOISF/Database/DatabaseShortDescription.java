package edu.uiowa.slis.VIVOISF.Database;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatabaseShortDescription extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DatabaseShortDescription currentInstance = null;
	private static final Log log = LogFactory.getLog(DatabaseShortDescription.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DatabaseShortDescriptionIterator theDatabase = (DatabaseShortDescriptionIterator)findAncestorWithClass(this, DatabaseShortDescriptionIterator.class);
			pageContext.getOut().print(theDatabase.getShortDescription());
		} catch (Exception e) {
			log.error("Can't find enclosing Database for shortDescription tag ", e);
			throw new JspTagException("Error: Can't find enclosing Database for shortDescription tag ");
		}
		return SKIP_BODY;
	}
}

