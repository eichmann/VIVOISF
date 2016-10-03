package edu.uiowa.slis.VIVOISF.Database;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatabaseDistributor extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DatabaseDistributor currentInstance = null;
	private static final Log log = LogFactory.getLog(DatabaseDistributor.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DatabaseDistributorIterator theDatabaseDistributorIterator = (DatabaseDistributorIterator)findAncestorWithClass(this, DatabaseDistributorIterator.class);
			pageContext.getOut().print(theDatabaseDistributorIterator.getDistributor());
		} catch (Exception e) {
			log.error("Can't find enclosing Database for distributor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Database for distributor tag ");
		}
		return SKIP_BODY;
	}
}

