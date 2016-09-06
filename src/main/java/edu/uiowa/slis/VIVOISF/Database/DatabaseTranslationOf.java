package edu.uiowa.slis.VIVOISF.Database;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatabaseTranslationOf extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DatabaseTranslationOf currentInstance = null;
	private static final Log log = LogFactory.getLog(DatabaseTranslationOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DatabaseTranslationOfIterator theDatabaseTranslationOfIterator = (DatabaseTranslationOfIterator)findAncestorWithClass(this, DatabaseTranslationOfIterator.class);
			pageContext.getOut().print(theDatabaseTranslationOfIterator.getTranslationOf());
		} catch (Exception e) {
			log.error("Can't find enclosing Database for translationOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Database for translationOf tag ");
		}
		return SKIP_BODY;
	}
}

