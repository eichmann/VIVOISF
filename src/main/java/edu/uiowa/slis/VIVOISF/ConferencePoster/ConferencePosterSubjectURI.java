package edu.uiowa.slis.VIVOISF.ConferencePoster;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePosterSubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePosterSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePosterSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			ConferencePoster theConferencePoster = (ConferencePoster)findAncestorWithClass(this, ConferencePoster.class);
			if (!theConferencePoster.commitNeeded) {
				pageContext.getOut().print(theConferencePoster.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePoster for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePoster for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			ConferencePoster theConferencePoster = (ConferencePoster)findAncestorWithClass(this, ConferencePoster.class);
			return theConferencePoster.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing ConferencePoster for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePoster for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			ConferencePoster theConferencePoster = (ConferencePoster)findAncestorWithClass(this, ConferencePoster.class);
			theConferencePoster.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePoster for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePoster for subjectURI tag ");
		}
	}
}

