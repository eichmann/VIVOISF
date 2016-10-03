package edu.uiowa.slis.VIVOISF.Database;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatabaseSection extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DatabaseSection currentInstance = null;
	private static final Log log = LogFactory.getLog(DatabaseSection.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DatabaseSectionIterator theDatabase = (DatabaseSectionIterator)findAncestorWithClass(this, DatabaseSectionIterator.class);
			pageContext.getOut().print(theDatabase.getSection());
		} catch (Exception e) {
			log.error("Can't find enclosing Database for section tag ", e);
			throw new JspTagException("Error: Can't find enclosing Database for section tag ");
		}
		return SKIP_BODY;
	}
}

