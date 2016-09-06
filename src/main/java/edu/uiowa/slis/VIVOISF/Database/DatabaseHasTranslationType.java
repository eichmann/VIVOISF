package edu.uiowa.slis.VIVOISF.Database;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatabaseHasTranslationType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DatabaseHasTranslationType currentInstance = null;
	private static final Log log = LogFactory.getLog(DatabaseHasTranslationType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DatabaseHasTranslationIterator theDatabaseHasTranslationIterator = (DatabaseHasTranslationIterator)findAncestorWithClass(this, DatabaseHasTranslationIterator.class);
			pageContext.getOut().print(theDatabaseHasTranslationIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Database for hasTranslation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Database for hasTranslation tag ");
		}
		return SKIP_BODY;
	}
}

