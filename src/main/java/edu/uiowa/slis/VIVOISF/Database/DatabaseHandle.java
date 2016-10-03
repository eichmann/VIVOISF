package edu.uiowa.slis.VIVOISF.Database;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatabaseHandle extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DatabaseHandle currentInstance = null;
	private static final Log log = LogFactory.getLog(DatabaseHandle.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DatabaseHandleIterator theDatabase = (DatabaseHandleIterator)findAncestorWithClass(this, DatabaseHandleIterator.class);
			pageContext.getOut().print(theDatabase.getHandle());
		} catch (Exception e) {
			log.error("Can't find enclosing Database for handle tag ", e);
			throw new JspTagException("Error: Can't find enclosing Database for handle tag ");
		}
		return SKIP_BODY;
	}
}

