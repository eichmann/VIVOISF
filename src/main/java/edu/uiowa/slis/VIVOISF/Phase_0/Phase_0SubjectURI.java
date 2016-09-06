package edu.uiowa.slis.VIVOISF.Phase_0;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class Phase_0SubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static Phase_0SubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(Phase_0SubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Phase_0 thePhase_0 = (Phase_0)findAncestorWithClass(this, Phase_0.class);
			if (!thePhase_0.commitNeeded) {
				pageContext.getOut().print(thePhase_0.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Phase_0 for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Phase_0 for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			Phase_0 thePhase_0 = (Phase_0)findAncestorWithClass(this, Phase_0.class);
			return thePhase_0.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing Phase_0 for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Phase_0 for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			Phase_0 thePhase_0 = (Phase_0)findAncestorWithClass(this, Phase_0.class);
			thePhase_0.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing Phase_0 for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Phase_0 for subjectURI tag ");
		}
	}
}

