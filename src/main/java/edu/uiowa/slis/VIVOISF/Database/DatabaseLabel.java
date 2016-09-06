package edu.uiowa.slis.VIVOISF.Database;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatabaseLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DatabaseLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(DatabaseLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Database theDatabase = (Database)findAncestorWithClass(this, Database.class);
			if (!theDatabase.commitNeeded) {
				pageContext.getOut().print(theDatabase.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Database for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Database for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			Database theDatabase = (Database)findAncestorWithClass(this, Database.class);
			return theDatabase.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing Database for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Database for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			Database theDatabase = (Database)findAncestorWithClass(this, Database.class);
			theDatabase.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing Database for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Database for label tag ");
		}
	}
}

