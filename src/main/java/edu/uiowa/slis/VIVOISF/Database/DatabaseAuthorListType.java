package edu.uiowa.slis.VIVOISF.Database;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatabaseAuthorListType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DatabaseAuthorListType currentInstance = null;
	private static final Log log = LogFactory.getLog(DatabaseAuthorListType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DatabaseAuthorListIterator theDatabaseAuthorListIterator = (DatabaseAuthorListIterator)findAncestorWithClass(this, DatabaseAuthorListIterator.class);
			pageContext.getOut().print(theDatabaseAuthorListIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Database for authorList tag ", e);
			throw new JspTagException("Error: Can't find enclosing Database for authorList tag ");
		}
		return SKIP_BODY;
	}
}

