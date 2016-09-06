package edu.uiowa.slis.VIVOISF.Database;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatabaseFeaturesType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DatabaseFeaturesType currentInstance = null;
	private static final Log log = LogFactory.getLog(DatabaseFeaturesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DatabaseFeaturesIterator theDatabaseFeaturesIterator = (DatabaseFeaturesIterator)findAncestorWithClass(this, DatabaseFeaturesIterator.class);
			pageContext.getOut().print(theDatabaseFeaturesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Database for features tag ", e);
			throw new JspTagException("Error: Can't find enclosing Database for features tag ");
		}
		return SKIP_BODY;
	}
}

