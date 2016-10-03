package edu.uiowa.slis.VIVOISF.Database;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatabaseReviewOfType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DatabaseReviewOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(DatabaseReviewOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DatabaseReviewOfIterator theDatabaseReviewOfIterator = (DatabaseReviewOfIterator)findAncestorWithClass(this, DatabaseReviewOfIterator.class);
			pageContext.getOut().print(theDatabaseReviewOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Database for reviewOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Database for reviewOf tag ");
		}
		return SKIP_BODY;
	}
}

