package edu.uiowa.slis.VIVOISF.Brief;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BriefSubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BriefSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(BriefSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Brief theBrief = (Brief)findAncestorWithClass(this, Brief.class);
			if (!theBrief.commitNeeded) {
				pageContext.getOut().print(theBrief.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Brief for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Brief for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			Brief theBrief = (Brief)findAncestorWithClass(this, Brief.class);
			return theBrief.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing Brief for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Brief for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			Brief theBrief = (Brief)findAncestorWithClass(this, Brief.class);
			theBrief.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing Brief for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Brief for subjectURI tag ");
		}
	}
}

