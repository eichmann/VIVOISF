package edu.uiowa.slis.VIVOISF.Position;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PositionSubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PositionSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(PositionSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Position thePosition = (Position)findAncestorWithClass(this, Position.class);
			if (!thePosition.commitNeeded) {
				pageContext.getOut().print(thePosition.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Position for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Position for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			Position thePosition = (Position)findAncestorWithClass(this, Position.class);
			return thePosition.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing Position for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Position for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			Position thePosition = (Position)findAncestorWithClass(this, Position.class);
			thePosition.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing Position for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Position for subjectURI tag ");
		}
	}
}

