package edu.uiowa.slis.VIVOISF.Database;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatabasePresentedAt extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DatabasePresentedAt currentInstance = null;
	private static final Log log = LogFactory.getLog(DatabasePresentedAt.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DatabasePresentedAtIterator theDatabasePresentedAtIterator = (DatabasePresentedAtIterator)findAncestorWithClass(this, DatabasePresentedAtIterator.class);
			pageContext.getOut().print(theDatabasePresentedAtIterator.getPresentedAt());
		} catch (Exception e) {
			log.error("Can't find enclosing Database for presentedAt tag ", e);
			throw new JspTagException("Error: Can't find enclosing Database for presentedAt tag ");
		}
		return SKIP_BODY;
	}
}

