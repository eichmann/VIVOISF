package edu.uiowa.slis.VIVOISF.Database;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatabaseEanucc13 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DatabaseEanucc13 currentInstance = null;
	private static final Log log = LogFactory.getLog(DatabaseEanucc13.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DatabaseEanucc13Iterator theDatabase = (DatabaseEanucc13Iterator)findAncestorWithClass(this, DatabaseEanucc13Iterator.class);
			pageContext.getOut().print(theDatabase.getEanucc13());
		} catch (Exception e) {
			log.error("Can't find enclosing Database for eanucc13 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Database for eanucc13 tag ");
		}
		return SKIP_BODY;
	}
}

