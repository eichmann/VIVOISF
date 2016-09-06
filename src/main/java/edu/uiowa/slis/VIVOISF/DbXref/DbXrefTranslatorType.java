package edu.uiowa.slis.VIVOISF.DbXref;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DbXrefTranslatorType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DbXrefTranslatorType currentInstance = null;
	private static final Log log = LogFactory.getLog(DbXrefTranslatorType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DbXrefTranslatorIterator theDbXrefTranslatorIterator = (DbXrefTranslatorIterator)findAncestorWithClass(this, DbXrefTranslatorIterator.class);
			pageContext.getOut().print(theDbXrefTranslatorIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing DbXref for translator tag ", e);
			throw new JspTagException("Error: Can't find enclosing DbXref for translator tag ");
		}
		return SKIP_BODY;
	}
}

