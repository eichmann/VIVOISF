package edu.uiowa.slis.VIVOISF.DbXref;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DbXrefDoi extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DbXrefDoi currentInstance = null;
	private static final Log log = LogFactory.getLog(DbXrefDoi.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DbXrefDoiIterator theDbXref = (DbXrefDoiIterator)findAncestorWithClass(this, DbXrefDoiIterator.class);
			pageContext.getOut().print(theDbXref.getDoi());
		} catch (Exception e) {
			log.error("Can't find enclosing DbXref for doi tag ", e);
			throw new JspTagException("Error: Can't find enclosing DbXref for doi tag ");
		}
		return SKIP_BODY;
	}
}

