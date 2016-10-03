package edu.uiowa.slis.VIVOISF.Database;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatabaseIssuer extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DatabaseIssuer currentInstance = null;
	private static final Log log = LogFactory.getLog(DatabaseIssuer.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DatabaseIssuerIterator theDatabaseIssuerIterator = (DatabaseIssuerIterator)findAncestorWithClass(this, DatabaseIssuerIterator.class);
			pageContext.getOut().print(theDatabaseIssuerIterator.getIssuer());
		} catch (Exception e) {
			log.error("Can't find enclosing Database for issuer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Database for issuer tag ");
		}
		return SKIP_BODY;
	}
}

