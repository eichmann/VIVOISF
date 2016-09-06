package edu.uiowa.slis.VIVOISF.DbXref;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DbXrefRO_0000056Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DbXrefRO_0000056Type currentInstance = null;
	private static final Log log = LogFactory.getLog(DbXrefRO_0000056Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DbXrefRO_0000056Iterator theDbXrefRO_0000056Iterator = (DbXrefRO_0000056Iterator)findAncestorWithClass(this, DbXrefRO_0000056Iterator.class);
			pageContext.getOut().print(theDbXrefRO_0000056Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing DbXref for RO_0000056 tag ", e);
			throw new JspTagException("Error: Can't find enclosing DbXref for RO_0000056 tag ");
		}
		return SKIP_BODY;
	}
}

