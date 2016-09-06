package edu.uiowa.slis.VIVOISF.Database;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatabaseTheAbstract extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DatabaseTheAbstract currentInstance = null;
	private static final Log log = LogFactory.getLog(DatabaseTheAbstract.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DatabaseTheAbstractIterator theDatabase = (DatabaseTheAbstractIterator)findAncestorWithClass(this, DatabaseTheAbstractIterator.class);
			pageContext.getOut().print(theDatabase.getTheAbstract());
		} catch (Exception e) {
			log.error("Can't find enclosing Database for theAbstract tag ", e);
			throw new JspTagException("Error: Can't find enclosing Database for theAbstract tag ");
		}
		return SKIP_BODY;
	}
}

