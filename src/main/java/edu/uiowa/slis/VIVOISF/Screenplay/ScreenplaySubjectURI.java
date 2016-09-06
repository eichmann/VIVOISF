package edu.uiowa.slis.VIVOISF.Screenplay;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ScreenplaySubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ScreenplaySubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(ScreenplaySubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Screenplay theScreenplay = (Screenplay)findAncestorWithClass(this, Screenplay.class);
			if (!theScreenplay.commitNeeded) {
				pageContext.getOut().print(theScreenplay.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Screenplay for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Screenplay for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			Screenplay theScreenplay = (Screenplay)findAncestorWithClass(this, Screenplay.class);
			return theScreenplay.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing Screenplay for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Screenplay for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			Screenplay theScreenplay = (Screenplay)findAncestorWithClass(this, Screenplay.class);
			theScreenplay.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing Screenplay for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Screenplay for subjectURI tag ");
		}
	}
}

