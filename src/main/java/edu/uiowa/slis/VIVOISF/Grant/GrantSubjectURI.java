package edu.uiowa.slis.VIVOISF.Grant;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GrantSubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GrantSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(GrantSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Grant theGrant = (Grant)findAncestorWithClass(this, Grant.class);
			if (!theGrant.commitNeeded) {
				pageContext.getOut().print(theGrant.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Grant for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Grant for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			Grant theGrant = (Grant)findAncestorWithClass(this, Grant.class);
			return theGrant.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing Grant for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Grant for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			Grant theGrant = (Grant)findAncestorWithClass(this, Grant.class);
			theGrant.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing Grant for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Grant for subjectURI tag ");
		}
	}
}

