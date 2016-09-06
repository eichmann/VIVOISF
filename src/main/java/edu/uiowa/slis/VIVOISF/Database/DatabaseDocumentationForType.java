package edu.uiowa.slis.VIVOISF.Database;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatabaseDocumentationForType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DatabaseDocumentationForType currentInstance = null;
	private static final Log log = LogFactory.getLog(DatabaseDocumentationForType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DatabaseDocumentationForIterator theDatabaseDocumentationForIterator = (DatabaseDocumentationForIterator)findAncestorWithClass(this, DatabaseDocumentationForIterator.class);
			pageContext.getOut().print(theDatabaseDocumentationForIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Database for documentationFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Database for documentationFor tag ");
		}
		return SKIP_BODY;
	}
}

