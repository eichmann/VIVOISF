package edu.uiowa.slis.VIVOISF.Database;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatabaseSubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DatabaseSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(DatabaseSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Database theDatabase = (Database)findAncestorWithClass(this, Database.class);
			if (!theDatabase.commitNeeded) {
				pageContext.getOut().print(theDatabase.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Database for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Database for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			Database theDatabase = (Database)findAncestorWithClass(this, Database.class);
			return theDatabase.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing Database for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Database for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			Database theDatabase = (Database)findAncestorWithClass(this, Database.class);
			theDatabase.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing Database for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Database for subjectURI tag ");
		}
	}
}

