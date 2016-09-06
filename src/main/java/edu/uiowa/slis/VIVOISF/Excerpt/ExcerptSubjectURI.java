package edu.uiowa.slis.VIVOISF.Excerpt;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ExcerptSubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ExcerptSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(ExcerptSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Excerpt theExcerpt = (Excerpt)findAncestorWithClass(this, Excerpt.class);
			if (!theExcerpt.commitNeeded) {
				pageContext.getOut().print(theExcerpt.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Excerpt for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Excerpt for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			Excerpt theExcerpt = (Excerpt)findAncestorWithClass(this, Excerpt.class);
			return theExcerpt.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing Excerpt for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Excerpt for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			Excerpt theExcerpt = (Excerpt)findAncestorWithClass(this, Excerpt.class);
			theExcerpt.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing Excerpt for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Excerpt for subjectURI tag ");
		}
	}
}

