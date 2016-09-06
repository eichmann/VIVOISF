package edu.uiowa.slis.VIVOISF.DbXref;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DbXrefLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DbXrefLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(DbXrefLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			DbXref theDbXref = (DbXref)findAncestorWithClass(this, DbXref.class);
			if (!theDbXref.commitNeeded) {
				pageContext.getOut().print(theDbXref.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing DbXref for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing DbXref for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			DbXref theDbXref = (DbXref)findAncestorWithClass(this, DbXref.class);
			return theDbXref.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing DbXref for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing DbXref for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			DbXref theDbXref = (DbXref)findAncestorWithClass(this, DbXref.class);
			theDbXref.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing DbXref for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing DbXref for label tag ");
		}
	}
}

