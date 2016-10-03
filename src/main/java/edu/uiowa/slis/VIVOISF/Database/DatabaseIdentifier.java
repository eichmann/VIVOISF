package edu.uiowa.slis.VIVOISF.Database;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatabaseIdentifier extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DatabaseIdentifier currentInstance = null;
	private static final Log log = LogFactory.getLog(DatabaseIdentifier.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DatabaseIdentifierIterator theDatabase = (DatabaseIdentifierIterator)findAncestorWithClass(this, DatabaseIdentifierIterator.class);
			pageContext.getOut().print(theDatabase.getIdentifier());
		} catch (Exception e) {
			log.error("Can't find enclosing Database for identifier tag ", e);
			throw new JspTagException("Error: Can't find enclosing Database for identifier tag ");
		}
		return SKIP_BODY;
	}
}

