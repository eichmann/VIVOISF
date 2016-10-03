package edu.uiowa.slis.VIVOISF.Database;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatabaseOclcnum extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DatabaseOclcnum currentInstance = null;
	private static final Log log = LogFactory.getLog(DatabaseOclcnum.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DatabaseOclcnumIterator theDatabase = (DatabaseOclcnumIterator)findAncestorWithClass(this, DatabaseOclcnumIterator.class);
			pageContext.getOut().print(theDatabase.getOclcnum());
		} catch (Exception e) {
			log.error("Can't find enclosing Database for oclcnum tag ", e);
			throw new JspTagException("Error: Can't find enclosing Database for oclcnum tag ");
		}
		return SKIP_BODY;
	}
}

