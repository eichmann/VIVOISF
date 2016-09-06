package edu.uiowa.slis.VIVOISF.PrimaryPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PrimaryPositionSubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PrimaryPositionSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(PrimaryPositionSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			PrimaryPosition thePrimaryPosition = (PrimaryPosition)findAncestorWithClass(this, PrimaryPosition.class);
			if (!thePrimaryPosition.commitNeeded) {
				pageContext.getOut().print(thePrimaryPosition.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing PrimaryPosition for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing PrimaryPosition for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			PrimaryPosition thePrimaryPosition = (PrimaryPosition)findAncestorWithClass(this, PrimaryPosition.class);
			return thePrimaryPosition.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing PrimaryPosition for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing PrimaryPosition for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			PrimaryPosition thePrimaryPosition = (PrimaryPosition)findAncestorWithClass(this, PrimaryPosition.class);
			thePrimaryPosition.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing PrimaryPosition for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing PrimaryPosition for subjectURI tag ");
		}
	}
}

