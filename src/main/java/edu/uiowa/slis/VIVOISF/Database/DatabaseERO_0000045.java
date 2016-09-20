package edu.uiowa.slis.VIVOISF.Database;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatabaseERO_0000045 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DatabaseERO_0000045 currentInstance = null;
	private static final Log log = LogFactory.getLog(DatabaseERO_0000045.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DatabaseERO_0000045Iterator theDatabase = (DatabaseERO_0000045Iterator)findAncestorWithClass(this, DatabaseERO_0000045Iterator.class);
			pageContext.getOut().print(theDatabase.getERO_0000045());
		} catch (Exception e) {
			log.error("Can't find enclosing Database for ERO_0000045 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Database for ERO_0000045 tag ");
		}
		return SKIP_BODY;
	}
}

