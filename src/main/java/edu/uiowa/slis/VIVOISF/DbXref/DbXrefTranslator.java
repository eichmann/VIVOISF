package edu.uiowa.slis.VIVOISF.DbXref;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DbXrefTranslator extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DbXrefTranslator currentInstance = null;
	private static final Log log = LogFactory.getLog(DbXrefTranslator.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DbXrefTranslatorIterator theDbXrefTranslatorIterator = (DbXrefTranslatorIterator)findAncestorWithClass(this, DbXrefTranslatorIterator.class);
			pageContext.getOut().print(theDbXrefTranslatorIterator.getTranslator());
		} catch (Exception e) {
			log.error("Can't find enclosing DbXref for translator tag ", e);
			throw new JspTagException("Error: Can't find enclosing DbXref for translator tag ");
		}
		return SKIP_BODY;
	}
}

