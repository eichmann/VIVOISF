package edu.uiowa.slis.VIVOISF.UO_0000280;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class UO_0000280SubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static UO_0000280SubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(UO_0000280SubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			UO_0000280 theUO_0000280 = (UO_0000280)findAncestorWithClass(this, UO_0000280.class);
			if (!theUO_0000280.commitNeeded) {
				pageContext.getOut().print(theUO_0000280.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing UO_0000280 for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing UO_0000280 for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			UO_0000280 theUO_0000280 = (UO_0000280)findAncestorWithClass(this, UO_0000280.class);
			return theUO_0000280.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing UO_0000280 for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing UO_0000280 for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			UO_0000280 theUO_0000280 = (UO_0000280)findAncestorWithClass(this, UO_0000280.class);
			theUO_0000280.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing UO_0000280 for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing UO_0000280 for subjectURI tag ");
		}
	}
}

