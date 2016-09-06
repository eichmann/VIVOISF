package edu.uiowa.slis.VIVOISF.Female;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FemaleSubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FemaleSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(FemaleSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Female theFemale = (Female)findAncestorWithClass(this, Female.class);
			if (!theFemale.commitNeeded) {
				pageContext.getOut().print(theFemale.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Female for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Female for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			Female theFemale = (Female)findAncestorWithClass(this, Female.class);
			return theFemale.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing Female for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Female for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			Female theFemale = (Female)findAncestorWithClass(this, Female.class);
			theFemale.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing Female for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Female for subjectURI tag ");
		}
	}
}

