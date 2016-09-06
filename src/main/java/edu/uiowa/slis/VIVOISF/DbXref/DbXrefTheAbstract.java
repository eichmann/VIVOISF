package edu.uiowa.slis.VIVOISF.DbXref;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DbXrefTheAbstract extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DbXrefTheAbstract currentInstance = null;
	private static final Log log = LogFactory.getLog(DbXrefTheAbstract.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DbXrefTheAbstractIterator theDbXref = (DbXrefTheAbstractIterator)findAncestorWithClass(this, DbXrefTheAbstractIterator.class);
			pageContext.getOut().print(theDbXref.getTheAbstract());
		} catch (Exception e) {
			log.error("Can't find enclosing DbXref for theAbstract tag ", e);
			throw new JspTagException("Error: Can't find enclosing DbXref for theAbstract tag ");
		}
		return SKIP_BODY;
	}
}

