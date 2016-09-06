package edu.uiowa.slis.VIVOISF.Database;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatabaseReproducedInType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DatabaseReproducedInType currentInstance = null;
	private static final Log log = LogFactory.getLog(DatabaseReproducedInType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DatabaseReproducedInIterator theDatabaseReproducedInIterator = (DatabaseReproducedInIterator)findAncestorWithClass(this, DatabaseReproducedInIterator.class);
			pageContext.getOut().print(theDatabaseReproducedInIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Database for reproducedIn tag ", e);
			throw new JspTagException("Error: Can't find enclosing Database for reproducedIn tag ");
		}
		return SKIP_BODY;
	}
}

