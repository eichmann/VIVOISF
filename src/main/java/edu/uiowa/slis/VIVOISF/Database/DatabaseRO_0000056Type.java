package edu.uiowa.slis.VIVOISF.Database;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatabaseRO_0000056Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DatabaseRO_0000056Type currentInstance = null;
	private static final Log log = LogFactory.getLog(DatabaseRO_0000056Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DatabaseRO_0000056Iterator theDatabaseRO_0000056Iterator = (DatabaseRO_0000056Iterator)findAncestorWithClass(this, DatabaseRO_0000056Iterator.class);
			pageContext.getOut().print(theDatabaseRO_0000056Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Database for RO_0000056 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Database for RO_0000056 tag ");
		}
		return SKIP_BODY;
	}
}

