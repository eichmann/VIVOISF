package edu.uiowa.slis.VIVOISF.ThesisDegree;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThesisDegreeSubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ThesisDegreeSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(ThesisDegreeSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			ThesisDegree theThesisDegree = (ThesisDegree)findAncestorWithClass(this, ThesisDegree.class);
			if (!theThesisDegree.commitNeeded) {
				pageContext.getOut().print(theThesisDegree.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing ThesisDegree for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing ThesisDegree for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			ThesisDegree theThesisDegree = (ThesisDegree)findAncestorWithClass(this, ThesisDegree.class);
			return theThesisDegree.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing ThesisDegree for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing ThesisDegree for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			ThesisDegree theThesisDegree = (ThesisDegree)findAncestorWithClass(this, ThesisDegree.class);
			theThesisDegree.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing ThesisDegree for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing ThesisDegree for subjectURI tag ");
		}
	}
}

