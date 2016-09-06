package edu.uiowa.slis.VIVOISF.Database;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatabaseInformationResourceSupportedBy extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DatabaseInformationResourceSupportedBy currentInstance = null;
	private static final Log log = LogFactory.getLog(DatabaseInformationResourceSupportedBy.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DatabaseInformationResourceSupportedByIterator theDatabaseInformationResourceSupportedByIterator = (DatabaseInformationResourceSupportedByIterator)findAncestorWithClass(this, DatabaseInformationResourceSupportedByIterator.class);
			pageContext.getOut().print(theDatabaseInformationResourceSupportedByIterator.getInformationResourceSupportedBy());
		} catch (Exception e) {
			log.error("Can't find enclosing Database for informationResourceSupportedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Database for informationResourceSupportedBy tag ");
		}
		return SKIP_BODY;
	}
}

