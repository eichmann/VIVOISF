package edu.uiowa.slis.VIVOISF.Center;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CenterSubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CenterSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(CenterSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Center theCenter = (Center)findAncestorWithClass(this, Center.class);
			if (!theCenter.commitNeeded) {
				pageContext.getOut().print(theCenter.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Center for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Center for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			Center theCenter = (Center)findAncestorWithClass(this, Center.class);
			return theCenter.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing Center for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Center for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			Center theCenter = (Center)findAncestorWithClass(this, Center.class);
			theCenter.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing Center for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Center for subjectURI tag ");
		}
	}
}

