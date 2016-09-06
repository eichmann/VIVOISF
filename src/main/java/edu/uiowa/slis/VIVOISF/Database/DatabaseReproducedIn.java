package edu.uiowa.slis.VIVOISF.Database;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatabaseReproducedIn extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DatabaseReproducedIn currentInstance = null;
	private static final Log log = LogFactory.getLog(DatabaseReproducedIn.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DatabaseReproducedInIterator theDatabaseReproducedInIterator = (DatabaseReproducedInIterator)findAncestorWithClass(this, DatabaseReproducedInIterator.class);
			pageContext.getOut().print(theDatabaseReproducedInIterator.getReproducedIn());
		} catch (Exception e) {
			log.error("Can't find enclosing Database for reproducedIn tag ", e);
			throw new JspTagException("Error: Can't find enclosing Database for reproducedIn tag ");
		}
		return SKIP_BODY;
	}
}

