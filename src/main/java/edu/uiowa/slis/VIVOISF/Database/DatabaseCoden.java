package edu.uiowa.slis.VIVOISF.Database;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatabaseCoden extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DatabaseCoden currentInstance = null;
	private static final Log log = LogFactory.getLog(DatabaseCoden.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DatabaseCodenIterator theDatabase = (DatabaseCodenIterator)findAncestorWithClass(this, DatabaseCodenIterator.class);
			pageContext.getOut().print(theDatabase.getCoden());
		} catch (Exception e) {
			log.error("Can't find enclosing Database for coden tag ", e);
			throw new JspTagException("Error: Can't find enclosing Database for coden tag ");
		}
		return SKIP_BODY;
	}
}

