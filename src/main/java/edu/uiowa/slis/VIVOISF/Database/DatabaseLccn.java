package edu.uiowa.slis.VIVOISF.Database;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatabaseLccn extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DatabaseLccn currentInstance = null;
	private static final Log log = LogFactory.getLog(DatabaseLccn.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DatabaseLccnIterator theDatabase = (DatabaseLccnIterator)findAncestorWithClass(this, DatabaseLccnIterator.class);
			pageContext.getOut().print(theDatabase.getLccn());
		} catch (Exception e) {
			log.error("Can't find enclosing Database for lccn tag ", e);
			throw new JspTagException("Error: Can't find enclosing Database for lccn tag ");
		}
		return SKIP_BODY;
	}
}

