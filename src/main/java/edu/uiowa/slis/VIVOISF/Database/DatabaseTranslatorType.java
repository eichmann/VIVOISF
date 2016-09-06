package edu.uiowa.slis.VIVOISF.Database;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatabaseTranslatorType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DatabaseTranslatorType currentInstance = null;
	private static final Log log = LogFactory.getLog(DatabaseTranslatorType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DatabaseTranslatorIterator theDatabaseTranslatorIterator = (DatabaseTranslatorIterator)findAncestorWithClass(this, DatabaseTranslatorIterator.class);
			pageContext.getOut().print(theDatabaseTranslatorIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Database for translator tag ", e);
			throw new JspTagException("Error: Can't find enclosing Database for translator tag ");
		}
		return SKIP_BODY;
	}
}

