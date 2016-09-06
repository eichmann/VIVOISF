package edu.uiowa.slis.VIVOISF.Database;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatabaseReproduces extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DatabaseReproduces currentInstance = null;
	private static final Log log = LogFactory.getLog(DatabaseReproduces.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DatabaseReproducesIterator theDatabaseReproducesIterator = (DatabaseReproducesIterator)findAncestorWithClass(this, DatabaseReproducesIterator.class);
			pageContext.getOut().print(theDatabaseReproducesIterator.getReproduces());
		} catch (Exception e) {
			log.error("Can't find enclosing Database for reproduces tag ", e);
			throw new JspTagException("Error: Can't find enclosing Database for reproduces tag ");
		}
		return SKIP_BODY;
	}
}

