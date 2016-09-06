package edu.uiowa.slis.VIVOISF.ConferencePaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePaperSubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePaperSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePaperSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			ConferencePaper theConferencePaper = (ConferencePaper)findAncestorWithClass(this, ConferencePaper.class);
			if (!theConferencePaper.commitNeeded) {
				pageContext.getOut().print(theConferencePaper.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePaper for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePaper for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			ConferencePaper theConferencePaper = (ConferencePaper)findAncestorWithClass(this, ConferencePaper.class);
			return theConferencePaper.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing ConferencePaper for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePaper for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			ConferencePaper theConferencePaper = (ConferencePaper)findAncestorWithClass(this, ConferencePaper.class);
			theConferencePaper.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePaper for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePaper for subjectURI tag ");
		}
	}
}

