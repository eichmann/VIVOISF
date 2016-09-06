package edu.uiowa.slis.VIVOISF.DbXref;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DbXrefIAO_0000136 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DbXrefIAO_0000136 currentInstance = null;
	private static final Log log = LogFactory.getLog(DbXrefIAO_0000136.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DbXrefIAO_0000136Iterator theDbXrefIAO_0000136Iterator = (DbXrefIAO_0000136Iterator)findAncestorWithClass(this, DbXrefIAO_0000136Iterator.class);
			pageContext.getOut().print(theDbXrefIAO_0000136Iterator.getIAO_0000136());
		} catch (Exception e) {
			log.error("Can't find enclosing DbXref for IAO_0000136 tag ", e);
			throw new JspTagException("Error: Can't find enclosing DbXref for IAO_0000136 tag ");
		}
		return SKIP_BODY;
	}
}

