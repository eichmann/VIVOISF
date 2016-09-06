package edu.uiowa.slis.VIVOISF.Me;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MeSubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static MeSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(MeSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Me theMe = (Me)findAncestorWithClass(this, Me.class);
			if (!theMe.commitNeeded) {
				pageContext.getOut().print(theMe.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Me for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Me for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			Me theMe = (Me)findAncestorWithClass(this, Me.class);
			return theMe.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing Me for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Me for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			Me theMe = (Me)findAncestorWithClass(this, Me.class);
			theMe.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing Me for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Me for subjectURI tag ");
		}
	}
}

