package edu.uiowa.slis.VIVOISF.Database;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatabaseInformationResourceSupportedByType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DatabaseInformationResourceSupportedByType currentInstance = null;
	private static final Log log = LogFactory.getLog(DatabaseInformationResourceSupportedByType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DatabaseInformationResourceSupportedByIterator theDatabaseInformationResourceSupportedByIterator = (DatabaseInformationResourceSupportedByIterator)findAncestorWithClass(this, DatabaseInformationResourceSupportedByIterator.class);
			pageContext.getOut().print(theDatabaseInformationResourceSupportedByIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Database for informationResourceSupportedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Database for informationResourceSupportedBy tag ");
		}
		return SKIP_BODY;
	}
}

