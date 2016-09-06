package edu.uiowa.slis.VIVOISF.AwardedDegree;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AwardedDegreeSubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AwardedDegreeSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(AwardedDegreeSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			AwardedDegree theAwardedDegree = (AwardedDegree)findAncestorWithClass(this, AwardedDegree.class);
			if (!theAwardedDegree.commitNeeded) {
				pageContext.getOut().print(theAwardedDegree.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing AwardedDegree for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing AwardedDegree for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			AwardedDegree theAwardedDegree = (AwardedDegree)findAncestorWithClass(this, AwardedDegree.class);
			return theAwardedDegree.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing AwardedDegree for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing AwardedDegree for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			AwardedDegree theAwardedDegree = (AwardedDegree)findAncestorWithClass(this, AwardedDegree.class);
			theAwardedDegree.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing AwardedDegree for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing AwardedDegree for subjectURI tag ");
		}
	}
}

