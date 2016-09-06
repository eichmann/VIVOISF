package edu.uiowa.slis.VIVOISF.Proceedings;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ProceedingsSubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ProceedingsSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(ProceedingsSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Proceedings theProceedings = (Proceedings)findAncestorWithClass(this, Proceedings.class);
			if (!theProceedings.commitNeeded) {
				pageContext.getOut().print(theProceedings.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Proceedings for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Proceedings for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			Proceedings theProceedings = (Proceedings)findAncestorWithClass(this, Proceedings.class);
			return theProceedings.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing Proceedings for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Proceedings for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			Proceedings theProceedings = (Proceedings)findAncestorWithClass(this, Proceedings.class);
			theProceedings.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing Proceedings for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Proceedings for subjectURI tag ");
		}
	}
}

