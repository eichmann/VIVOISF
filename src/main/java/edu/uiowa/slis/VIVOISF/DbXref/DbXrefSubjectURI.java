package edu.uiowa.slis.VIVOISF.DbXref;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DbXrefSubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DbXrefSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(DbXrefSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			DbXref theDbXref = (DbXref)findAncestorWithClass(this, DbXref.class);
			if (!theDbXref.commitNeeded) {
				pageContext.getOut().print(theDbXref.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing DbXref for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing DbXref for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			DbXref theDbXref = (DbXref)findAncestorWithClass(this, DbXref.class);
			return theDbXref.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing DbXref for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing DbXref for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			DbXref theDbXref = (DbXref)findAncestorWithClass(this, DbXref.class);
			theDbXref.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing DbXref for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing DbXref for subjectURI tag ");
		}
	}
}

