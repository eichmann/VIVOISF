package edu.uiowa.slis.VIVOISF.Database;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatabaseIAO_0000136 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DatabaseIAO_0000136 currentInstance = null;
	private static final Log log = LogFactory.getLog(DatabaseIAO_0000136.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DatabaseIAO_0000136Iterator theDatabaseIAO_0000136Iterator = (DatabaseIAO_0000136Iterator)findAncestorWithClass(this, DatabaseIAO_0000136Iterator.class);
			pageContext.getOut().print(theDatabaseIAO_0000136Iterator.getIAO_0000136());
		} catch (Exception e) {
			log.error("Can't find enclosing Database for IAO_0000136 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Database for IAO_0000136 tag ");
		}
		return SKIP_BODY;
	}
}

