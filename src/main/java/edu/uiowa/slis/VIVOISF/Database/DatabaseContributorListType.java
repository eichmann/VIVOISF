package edu.uiowa.slis.VIVOISF.Database;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatabaseContributorListType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DatabaseContributorListType currentInstance = null;
	private static final Log log = LogFactory.getLog(DatabaseContributorListType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DatabaseContributorListIterator theDatabaseContributorListIterator = (DatabaseContributorListIterator)findAncestorWithClass(this, DatabaseContributorListIterator.class);
			pageContext.getOut().print(theDatabaseContributorListIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Database for contributorList tag ", e);
			throw new JspTagException("Error: Can't find enclosing Database for contributorList tag ");
		}
		return SKIP_BODY;
	}
}

