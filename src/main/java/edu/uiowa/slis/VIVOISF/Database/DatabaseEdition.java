package edu.uiowa.slis.VIVOISF.Database;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatabaseEdition extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DatabaseEdition currentInstance = null;
	private static final Log log = LogFactory.getLog(DatabaseEdition.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DatabaseEditionIterator theDatabase = (DatabaseEditionIterator)findAncestorWithClass(this, DatabaseEditionIterator.class);
			pageContext.getOut().print(theDatabase.getEdition());
		} catch (Exception e) {
			log.error("Can't find enclosing Database for edition tag ", e);
			throw new JspTagException("Error: Can't find enclosing Database for edition tag ");
		}
		return SKIP_BODY;
	}
}

