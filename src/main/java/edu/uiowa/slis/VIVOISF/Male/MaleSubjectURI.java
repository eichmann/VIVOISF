package edu.uiowa.slis.VIVOISF.Male;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MaleSubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static MaleSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(MaleSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Male theMale = (Male)findAncestorWithClass(this, Male.class);
			if (!theMale.commitNeeded) {
				pageContext.getOut().print(theMale.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Male for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Male for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			Male theMale = (Male)findAncestorWithClass(this, Male.class);
			return theMale.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing Male for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Male for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			Male theMale = (Male)findAncestorWithClass(this, Male.class);
			theMale.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing Male for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Male for subjectURI tag ");
		}
	}
}

